
package factorypattern;
import java.util.*;

/**
 * @author Mickael Walters
 */
public class Triangle implements Shape2DPlayer {

    @Override
    public void drawShape() {
        Scanner input = new Scanner (System.in); 
        
        System.out.println(" 🔺 I am the shape of a pyramid! I've 3 sides. To calculate my AREA please enter the required data below");
        
        System.out.print(" 📐 Enter my base --> \n");
        int base = input.nextInt();
        
        System.out.print(" 📐 Enter my height --> \n");
        int height = input.nextInt();
        
        double area = 0.5 * (base * height);
        System.out.println("My area is " + area + " cm2! \n \n");
        
        
        //Perimeter calculation
        System.out.print("\t Lets calculate my PERIMETER, shall we? Enter > Yes < or > No < : ");
        String choice = input.next();
        
        if (choice.equalsIgnoreCase("Yes") ) {
            System.out.println("Fantastic! Enter the size for all my three sides");
            
            System.out.print("Side A --> ");
            int sideA = input.nextInt();
            
            System.out.print("Side B --> ");
            int sideB = input.nextInt();
            
            System.out.print("Side C --> ");
            int sideC = input.nextInt();
            
            int perimeter = sideA + sideB + sideC;
            
            System.out.println("Nice! With the figures given, my perimenter is " + perimeter );
            
        } else {
            System.out.println("\t Hope you'll like to find out more about me next time. Bye! ");
        } //endIF
    }
    
}
