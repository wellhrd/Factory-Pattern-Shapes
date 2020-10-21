
package factorypattern;
import java.util.*;

/**
 * @author Mickael Walters
 */
public class Parallelogram implements Shape2DPlayer{

    @Override
    public void drawShape() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" 😀 Yes, an emojie for me >> ▱ << I am a Par-a-llel-oh-gram. In-order to find my AREA, enter the "
                + "required data below.");
        
        System.out.print("Base value: \n");
        int base = input.nextInt();
        
        System.out.print("Height value: ");
        int height = input.nextInt();
        
        int area = base * height;
        System.out.println("\t And just like thatm, my area is " + area +" cm2");
        
        //Perimeter calculation
        System.out.println("Calculating my PERIMETER is slightly different. Should we calculate this?");
        
        System.out.print("Type - |yes| or |no| --> ");
        String option = input.next();
        
        if (option.equalsIgnoreCase("Yes")) {
            System.out.print("\n We'll use the same base value so enter the width X value: ");
            int widthX = input.nextInt();
            
            int perimeter = 2 * (base + widthX);
            System.out.println("Awesome! My PERIMETER is " + perimeter);
            
        } else {
            System.out.println("\n \t Ensure you type |yes| next time.  So long! ▱ ");
        } //EndifElse
        
    }
    
}
