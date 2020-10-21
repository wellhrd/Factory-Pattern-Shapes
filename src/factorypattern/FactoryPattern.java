
package factorypattern;
import java.util.Scanner;
/**
 * @author Mickael Walters
 * ID: 2016111033
 */
public class FactoryPattern {

    public static void main(String[] args) {
        
        //Instantiate objects 
        ShapeFactory SF = new ShapeFactory();
        Scanner input = new Scanner(System.in);
        
        //Variables
        int choice = 0;
        
        //Loop to keep menu available for the user's perusal at anytime. 
        do {
            System.out.println(" ➖  ➖  ➖  ➖  ➖ ⚫ 🔳 🔺  ▱ ➖  ➖  ➖  ➖  ➖  ➖ "
                    + "\n Wecome to my FACTORY PATTERN IMPLEMENTATION using shapes. "
                    + "\n Please select one of the following menu options to learn more... "
                    + "\n 1 \t Square"
                    + "\n 2 \t Circle"
                    + "\n 3 \t Parallelogram"
                    + "\n 4 \t Triangle"
                    + "\n 5 \t Exit" 
                    + "\n ➖  ➖  ➖  ➖  ➖ ⚫ 🔳 🔺  ▱ ➖  ➖  ➖  ➖  ➖  ➖ ");
            
            System.out.print("\t 🖋 SELECTION --> ");
            
            //VALIDATION - Ensures only numerical data in input
            try {
               choice = input.nextInt();
            }catch (Exception ex){
                System.err.println("Invalid input! Enter a number from 1 - 5");
                input.next(); //Allow user to re-enter value
            }//EndCatch
            
            //Using the menu chosen the shapes classes are called tasks performed independently
            switch (choice) {
                case 1:
                    Shape2DPlayer square = SF.getShape2DPlayer("Square");
                    square.drawShape();
                    break;
                
                case 2:
                    Shape2DPlayer circle = SF.getShape2DPlayer("Circle");
                    circle.drawShape();
                    break;
                    
                case 3:
                    Shape2DPlayer parallelogram = SF.getShape2DPlayer("Parallelogram");
                    parallelogram.drawShape();
                    break;
                    
                case 4:
                    Shape2DPlayer triangle = SF.getShape2DPlayer("Triangle");
                    triangle.drawShape();
                    break;
                    
                case 5:
                    System.out.println("\t Adios! ...Come right back soon!... ");
                    break;
                    
                default:
                    System.err.println("\t OUT OF RANGE SELECTION!");
                    
            }//EndSwitch
        
        } while (choice != 5);
        
    }
    
}


//ReferenceLink --> https://simpledevcode.files.wordpress.com/2015/07/factory_pattern_uml_diagram.jpg