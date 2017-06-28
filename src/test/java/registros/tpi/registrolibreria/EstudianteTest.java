/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros.tpi.registrolibreria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sigfrid
 */
public class EstudianteTest {
    
    public EstudianteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCarnet method, of class Estudiante.
     */
    @Test
    public void testGetCarnet() {
        System.out.println("Obtiene el carnet de un estudiante");
        Estudiante instance = new Estudiante();
        String expResult = null;
        String result = instance.getCarnet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCarnet method, of class Estudiante.
     */
    @Test
    public void testSetCarnet() {
        System.out.println("Setea el carnet de un estudiante a la base de datos");
        String carnet = "AA99999";
        Estudiante instance = new Estudiante();
        instance.setCarnet(carnet);
        
        
    }

    /**
     * Test of getCarrera method, of class Estudiante.
     */
    @Test
    public void testGetCarrera() {
        System.out.println("Obtiene la carrera del estudiante");
        Estudiante instance = new Estudiante();
        int expResult = 0;
        int result = instance.getCarrera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCarrera method, of class Estudiante.
     */
    @Test
    public void testSetCarrera() {
        System.out.println("Setea la carrera del estudiante");
        int carrera = 0;
        Estudiante instance = new Estudiante();
        instance.setCarrera(carrera);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDui method, of class Estudiante.
     */
    @Test
    public void testGetDui() {
        System.out.println("Obtiene el DUI de la persona");
        Estudiante instance = new Estudiante();
        Persona expResult = null;
        Persona result = instance.getDui();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDui method, of class Estudiante.
     */
    @Test
    public void testSetDui() {
        System.out.println("Setea el dui de la persona");
        Persona dui = null;
        Estudiante instance = new Estudiante();
        instance.setDui(dui);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of hashCode method, of class Estudiante.
     */
//    @Test
//    public void testHashCode() {
//        System.out.println("Obtener el codigo del estudiante hash");
//        Estudiante instance = new Estudiante();
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }

    /**
     * Test of equals method, of class Estudiante.
     */
//    @Test
//    public void testEquals() {
//        System.out.println("equals");
//        Object object = null;
//        Estudiante instance = new Estudiante();
//        boolean expResult = false;
//        boolean result = instance.equals(object);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }

    /**
     * Test of toString method, of class Estudiante.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
