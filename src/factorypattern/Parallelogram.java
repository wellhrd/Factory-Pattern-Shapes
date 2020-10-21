
package factorypattern;
import java.util.*;

/**
 * @author Mickael Walters
 */
public class Parallelogram implements Shape2DPlayer{

    @Override
    public void drawShape() {
        //Accept input from user object
        Scanner input = new Scanner(System.in);
        
        System.out.println(" 😀 Yes, an emojie for me >> ▱ << I am a Par-a-llel-oh-gram. In-order to find my AREA, enter the "
                + "required data below.");
        
        System.out.print("\t Base value: ");
        int base = input.nextInt();
        
        System.out.print("\t Height value: ");
        int height = input.nextInt();
        
        int area = base * height;
        System.out.println("\n 📌 And just like that, my area is ->" + area +" cm2");
        
        //Perimeter calculation
        System.out.println("\n Calculating my PERIMETER is slightly different. Should we calculate this?");
        
        System.out.print("Type - |yes| or |no| --> ");
        String option = input.next();
        
        if (option.equalsIgnoreCase("Yes")) {
            System.out.print("\n We'll use the same base value so enter WIDTH X value: ");
            int widthX = input.nextInt();
            
            int perimeter = 2 * (base + widthX);
            System.out.println("\t 📌 Awesome! My PERIMETER is " + perimeter + "\n");
            
        } else {
            System.out.println("\n \t Ensure you type |yes| next time. So long! ▱ \n");
        } //EndifElse
        
    }
    
}
