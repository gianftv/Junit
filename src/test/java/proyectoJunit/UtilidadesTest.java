package proyectoJunit;

import org.junit.Test;

import org.junit.Assert;

public class UtilidadesTest {

	@Test
	
	public void testConcatenar() {
		
		
		//instanciar  la clase a probar
		
		Utilidades utilidades= new Utilidades();
		
		//ejecutar el metodo a probar
		String resultado=utilidades.concatenar("Hola","bebe");
		
		//validaciones (para testear se suele utilizar "asser")
		Assert.assertEquals("Las cadenas son diferentes","Hola bebe", resultado);
		
	}
@Test
	
	public void testConcatenarFallo() {
		
		
		//instanciar  la clase a probar
		
		Utilidades utilidades= new Utilidades();
		
		//ejecutar el metodo a probar
		String resultado=utilidades.concatenar("Hola","bebe");
		
		//validaciones (para testear se suele utilizar "asser")
		Assert.assertEquals("Las cadenas son diferentes","Holabebe", resultado);
		
	}
@Test

public void testConcatenarError() {
	
	
	//instanciar  la clase a probar
	
	Utilidades utilidades= new Utilidades();
	
	//ejecutar el metodo a probar
	String resultado=utilidades.concatenar(null,"bebe");
	
	//validaciones (para testear se suele utilizar "asser")
	Assert.assertEquals("Las cadenas son diferentes","Hola bebe", resultado);
	
}

}
