/**
 * 
 */
package assignment.Week1;

import java.util.Scanner;

/**
 * @author ko
 *
 */
public class FatCoefficient {

	private static Scanner s;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		s = new Scanner(System.in);		// scanner for receive input
		
		System.out.println("This application can calculates the Fat Coefficient (FC) "
				+ "\nand telling your body status\n");
		
		System.out.print("Please input your weight(kg) :");
		
		String w = s.nextLine();	//receive input of weight in kg
		while(!numberOrNot(w)||Math.signum(Float.parseFloat(w))==-1){ // check the input is positive number or not, input again if not
			System.out.print("Please input positive number!\n\nPlease input your weight(kg) :");
			w = s.nextLine();
		}
		
		System.out.print("Please input your height(m) :");
		
		String h = s.nextLine();	//receive input of height in m
		while(!numberOrNot(h)||Math.signum(Float.parseFloat(h))==-1){ // check the input is positive number or not, input again if not
			System.out.print("Please input positive number!\n\nPlease input your weight(kg) :");
			h = s.nextLine();
		}
		
		float weight = Float.parseFloat(w); //parse the input to float
		float height = Float.parseFloat(h);
		
		System.out.println("\nResult :");
		float fc = weight/(height*height);		//calculate FC and store in variable named fc
		
		if(fc>25){
			System.out.println("Too Fat, need to keep fit!");	//If (FC > 25) then Display ¡§Too Fat, need to keep fit!¡¨ in the result line
		}else if (fc < 15){
			System.out.println("Too Thin, need to keep fat!");	//else if (FC < 15) then Display ¡§Too Thin, need to keep fat!¡¨ in the result line
		}else{
			System.out.println("Just fit, keep on!");			//else Display ¡§Just fit, keep on!¡¨ in the result line
		}
	}
    static boolean numberOrNot(String input) //check if the string is number
    {
        try
        {
            Float.parseFloat(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}
