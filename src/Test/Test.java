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
        int[] prueba = {1, 2, 3};
		String resultado = met.metodo2(prueba);
		// asercion/Confirmacion 
		assertEquals("1 2 Face", resultado); 
	}

}
