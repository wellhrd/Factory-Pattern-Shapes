
package factorypattern;
import java.util.*;
/**
 *
 * @author Mickael Walters
 */
public class Square implements Shape2DPlayer{

    @Override
    public void drawShape() {
        //Capture input from the user using Scanner object. 
        Scanner input = new Scanner(System.in);
        
        System.out.println(" 😃 Hello there, thanks for choosing me. I am a SQUARE! 🟦 \n");
        
        System.out.print("\t To find my AREA 📏, enter the resective data.");
        
        System.out.print("\n \t Length in CM: ");       
        int length = input.nextInt();
        
        System.out.print("\t Width in CM: ");
        int width = input.nextInt();
        
        int area = length * width;
        System.out.println("\t 📌 My area is " + area + " cm2 \n");
        
        //Perimeter calculation
        System.out.print("Would you like to know my PERIMETER❓ Type 'Yes' or 'No' : ");
        String choice = input.next();
        
        
        if (choice.equalsIgnoreCase("Yes") ) {
            int perimeter = (int) Math.pow(length, 2); //length ^ 2; or 4*(length)
            System.out.println("\n \t 💥 My perimeter is as same as my area: " + perimeter + "\n");
        }
        else {
            System.out.println("Thanks all about me for today... 💞 \n");
        }
    }
    
}
