/**
 * 
 */
package assignment.Week5;

import java.util.Scanner;

/**
 * @author ko
 *
 */
public class GuessGame {
	private static Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String again;
		do {
			play();
			System.out.println("Shall we play again?(yes/no)");//ask for play again
			again = scanner.nextLine();
			while(!again.equalsIgnoreCase("yes")&&!again.equalsIgnoreCase("no")){//only accept 'yes' or 'no' input
				System.out.println("please input 'yes' or 'no' !!");
				again = scanner.nextLine();//input again if not typing 'yes' or 'no'
			}
	    } while (again.equalsIgnoreCase("yes"));//play again if typed yes
		System.out.println("Game over!bye!");
		scanner.close();
	}
	
	public static void play(){ //game section
	    int upperLimit = 2000;
	    int lowerLimit = 1;
	    int guessNum;
	    String response;
	    
		System.out.println("\nThink a number between 1-2000. I will guess the number on your mind.:)\n");
	    System.out.println("tell me your number is higher('H') or Lower('L') than my guess. \nType 'R' when i get your number.\n");
	    
	    do {
	    	guessNum = (upperLimit + lowerLimit + 1) / 2;//Binary Search
	        System.out.println("I think it's " + guessNum + ", am I guess it right?");
	        response = scanner.nextLine();   

	        if (response.equalsIgnoreCase("H")) {  //too low
	            lowerLimit = guessNum + 1;
	        } else if (response.equalsIgnoreCase("L")) { // too high
	            upperLimit = guessNum - 1;
	        } else if(!response.equalsIgnoreCase("R")){
	        	System.out.println("Please give me a hint(H/L/R) of your number :(");//only accept 'h/l/r/H/L/R' input, input again to same guess attempt
	        }
	    } while (!response.equalsIgnoreCase("R"));
	    
	    System.out.println("\nYA!I'm so smart!:)\n");
	}

}
