import java.util.*;

class starter{
    public static void main(String[] args){
        System.out.println("Welcome to Minesweeper!");
        System.out.println("On the grid, 9 means untouched space.");
        System.out.println("Any other number means how many bombs are adjacent to the square.");
        System.out.println("Clear all empty spots and don't touch the bombs!");
        System.out.println();
        
        System.out.println("How difficult would you like the game?");
        System.out.println("1 - Easy (10 bombs)");
        System.out.println("2 - Medium (25 bombs)");
        System.out.println("3 - Hard (40 bombs)");
        System.out.println("4 - Impossible (99 bombs)");
        
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        if(diff == 1) {
            diff = 10;
        }
        else if(diff == 2) {
            diff = 25;
        }
        else if(diff == 3) {
            diff = 40;
        }
        else if(diff == 4) {
            diff = 99;
        }
        
        int[][] guessGrid = new int[10][10];
        for(int i = 0; i < guessGrid.length; i++){
            for(int j = 0; j < guessGrid[0].length; j++){
                guessGrid[i][j] = 9;
            }
        }
        
        
        int[][] bombProxGrid = new int[10][10];
        mapSetUp(diff, bombProxGrid);
        printGrid(guessGrid);
        System.out.println("-------------------------------------");

        boolean alive = true;
        while(alive){
            System.out.print("Please enter a row: ");
            int r = sc.nextInt();
            System.out.print("Please enter a col: ");
            int c = sc.nextInt();
            
            boolean boom = move(r, c, bombProxGrid);
            if(boom){
                System.out.println("-------------------------------------");
                System.out.println("You've hit a bomb! Better luck next time!");
                printGrid(bombProxGrid);
                break;
            }
            reveal(r, c, guessGrid, bombProxGrid);
            System.out.println("-------------------------------------");
            if(checkWin(guessGrid, bombProxGrid)){
                System.out.println("You won! Congratz!");
                break;
            }
        }
    }
    
    /*
        This method should completely generate a grid of bombs and adjacent values
        EX:
            0 1 9 1 0 2 9 2 0 0 
            0 1 1 1 0 2 9 2 1 1 
            0 0 0 0 0 2 2 2 1 9 
            0 0 0 0 0 1 9 2 3 3 
            1 1 1 0 0 1 1 2 9 9 
            1 9 1 0 0 0 0 1 2 2 
            1 1 1 0 0 0 0 0 0 0 
            0 0 1 1 1 0 0 0 0 0 
            1 1 2 9 1 0 0 0 0 0 
            1 9 2 1 1 0 0 0 0 0 
            
        Start by defining how many bombs the difficulty states.
        
        There are 2 steps to this:
        1. Generate bombs randomly
        2. Generate all the adjacent values in a grid
        
        For step 1:
        - Create a loop that goes until there are no more bombs to place
        - Within that, iterate through the entire 2D array and place bombs
            - To place a bomb randomly, this should be a 1 in 10 chance to place a bomb
                - All bombs should be the value 9
            - Make sure to not place bombs on bombs that are already there
            - When a bomb is placed, make sure to track that for your outer loop
        - This should loop through the 2D array over and over until ALL bombs have been placed
        
        For step 2:
        - Loop through the 2D array
            - For every bomb, call the add adjacent method,  
    */
    public static void mapSetUp(int diff, int [][] bombProxGrid){
        int xrand;
        int yrand;
        for(int x = 0; x < diff; x++) {
            xrand = (int)(Math.random()*bombProxGrid.length);
            yrand = (int)(Math.random()*bombProxGrid[0].length);
            if(bombProxGrid[xrand][yrand] == 9) {
                xrand = (int)(Math.random()*bombProxGrid.length);
                yrand = (int)(Math.random()*bombProxGrid[0].length);
            }
            bombProxGrid[xrand][yrand] = 9;
            addAdj(xrand, yrand, bombProxGrid);
        }
        
        for(int x = 0; x < bombProxGrid.length; x++) {
            for(int y = 0; y < bombProxGrid[0].length; y++) {
                System.out.print(bombProxGrid[x][y] + " ");
            }
            System.out.println();
        }
    }
    
    /*
        Add adjacent values to each location
        Key Concept -> In a compound boolean, if the first evaluation of an && is false, the statement will STOP immediately
        
        - Using the given parameters of row and column, check first if the location is value
        - Check there isn't a bomb in the current location
        - Then add to the location to say there is a bomb adjacent
        
    */
    public static void addAdj(int xrand, int yrand, int [][] bombProxGrid){
        if(xrand - 1 < 0) {
            if (yrand - 1 < 0) {
                bombProxGrid[xrand][yrand + 1] += 1;
                bombProxGrid[xrand + 1][yrand] += 1;
                bombProxGrid[xrand + 1][yrand + 1] += 1;
            }
            else if (yrand + 1 > bombProxGrid[0].length - 1) {
                bombProxGrid[xrand][yrand - 1] += 1;
                bombProxGrid[xrand + 1][yrand] += 1;
                bombProxGrid[xrand + 1][yrand - 1] += 1;
            }
            else {
                bombProxGrid[xrand][yrand - 1] += 1;
                bombProxGrid[xrand][yrand + 1] += 1;
                bombProxGrid[xrand + 1][yrand] += 1;
                bombProxGrid[xrand + 1][yrand + 1] += 1;
                bombProxGrid[xrand + 1][yrand - 1] += 1;
            }
        }
        else if(xrand + 1 > bombProxGrid.length - 1) {
            if (yrand - 1 < 0) {
                bombProxGrid[xrand][yrand + 1] += 1;
                bombProxGrid[xrand - 1][yrand] += 1;
                bombProxGrid[xrand - 1][yrand + 1] += 1;
            }
            else if (yrand + 1 > bombProxGrid[0].length - 1) {
                bombProxGrid[xrand][yrand - 1] += 1;
                bombProxGrid[xrand - 1][yrand] += 1;
                bombProxGrid[xrand - 1][yrand - 1] += 1;
            }
            else {
                bombProxGrid[xrand][yrand - 1] += 1;
                bombProxGrid[xrand][yrand + 1] += 1;
                bombProxGrid[xrand - 1][yrand] += 1;
                bombProxGrid[xrand - 1][yrand + 1] += 1;
                bombProxGrid[xrand - 1][yrand - 1] += 1;
            }
        }
        else if(yrand - 1 < 0) {
            bombProxGrid[xrand][yrand + 1] += 1;
            bombProxGrid[xrand + 1][yrand + 1] += 1;
            bombProxGrid[xrand + 1][yrand] += 1;
            bombProxGrid[xrand - 1][yrand + 1] += 1;
            bombProxGrid[xrand - 1][yrand] += 1;
        }
        else if(yrand + 1 > bombProxGrid[0].length - 1) {
            bombProxGrid[xrand][yrand - 1] += 1;
            bombProxGrid[xrand + 1][yrand - 1] += 1;
            bombProxGrid[xrand + 1][yrand] += 1;
            bombProxGrid[xrand - 1][yrand - 1] += 1;
            bombProxGrid[xrand - 1][yrand] += 1;
        }
        else {
            bombProxGrid[xrand][yrand - 1] += 1;
            bombProxGrid[xrand][yrand + 1] += 1;
            bombProxGrid[xrand + 1][yrand] += 1;
            bombProxGrid[xrand - 1][yrand] += 1;
            bombProxGrid[xrand - 1][yrand + 1] += 1;
            bombProxGrid[xrand - 1][yrand - 1] += 1;
            bombProxGrid[xrand + 1][yrand + 1] += 1;
            bombProxGrid[xrand + 1][yrand - 1] += 1;
        }
        for(int x = 0; x < bombProxGrid.length; x ++) {
            for(int y = 0; y < bombProxGrid[0].length; y++) {
                if(bombProxGrid[x][y] > 9) {
                    bombProxGrid[x][y] = 9;
                }
            }
        }
    }
    
    /*
        Checks if you can move to a location or not.
        If it's a bomb, then return true
        If not a bomb, then return false
    */
    public static boolean move(int r, int c, int [][] bombProxGrid){
        if((r >= 0) && (r <= bombProxGrid.length) && (c >= 0) && (c <= bombProxGrid[0].length)) {
            if(bombProxGrid[r][c] == 9) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
    /*
        This method updates the guessGrid with a 3 by 3 square around the location guessed
        The values from the bomb grid should be translated to the answer grid
        After transferred, call the print method on the answer grid.
    */
    public static void reveal(int r, int c, int [][] guessGrid, int[][] bombProxGrid){
        if(r - 1 < 0) {
            if (c - 1 < 0) {
                guessGrid[r][c] = bombProxGrid[r][c];
                guessGrid[r + 1][c] = bombProxGrid[r + 1][c];
                guessGrid[r][c + 1] = bombProxGrid[r][c + 1];
                guessGrid[r + 1][c + 1] = bombProxGrid[r + 1][c + 1];
            }
            else if(c + 1 > bombProxGrid[0].length - 1) {
                guessGrid[r][c] = bombProxGrid[r][c];
                guessGrid[r + 1][c] = bombProxGrid[r + 1][c];
                guessGrid[r][c - 1] = bombProxGrid[r][c - 1];
                guessGrid[r + 1][c - 1] = bombProxGrid[r + 1][c - 1];
            }
            else {
                guessGrid[r][c] = bombProxGrid[r][c];
                guessGrid[r][c + 1] = bombProxGrid[r][c + 1];
                guessGrid[r][c - 1] = bombProxGrid[r][c - 1];
                guessGrid[r + 1][c] = bombProxGrid[r + 1][c];
                guessGrid[r + 1][c - 1] = bombProxGrid[r + 1][c - 1];
                guessGrid[r + 1][c + 1] = bombProxGrid[r + 1][c + 1];
            }
        }
        else if(r + 1 > bombProxGrid.length - 1) {
            if(c - 1 < 0) {
                guessGrid[r][c] = bombProxGrid[r][c];
                guessGrid[r - 1][c] = bombProxGrid[r - 1][c];
                guessGrid[r - 1][c + 1] = bombProxGrid[r - 1][c + 1];
                guessGrid[r][c + 1] = bombProxGrid[r][c + 1];
            }
            else if(c + 1 > bombProxGrid[0].length - 1) {
                guessGrid[r][c] = bombProxGrid[r][c];
                guessGrid[r - 1][c] = bombProxGrid[r - 1][c];
                guessGrid[r][c - 1] = bombProxGrid[r][c - 1];
                guessGrid[r - 1][c - 1] = bombProxGrid[r - 1][c - 1];
            }
            else  {
                guessGrid[r][c] = bombProxGrid[r][c];
                guessGrid[r][c - 1] = bombProxGrid[r][c - 1];
                guessGrid[r][c + 1] = bombProxGrid[r][c + 1];
                guessGrid[r - 1][c] = bombProxGrid[r - 1][c];
                guessGrid[r - 1][c - 1] = bombProxGrid[r - 1][c - 1];
                guessGrid[r - 1][c + 1] = bombProxGrid[r - 1][c + 1];
            }
        }
        else if(c - 1 < 0) {
            guessGrid[r][c] = bombProxGrid[r][c];
            guessGrid[r][c + 1] = bombProxGrid[r][c + 1];
            guessGrid[r - 1][c] = bombProxGrid[r - 1][c];
            guessGrid[r - 1][c + 1] = bombProxGrid[r - 1][c + 1];
            guessGrid[r + 1][c] = bombProxGrid[r + 1][c];
            guessGrid[r + 1][c + 1] = bombProxGrid[r + 1][c + 1];
        }
        else if(c + 1 > bombProxGrid[0].length - 1) {
            guessGrid[r][c] = bombProxGrid[r][c];
            guessGrid[r - 1][c] = bombProxGrid[r - 1][c];
            guessGrid[r][c - 1] = bombProxGrid[r][c - 1];
            guessGrid[r + 1][c - 1] = bombProxGrid[r + 1][c - 1];
            guessGrid[r - 1][c - 1] = bombProxGrid[r - 1][c - 1 ];
            guessGrid[r + 1][c] = bombProxGrid[r + 1][c];
        }
        else {
            guessGrid[r][c] = bombProxGrid[r][c];
            guessGrid[r - 1][c] = bombProxGrid[r - 1][c];
            guessGrid[r - 1][c - 1] = bombProxGrid[r - 1][c - 1];
            guessGrid[r - 1][c + 1] = bombProxGrid[r - 1][c + 1];
            guessGrid[r + 1][c] = bombProxGrid[r + 1][c];
            guessGrid[r + 1][c - 1] = bombProxGrid[r + 1][c - 1];
            guessGrid[r + 1][c + 1] = bombProxGrid[r + 1][c + 1];
            guessGrid[r][c + 1] = bombProxGrid[r][c + 1];
            guessGrid[r][c - 1] = bombProxGrid[r][c - 1];
        }
        printGrid(guessGrid);
    }
    
    /*
        This method should traverse the entire 2D array and check
        whether the guess grid is exactly the same as the proximity grid
        Returning true if so, false if there is a discrepancy
    */
    public static boolean checkWin(int [][] guessGrid, int [][] bombProxGrid){
        int count = 0;
        for(int x = 0; x < bombProxGrid.length; x++) {
            for(int y = 0; y < bombProxGrid[0].length; y++) {
                if(bombProxGrid[x][y] == guessGrid[x][y]) {
                    count += 1;
                }
                else {
                return false;
                }
                if(count > 99) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void printGrid(int [][] board){
		System.out.println("_________________________________________");
		for(int i = 0; i < board.length;i++){
			for(int j = 0; j < board[0].length;j++){
				System.out.print("| " + board[i][j] + " | ");
			}
			System.out.println("");
		}
		System.out.println("_________________________________________");
	}
}