
package factorypattern;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author Mickael Walters
 */
public class Circle implements Shape2DPlayer {

    @Override
    public void drawShape() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" 😉 Was hoping you'd pick me first. After all the doughnuts are in a perfect circle 🍩 ❗ "
                + "\n To calculate my AREA, first enter the required details below then you can have a circular 🍩 ");
        
        System.out.print("I just need a radius ⛔. Enter it here: ");
        int radius = input.nextInt();
        
        double area = Math.PI * (radius * radius);
        System.out.println("\t With the data entered, my area is " + area + " cm2 \n");
        
        System.out.println("Because i go 💫 round and round, my perimeter is referred to as my 🔘 Circumference.");
        
        double C = 2 * Math.PI * (radius);      
        
        System.out.println(C + " is my circumference. 💫"
                + "\n Now bite away at that doughnut's circumference... 🍩💦");
    }
    
}
