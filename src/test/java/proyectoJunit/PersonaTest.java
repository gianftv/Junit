package proyectoJunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {
	private Persona persona;

	@Before
	public void setUp() throws Exception {
		persona = new Persona("Juan", "Goldaracena");
	}

	@Test
	public void testGetNombre() throws Exception {// windows>preferences>moreunit>java://given(2enter),//when(2enter),//then(2enter)
		// given condiciones previas test

		// when ejecucion metodo a probar

		// then condiciones que se cumplen para validar el test
		// assert contrario a aexcepcion
		Assert.assertTrue(persona.getNombre().equals("Juan"));// probamos el metodo getNombre
		// crtl + r se ejecuta el test
	}

}
