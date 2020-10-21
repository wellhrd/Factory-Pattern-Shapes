
package factorypattern;
import java.util.*;
/**
 *
 * @author Mickael Walters
 */
public class Square implements Shape2DPlayer{
    
    //Variable declaration
    private int length, width, area, perimeter;
    private String choice;
    private boolean info = false;

    @Override
    public void drawShape() {
        //Capture input from the user using Scanner object. 
        Scanner input = new Scanner(System.in);
        
        System.out.println(" 😃 Hello there, thanks for choosing me. I am a SQUARE! 🟦 \n");
        
        System.out.print("\t To find my AREA 📏, enter the resective data.");
        
        //USER VALIDATION
        while (!info) {
            try {
                System.out.print("\n \t Length in CM: ");       
                length = input.nextInt();
                
                System.out.print("\t Width in CM: ");
                width = input.nextInt();
                
                info = true;
            } catch (Exception e) {
                System.err.println("\t Invalid input!");
                input.next(); //Allows user to re-enter data
            }
        }//endWhile
        //END VALIDATION
        
        area = length * width;
        System.out.println("\t 📌 My area is " + area + " cm2 \n");
        
        //Perimeter calculation
        System.out.print("Would you like to know my PERIMETER❓ Type 'Yes' or 'No' : ");
        choice = input.next();
        
        
        if (choice.equalsIgnoreCase("Yes") ) {
            perimeter = (int) Math.pow(length, 2); //length ^ 2; or 4*(length)
            System.out.println("\n \t 💥 My perimeter is as same as my area: " + perimeter + "\n");
        }
        else {
            System.out.println("Thanks all about me for today... 💞 \n");
        }
    }
    
}
