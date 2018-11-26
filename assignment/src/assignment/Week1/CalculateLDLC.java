/**
 * 
 */
package assignment.Week1;

import java.util.Scanner;

/**
 * @author ko
 *
 */
public class CalculateLDLC {
	
	private static Scanner s;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		s = new Scanner(System.in);		// scanner for receive input
		
		System.out.println("This application can calculates the LDL cholesterol (LDLC) \n");
		
		System.out.print("Please input Total Cholesterol (TC) :");
		
		String tc = s.nextLine();	//receive input of Total Cholesterol (TC)
		while(!numberOrNot(tc)||Math.signum(Float.parseFloat(tc))==-1){ // check the input is positive number or not, input again if not
			System.out.print("Please input positive number!\n\nPlease input Total Cholesterol (TC) :");
			tc = s.nextLine();
		}
		
		System.out.print("Please input HDL cholesterol (HDLC) :");
		
		String hdlc = s.nextLine();	//receive input of HDL cholesterol (HDLC)
		while(!numberOrNot(hdlc)||Math.signum(Float.parseFloat(hdlc))==-1){ // check the input is positive number or not, input again if not
			System.out.print("Please input positive number!\n\nPlease input HDL cholesterol (HDLC) :");
			hdlc = s.nextLine();
		}
		
		System.out.print("Please input HDL triglyceride (TG) :");
		
		String tg = s.nextLine();	//receive input of triglyceride (TG)
		while(!numberOrNot(tg)||Math.signum(Float.parseFloat(tg))==-1){ // check the input is positive number or not, input again if not
			System.out.print("Please input positive number!\n\nPlease input HDL triglyceride (TG) :");
			tg = s.nextLine();
		}
		
		float tc1 = Float.parseFloat(tc); //parse the input to float
		float hdlc1 = Float.parseFloat(hdlc);
		float tg1 = Float.parseFloat(tg);
		
		float ldlc = tc1-hdlc1-(tg1/5);	//calculate LDLC and store in variable named ldlc
		System.out.println("\nLDL cholesterol (LDLC) :"+ldlc);	//Display the LDLC result
		s.close();
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
