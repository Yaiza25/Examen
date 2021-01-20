package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import App.*;

public class Test {
    
    @Test
	@DisplayName("Comprobar si el metodo uno funciona")
	void Test1() {
		// preparacion 
		Metodo met = new Metodo();
		// ejecucion
		String resultado = met.metodo1(3);
		// asercion/Confirmacion 
		assertEquals("Face", resultado); 
	}
	
	@Test
	@DisplayName("Comprobar si el metodo uno funciona")
	void Test2() {
		// preparacion 
		Metodo met = new Metodo();
		// ejecucion
		String resultado = met.metodo1(5);
		// asercion/Confirmacion 
		assertEquals("Book", resultado); 
	}
	
	@Test
	@DisplayName("Comprobar si el metodo uno funciona")
	void Test3() {
		// preparacion 
		Metodo met = new Metodo();
		// ejecucion
		String resultado = met.metodo1(15);
		// asercion/Confirmacion 
		assertEquals("Facebook", resultado); 
    }
    
    @Test
    @DisplayName("Comprobar si el metodo dos funciona")
	void Test4() {
		// preparacion 
		Metodo met = new Metodo();
        // ejecucion
        int[] prueba = {1, 2, 3};
		String resultado = met.metodo2(prueba);
		// asercion/Confirmacion 
		assertEquals("1 2 Face", resultado); 
	}

	@Test
    @DisplayName("Comprobar si el metodo dos funciona")
	void Test5() {
		// preparacion 
		Metodo met = new Metodo();
        // ejecucion
        int[] prueba = {6, 10, 30};
		String resultado = met.metodo2(prueba);
		// asercion/Confirmacion 
		assertEquals("Face Book Facebook", resultado); 
	}

	@Test
    @DisplayName("Comprobar si el metodo dos funciona")
	void Test6() {
		// preparacion 
		Metodo met = new Metodo();
        // ejecucion
        int[] prueba = {4, 6, 8};
		String resultado = met.metodo2(prueba);
		// asercion/Confirmacion 
		assertEquals("4 6 8", resultado); 
	}
}
