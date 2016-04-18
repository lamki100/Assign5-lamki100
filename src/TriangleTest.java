import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the Triangle class.
 * 
 * @author Katie Lamkin
 * @version 4/18/2016
 */
public class TriangleTest {

	/**
     * Triangle t will be the triangle used for the tests
     */
    public Triangle t;
    
    /**
     * Double sideA will be the length of side A
     */
    public double sideA;
    
    /**
     * Double sideB will be the length of side B
     */
    public double sideB;
    
    /**
     * Double sideC will be the length of side C
     */
    public double sideC;
    
    /**
     * Double perimeter will be the perimeter of the triangle
     */
    public double perimeter;

    /**
     * Double area will be the area of the triangle
     */
    public double area;
	
    /**
     * Setup the initial values for the Tests
     */
    @Before // This method will run before each test method
    public void setUp() {
    	sideA = 3.0;
    	sideB = 4.0;
    	sideC = 5.0;
        perimeter = 12.0;
        area = 6.0;
    }

    /**
     * Test method for {@link Triangle#Triangle(double, double, double)}.
     */
    @Test
    public void testTriangleConstructor() {
    	try {
			t = new Triangle(sideA, sideB, sideC);
			assertTrue((t.sideA == 3.0 && t.sideB == 4.0 && t.sideC == 5.0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }

    /**
     * Test method for {@link Triangle#validateInput(double, double, double)}.
     */
    @Test
    public void testValidateInput() {
    	assertTrue(t.validateInput(sideA, sideB, sideC));
    }
    
    /**
     * Test method for {@link Triangle#getSideA()}.
     */
    @Test
    public void testGetSideA() {
        assertTrue(t.getSideA() == sideA);
    }
    
    /**
     * Test method for {@link Triangle#getSideB()}.
     */
    @Test
    public void testGetSideB() {
        assertTrue(t.getSideB() == sideB);
    }
    
    /**
     * Test method for {@link Triangle#getSideC()}.
     */
    @Test
    public void testGetSideC() {
        assertTrue(t.getSideC() == sideC);
    }
    
    /**
     * Test method for {@link Triangle#getPerimeter()}.
     */
    @Test
    public void testGetPerimeter() {
        assertTrue(t.getPerimeter() == perimeter);
    }
    
    /**
     * Test method for {@link Triangle#getArea()}.
     */
    @Test
    public void testGetArea() {
        assertTrue((double) (Math.round(t.getArea() * 10.0)/10.0) == area);
    }

}
