package junit_test1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculation_junit {
	
	@Before
	   public void setUp() throws Exception {  
        System.out.println("before");  
    } 
	
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    
        @Test  
	    public void testFindMax(){  
	        assertEquals(4,Demo1_calculation.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,Demo1_calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
	        System.out.println("test case to find max executed sucessfully");
	    }  
        
        @Test
        public void testFindSum() {
        	
        	assertEquals(-7,Demo1_calculation.findSum(3, -10));
        	System.out.println("test case to find sum executed sucessfully");
        }
        
        @Test
        public void testFindProduct() {
        	
        	assertEquals(10,Demo1_calculation1.findProduct(5, 2));
        	System.out.println("Test case to find product is executed successfully");
        }
        
        @After  
        public void tearDown() throws Exception {  
            System.out.println("after");  
        }  
      
        @AfterClass  
        public static void tearDownAfterClass() throws Exception {  
            System.out.println("after class");  
        }  

}
