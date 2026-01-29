/* 
    Lecture note example - Methods
*/
import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numba 1: ");
        int num1 = sc.nextInt();
        System.out.println("Numba 2: ");
        int num2 = sc.nextInt();
        
        System.out.println(squared(num1));
        System.out.println(absolute_value(num2));
    
        
	}
	
	public static int squared(int a) {
	    int square = a*a;
	    return square;
	}
	
	public static int absolute_value(int a) {
	    int answer = Math.abs(a);
	    return answer;
	}
}