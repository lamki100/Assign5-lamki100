/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Right Angled Triangle
 * @author Dr. Donyina
 * @author Katie Lamkin
 * @version 4/18/16
 */
public class RightAngledTriangle extends Triangle {
    
	/**
     * Constructs an Right Angled triangle using the provided inputs for width, height, and hypotenuse.
     * Uses the class Triangle's constructor and passes in length for all sides.
     *
     * @param width The width to assign to this triangle for side A.
     * @param height The height to assign to this triangle for side B.
     * @param hypotenuse The hypotenuse to assign to this triangle for side C.
     */
    RightAngledTriangle(double width, double height, double hypotenuse)
            throws Exception {
        super(width, height, hypotenuse);
    }
    
    /**
     * Validating the input to tell whether the input can make a real right triangle using Pythagorean Theorem:
     * 
     * @param sideA The width is used to test whether the lengths make a valid triangle.
     * @param sideB The height is used to test whether the lengths make a valid triangle.
     * @param sideC The hypotenuse is used to test whether the lengths make a valid triangle.
     * @return true if sides make a valid right triangle or false if the sides do not make a valid right triangle.
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {
        if((sideC * sideC) == ((sideA * sideA) + (sideB * sideB))){
            return true;
        }
        return false;
    }

    /**
     * What is the area of this triangle?
     *
     * @return width * height, all divided by 2
     */
    public double getArea() {
        return ((sideA * sideB) / 2);
    }

}
