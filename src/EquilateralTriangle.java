/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Equilateral Triangle
 * @author Dr. Donyina
 * @author Katie Lamkin
 * @version 4/18/16
 */
public class EquilateralTriangle extends Triangle {
    
	/**
     * Constructs an equilateral triangle using the provided side lengths.
     * Uses the class Triangle's constructor and passes in length for all sides.
     *
     * @param length The length to assign to this triangle for all sides.
     */
    EquilateralTriangle(double length)
            throws Exception {
        super(length, length, length);
    }

    /**
     * Validating the input to tell whether the input can make a real equaliteral triangle seeing if all sides are equal:
     * 
     * @param sideA The sideA length is used to test whether the lengths make a valid triangle.
     * @param sideB The sideB length is used to test whether the lengths make a valid triangle.
     * @param sideC The sideC length is used to test whether the lengths make a valid triangle.
     * @return true if sides make a valid equaliteral triangle or false if the sides do not make a valid equaliteral triangle.
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {
    	if( sideA > 0 && sideB > 0 && sideC > 0){
     	   if (sideA == sideB && sideA == sideC && sideB == sideC){
     		   return true;
     	   }
     	   else return false;
        }
        else return false;
    }

    /**
     * What is the area of this triangle?
     *
     * @return the square root of 3 divided by 4, all multuplied by sideA squared
     */
    public double getArea() {
        return (Math.sqrt(3)/4) * sideA * sideA;
    }

}
