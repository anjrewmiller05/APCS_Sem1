package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player
	int rows;
	int columns;

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		map = new int [row][column];
		rows = row;
		columns = column;
		posX = 0;
		posY = 0;
		for(int r = 0; r<map.length; r++) {
			for(int y= 0; y<map[0].length; y++) {
				map[r][y] = 0;
			}
		}
		map[posX][posY] = 2;
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureX = (int)(Math.random()*rows);
		treasureY = (int)(Math.random()*columns);
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		if((map[posX][posY] == 3) || (map[posX][posY] == 1)) {
			map[posX][posY] = 1;
		}
		else {
			map[posX][posY] = 0;
		}
		if(m == 1) {
			posX--;
			if(posX<0) {
				posX++;
				return false;
			}
			else {
				map[posX][posY] = 2;
				return true;
			}
		}
		else if(m == 2) {
			posX++;
			if(posX>map.length - 1) {
				posX--;
				return false;
			}
			else {
				map[posX][posY] = 2;
				return true;
			}
		}
		else if(m == 3) {
			posY--;
			if(posY<0) {
				posY++;
				return false;
			}
			else {
				map[posX][posY] = 2;
				return true;
			}
		}
		else if(m == 4) {
			posY++;
			if(posY>map[0].length - 1) {
				posY--;
				return false;
			}
			else {
				map[posX][posY] = 2;
				return true;
			}
		}
		else if(m == 5) {
			posX--;
			posY--;
			if((posX < 0) || (posY < 0)) {
				posX++;
				posY++;
				return false;
			}
			else {
				map[posX][posY] = 2;
				return true;
			}
		}
		else if(m == 6) {
			posX--;
			posY++;
			if((posX > map.length - 1) || (posY < 0)) {
				posX++;
				posY--;
				return false;
			}
			else {
				map[posX][posY] = 2;
				return true;
			}
		}
		else if(m == 7) {
			posX++;
			posY--;
			if((posY > map[0].length - 1) || (posX < 0)) {
				posX--;
				posY++;
				return false;
			}
			else {
				map[posX][posY] = 2;
				return true;
			}
		}
		else if(m == 8) {
			posX++;
			posY++;
			if((posY > map[0].length - 1) || (posX > map.length - 1)) {
				posX++;
				posY++;
				return false;
			}
			else {
				map[posX][posY] = 2;
				return true;
			}
		}
		else {
			return false;
		}
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		if((map[posX][posY] == 3) || (map[posX][posY] == 1)) {
			map[posX][posY] = 1;
		}
		else {
			map[posX][posY] = 0;
		}
		int originalX = posX;
		int originalY = posY;
		posX = row;
		posY = col;
		
		if((posY > map[0].length - 1) || (posX > map.length - 1) || (posX < 0) || (posY < 0)) {
			posX = originalX;
			posY = originalY;
			return false;
		}
		else {
			map[posX][posY] = map[posX][posY] + 2;
			return true;
		}
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		map[posX][posY] = 3;
		if((posX == treasureX)&&(posY == treasureY)) {
			return true;
		}
		else {
			return false;
		}
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		map[treasureX][treasureY] = 5;
		printMap();
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		System.out.println();
		for(int x = 0; x<map.length; x++) {
			for(int y = 0; y<map[0].length; y++) {
				System.out.print(" " + map[x][y]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
