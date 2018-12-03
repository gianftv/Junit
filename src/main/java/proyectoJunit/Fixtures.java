package proyectoJunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fixtures {

	@Before
	public void setUp() {// antes de cada test

		System.out.println("Antes de cada test");

	}

	@After
	public void tearDown() {// despues de cada test
		System.out.println("Despues de cada test \n");
	}

	@BeforeClass
	public static void setUpClass() {// estatica para que este desde el principio

		System.out.println("Al cargar la clase, antes de todos los tests - Abrir BBDD\n");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("Al finalizar todos los test cerrar BBDD\n");

	}

	@Test

	public void primerTest() {
		System.out.println("Primer Test\n");
	}

	@Test

	public void segundoTest() {
		System.out.println("Segundo Test\n");
	}

	@Test

	public void TercerTest() {
		System.out.println("Tercer Test\n");
	}

}
