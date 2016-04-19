import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the Triangle class.
 * 
 * @author Katie Lamkin
 * @version 4/18/2016
 */
public class EquilateralTriangleTest {

	/**
     * EquilateralTriangle t will be the triangle used for the tests
     */
    public EquilateralTriangle t;
    
    /**
     * Double length will be the length of all sides
     */
    public double length;

    /**
     * Double area will be the area of the triangle
     */
    public double area;
	
    /**
     * Setup the initial values for the Tests
     */
    @Before // This method will run before each test method
    public void setUp() {
    	length = 3.0;
        area = 3.9;
        try {
			t = new EquilateralTriangle(length);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    /**
     * Test method for {@link EquilateralTriangle#EquilateralTriangle(double, double, double)}.
     */
    @Test
    public void testTriangleConstructor() {
    	assertTrue((t.sideA == 3.0 && t.sideB == 3.0 && t.sideC == 3.0));
    }

    /**
     * Test method for {@link EquilateralTriangle#validateInput(double, double, double)}.
     */
    @Test
    public void testValidateInput() {
    	assertTrue(t.validateInput(t.sideA, t.sideB, t.sideC));
    }
    
    /**
     * Test method for {@link EquilateralTriangle#getArea()}.
     */
    @Test
    public void testGetArea() {
        assertTrue((double) (Math.round(t.getArea() * 10.0)/10.0) == area);
    }

}
