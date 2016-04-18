
/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Triangle
 * @author Dr. Donyina
 * @author Katie Lamkin
 * @version 4/18/16
 */
public class Triangle {
    
	/**
     * The side A length of the triangle
     */
    protected double sideA;
    
    /**
     * The side B length of the triangle
     */
    protected double sideB;
    
    /**
     * The side C length of the triangle
     */
    protected double sideC;
    
    
    /**
     * Constructs a triangle using the provided side lengths.
     *
     * @param sideA The sideA length to assign to this triangle.
     * @param sideB The sideB length to assign to this triangle.
     * @param sideC The sideC length to assign to this triangle.
     */
    Triangle(double sideA, double sideB, double sideC) throws Exception {
        
        if (!validateInput(sideA, sideB, sideC)) {
            throw new Exception("Invalid Inputs");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    /**
     * Validating the input to tell whether the input can make a real triangle using the triangle Inequality Theorem:
     * 
     * @param sideA The sideA length is used to test whether the lengths make a valid triangle.
     * @param sideB The sideB length is used to test whether the lengths make a valid triangle.
     * @param sideC The sideC length is used to test whether the lengths make a valid triangle.
     * @return true if sides make a valid triangle or false if the sides do not make a valid triangle.
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {
       if( sideA > 0 && sideB > 0 && sideC > 0){
    	   if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA){
    		   return true;
    	   }
    	   else return false;
       }
       else return false;
    }
   
    /**
     * What is the length of side A?
     *
     * @return the side A length
     */
    public double getSideA() {
        return this.sideA;
    }
    
    /**
     * What is the length of side B?
     *
     * @return the side B length
     */
    public double getSideB() {
        return this.sideB;
    }
    
    /**
     * What is the length of side C?
     *
     * @return the side C length
     */
    public double getSideC() {
        return this.sideC;
    }
    
    /**
     * What is the perimeter of this triangle?
     *
     * @return all the lengths added together
     */
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    
    /**
     * What is the area of this triangle?
     *
     * @return the square root of perimeter * (perimeter - length of side A) * (perimeter - length of side B) * (perimeter - length of side C)
     */
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

}
