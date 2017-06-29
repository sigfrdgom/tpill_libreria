/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros.tpi.registrolibreria;

import java.util.List;
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
public class PersonaTest {
    
    public PersonaTest() {
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

    @Test
    public void testGetDui() {
        System.out.println("Obteniendo dui");
        Persona instance = new Persona();
        Integer expResult = null;
        Integer result = instance.getDui();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDui() {
        System.out.println("setDui");
        Integer dui = null;
        Persona instance = new Persona();
        instance.setDui(dui);
       
    }

    @Test
    public void testGetNombreCompleto() {
        System.out.println("getNombreCompleto");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getNombreCompleto();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetNombreCompleto() {
        System.out.println("setNombreCompleto");
        String nombreCompleto = "";
        Persona instance = new Persona();
        instance.setNombreCompleto(nombreCompleto);
       
    }

    @Test
    public void testGetEstudianteList() {
        System.out.println("getEstudianteList");
        Persona instance = new Persona();
        List<Estudiante> expResult = null;
        List<Estudiante> result = instance.getEstudianteList();
        assertEquals(expResult, result);
       
    }

    @Test
    public void testSetEstudianteList() {
        System.out.println("setEstudianteList");
        List<Estudiante> estudianteList = null;
        Persona instance = new Persona();
        instance.setEstudianteList(estudianteList);
        
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

//    @Test
//    public void testEquals() {
//        System.out.println("equals");
//        Object object = null;
//        Persona instance = new Persona();
//        boolean expResult = false;
//        boolean result = instance.equals(object);
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Persona instance = new Persona();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//       
//    }
    
}
