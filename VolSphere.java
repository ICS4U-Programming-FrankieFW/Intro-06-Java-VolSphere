import java.util.*;
/**
* This program is a basic math program 
*
* @author Frankie Fox
* @version 1.0
* @since   2024-15-02
*/
import java.util.*;

public class VolSphere {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            //This prints out the line asking the user to enter in your radius
            System.out.print("Enter in your radius (cm): ");
            //This casts the variable to a double so the user can enter in a decimal
            double radiusNumber = sc.nextDouble();
        

            //This is the calculates the volume of a sphere
            double volume = 4.0 / 3.0 * Math.PI * Math.pow(radiusNumber, 3);
            //This prints out the volume and has it cubed 
            System.out.println("The volume is " + (Math.round(volume*100.0))/100.0 +" cm^3");
            //This sees if the radius equals to zero
            if (radiusNumber == 0d) {
                //This prints out "Please enter a positive"
                System.out.println("Please enter a positive");
            }
                
                
                
        
        
            } catch (Exception e) {
            //This prints error when it is given a non number 
            System.out.println("Error: Invalid radius entered.");
        }
     }
}
