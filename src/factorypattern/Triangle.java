
package factorypattern;
import java.util.*;

/**
 * @author Mickael Walters
 */
public class Triangle implements Shape2DPlayer {
    
    //Variable declaration
    private int base, height, sideA, sideB, sideC, perimeter;
    private double area;
    private boolean check = false;

    @Override
    public void drawShape() {
        //Accepts input from the user. 
        Scanner input = new Scanner (System.in); 
        
        System.out.println(" 🔺 I am the shape of a pyramid! I've 3 sides. To calculate my AREA please enter the required data below");
        
        //VALIDATION
        while (!check) {
            try {
                System.out.print("\t 📐 Enter my base --> ");
                base = input.nextInt();
        
                System.out.print("\t 📐 Enter my height --> ");
                height = input.nextInt();
                
                check = true;
            } catch (Exception ex) {
                System.err.println("\t Input is invalid.");
                input.next();
            }
        } //End while
        
        
        area = 0.5 * (base * height);
        System.out.println("   📌 My area is " + area + " cm2! \n");
        
        
        //Perimeter calculation
        System.out.print("\t Lets calculate my PERIMETER, shall we? Enter > Yes < or > No < : ");
        String choice = input.next();
        
        if (choice.equalsIgnoreCase("Yes") ) {
            System.out.println("Fantastic! Enter the size for all my three sides:");
            
            //Validation check
            //while (!check) {
                try {
                    System.out.print("\t Side A --> ");
                    sideA = input.nextInt();
            
                    System.out.print("\t Side B --> ");
                    sideB = input.nextInt();
            
                    System.out.print("\t Side C --> ");
                    sideC = input.nextInt();
                    check = true;
                    
                } catch (Exception ex) {
                    System.err.println("\t This input is not valid");
                    //input.next(); //Allow user to re-enter value
                }
                
            //}//ENDWhile
            
            perimeter = sideA + sideB + sideC; //Perimeter calculation
            
            System.out.println("Nice! With the figures given, my perimenter is " + perimeter + "\n");
            
        } else {
            System.out.println("\t Hope you'll like to find out more about me next time. Bye! \n");
        } //endIF
    }
    
}
