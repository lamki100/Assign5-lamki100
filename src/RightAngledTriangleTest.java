import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the Triangle class.
 * 
 * @author Katie Lamkin
 * @version 4/18/2016
 */
public class RightAngledTriangleTest {

	/**
     * RightAngledTriangle t will be the triangle used for the tests
     */
    public RightAngledTriangle t;
    
    /**
     * Double width will be the length of side A
     */
    public double width;
    
    /**
     * Double height will be the length of side B
     */
    public double height;
    
    /**
     * Double hypotenuse will be the length of side C
     */
    public double hypotenuse;

    /**
     * Double area will be the area of the triangle
     */
    public double area;
	
    /**
     * Setup the initial values for the Tests
     */
    @Before // This method will run before each test method
    public void setUp() {
    	width = 3.0;
    	height = 4.0;
    	hypotenuse = 5.0;
        area = 6.0;
    }

    /**
     * Test method for {@link RightAngledTriangle#RightAngledTriangle(double, double, double)}.
     */
    @Test
    public void testTriangleConstructor() {
    	try {
			t = new RightAngledTriangle(width, height, hypotenuse);
			assertTrue((t.sideA == 3.0 && t.sideB == 4.0 && t.sideC == 5.0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }

    /**
     * Test method for {@link RightAngledTriangle#validateInput(double, double, double)}.
     */
    @Test
    public void testValidateInput() {
    	assertTrue(t.validateInput(width, height, hypotenuse));
    }
    
    /**
     * Test method for {@link RightAngledTriangle#getArea()}.
     */
    @Test
    public void testGetArea() {
        assertTrue((double) (Math.round(t.getArea() * 10.0)/10.0) == area);
    }

}
