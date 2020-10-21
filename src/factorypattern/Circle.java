
package factorypattern;
import java.util.*;

/**
 *
 * @author Mickael Walters
 */
public class Circle implements Shape2DPlayer {

    @Override
    public void drawShape() {
        //Object to capture data from the user
        Scanner input = new Scanner(System.in);
        
        System.out.println(" \n 😉 Was hoping you'd pick me first. Here's a FREE givaway. A perfect -> 🍩 ❗"
                + "\n But FIRST, calculate my AREA, enter the required details below then you can have a yummy ->💦🍩 ");
        
        System.out.print("\n \t I just need a radius ⛔. Enter it here: ");
        int radius = input.nextInt();
        
        double area = Math.round(Math.PI * (radius * radius) ); //Rund of to ONE decimal place
        System.out.println("\t 📌 With the data entered, my area is " + area + " cm2 \n");
        
        //Calculation of Circomference / perimeter
        System.out.println("Because i go 💫 round and round, my perimeter is referred to as my 🔘 Circumference.");
        
        double C = Math.round(2 * Math.PI * (radius)); //Rounf off to  ONE decimal place.      
        
        System.out.println("\t 📌 " + C + " is my circumference. 💫"
                + "\n Now bite away at that doughnut's circumference... 🍩💦 \n");
    }
    
}
