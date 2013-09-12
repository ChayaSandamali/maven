/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p_challenge.maven.example;
import junit.framework.TestCase;

/**
 *
 * @author Chaya
 */
public class NicInterpreterTest extends TestCase{

    @Override
    
    protected void setUp() throws Exception {
        super.setUp();
        
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
              
        
    }

    /**
     * Test of getYear method, of class NicInterpreter.
     */
    public void testGetYear()throws Exception {
        System.out.println("getYear");
        NicInterpreter instance = new NicInterpreter("906961407V");
        int expResult = 1990;
        int result = instance.getbirthYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class NicInterpreter.
     */
    public void testGetMonth()throws Exception {
        System.out.println("getMonth");
        NicInterpreter instance = new NicInterpreter("906961407V");
        int expResult = 3;
        int result = instance.getbirthMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class NicInterpreter.
     */
    public void testGetDate()throws Exception {
        System.out.println("getDate");
        NicInterpreter instance = new NicInterpreter("906961407V");;
        int expResult = 15;
        int result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class NicInterpreter.
     */
    public void testGetGender()throws Exception {
        System.out.println("getGender");
        NicInterpreter instance = new NicInterpreter("906961407V");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isVoter method, of class NicInterpreter.
     */
    public void testIsVoter()throws Exception {
        System.out.println("isVoter");
        NicInterpreter instance = new NicInterpreter("906961407V");
        String expResult = "True";
        String result = instance.Voter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
   
      
    
}
