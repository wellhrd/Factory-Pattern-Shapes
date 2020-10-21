//Class that creates the shapes when asked for in the Main class. In this case [Factory Pattern]
package factorypattern;

/**
 *
 * @author Mickael Walters
 */
public class ShapeFactory {
    
    public Shape2DPlayer getShape2DPlayer (String shape2Dplayer) {
        //No Shape object is created if empty
        if (shape2Dplayer == null) {
            return null;
        }
        //Creates circle object and implements its  methods
        if (shape2Dplayer.equalsIgnoreCase("Circle") ) {
            return new Circle();
        }
        //Creates square object and implements its  methods
        if (shape2Dplayer.equalsIgnoreCase("Square") ) {
            return new Square();
        }
        //Creates parallelogram object and implements its  methods
        if (shape2Dplayer.equalsIgnoreCase("Parallelogram") ) {
            return new Parallelogram();
        }
        //Creates triangle object and implements its  methods
        if (shape2Dplayer.equalsIgnoreCase("Triangle") ) {
            return new Triangle();
        }
        
        return null;
    }
}
