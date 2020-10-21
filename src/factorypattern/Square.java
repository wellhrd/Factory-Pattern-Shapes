
package factorypattern;
import java.util.*;
/**
 *
 * @author Mickael Walters
 */
public class Square implements Shape2DPlayer{

    @Override
    public void drawShape() {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" 😃 Hello there, thanks for choosing me. I am a SQUARE! 🟦 \n");
        
        System.out.print("\t To find my AREA 📏, enter the resective data");
        
        System.out.print(" Length in CM: ");       
        int length = input.nextInt(0);
        
        System.out.print("\n Width in CM: ");
        int width = input.nextInt(0);
        
        int area = length * width;
        System.out.println("\t 📌 My area is " + area + " cm2 \n");
        
        System.out.println("Would you like to know my PERIMETER❓ Type 'Yes' or 'No' :");
        String choice = input.next();
        
        
        if (choice.equalsIgnoreCase("Yes") ) {
            int perimeter = (int) Math.pow(length, 2); //length ^ 2; or 4*(length)
            System.out.println("\t 💥 My perimeter is as same as my area. " + perimeter);
        }
        else {
            System.out.println("Thanks all about me for today... 💞 ");
        }
    }
    
}
