
package factorypattern;
import java.util.*;

/**
 * @author Mickael Walters
 */
public class Parallelogram implements Shape2DPlayer{
    
    //Variables
    private int base, height, area, perimeter, widthX;
    private boolean check = false;
    private String option;

    @Override
    public void drawShape() {
        //Accept input from user object
        Scanner input = new Scanner(System.in);
        
        System.out.println(" 😀 Yes, an emojie for me >> ▱ << I am a Par-a-llel-oh-gram. In-order to find my AREA, enter the "
                + "required data below.");
        
        //User Validation
        while (!check) {
            try {
                System.out.print("\t Base value: ");
                base = input.nextInt();
        
                System.out.print("\t Height value: ");
                height = input.nextInt();
                
                check = true;
            } catch (Exception e) {
                System.err.println("\t Error! Invalid input!");
                input.next(); //Allow user to re-enter value
            }
        }//endWhile
        //End Validation
        
        area = base * height;
        System.out.println("\n 📌 And just like that, my area is ->" + area +" cm2");
        
        //Perimeter calculation
        System.out.println("\n Calculating my PERIMETER is slightly different. Should we calculate this?");
        
        System.out.print("Type - |yes| or |no| --> ");
        option = input.next();
        
        if (option.equalsIgnoreCase("Yes")) {
            
            //Validate input
            try {
                System.out.print("\n We'll use the same base value so enter WIDTH X value: ");
                widthX = input.nextInt();
            } catch (Exception e) {
                System.err.println("Invalid input!");
                input.next(); //Allow user to re-enter value
            }//endTry-catch
            
            
            perimeter = 2 * (base + widthX);
            System.out.println("\t 📌 Awesome! My PERIMETER is " + perimeter + "\n");
            
        } else {
            System.out.println("\n \t Ensure you type |yes| next time. So long! ▱ \n");
        } //EndifElse
        
    }
    
}
