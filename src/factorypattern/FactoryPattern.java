
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
        int choice;
        
        //Loop to keep menu available for the user's perusal at anytime. 
        do {
            System.out.println(" ➖  ➖  ➖  ➖  ➖ ⚫ 🔳 🔺  ▱ ➖  ➖  ➖  ➖  ➖  ➖ "
                    + "\n Wecome to my FACTORY PATTERN IMPLEMENTATION using shapes. "
                    + "\n Please select one of the following menu options to learn more... "
                    + "\n 1 \t Square"
                    + "\n 2 \t Circle"
                    + "\n 3 \t Parallelogram"
                    + "\n 4 \t Triangle"
                    + "\n 0 \t Exit" 
                    + "\n ➖  ➖  ➖  ➖  ➖ ⚫ 🔳 🔺  ▱ ➖  ➖  ➖  ➖  ➖  ➖ ");
            
            System.out.print("Selection --> ");
            
            choice = input.nextInt();
            
            //using the menu chosen to call the shapes classes and perform tasks
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
                    
                case 0:
                    System.out.println("\t ...Come right back soon!... ");
                    
                default:
                    System.err.println("SELECTION OUT OF RANGE!");
                    break;
            }
            
            
        } while (choice != 0);
        
    }
    
}


//ReferenceLink --> https://simpledevcode.files.wordpress.com/2015/07/factory_pattern_uml_diagram.jpg