/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Estefania.Garces
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Método único antes de la clase");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Método único después de la clase");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Inicio de método");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Fin de método");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void Prueba1(){
    }
     @Test
    public void Prueba2(){
    }
    
     @Test
    public void Prueba3(){
    }
    
     @Test
    public void Prueba4(){
    }
}
