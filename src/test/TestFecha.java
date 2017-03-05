package test;

/** Paquete para las clases de prueba
 * 
 */
import codigo.Fecha;
import junit.framework.TestCase; 
import org.junit.Test;

public class TestFecha extends TestCase{
	/* DUDA PROFESOR JUAN VTE:
	 * Todas las fechas siguientes no sé si es mejor crearlas como atributos en este lugar o
	 * si es mejor crearlas como variables locales ya dentro del método testPrueba().
	*/
	
	/**
	 * Clase que contiene los casos de prueba
	 */
	
	//Fecha válida estándar
	private Fecha fecha1 = new Fecha(10,5,2016);
	//Fechas válidas límite
	private Fecha fecha2 = new Fecha(1,1,1970);
	private Fecha fecha3 = new Fecha(31,12,2017);
	private Fecha fecha4 = new Fecha(29,2,2016);
	private Fecha fecha8 = new Fecha(29,2,2000);
	//Fechas no válidas
	private Fecha fecha5 = new Fecha(0,5,2016);
	private Fecha fecha6 = new Fecha(32,5,2016);
	private Fecha fecha7 = new Fecha(29,2,2017);
	private Fecha fecha9 = new Fecha(20,13,2017);
	
	@Test
	public void testFecha(){
		assertEquals(fecha1.valida(), true);
		assertEquals(fecha2.valida(), true);
		assertEquals(fecha3.valida(), true);
		assertEquals(fecha4.valida(), true);
		assertEquals(fecha8.valida(), true);
		assertEquals(fecha5.valida(), false);
		assertEquals(fecha6.valida(), false);
		assertEquals(fecha7.valida(), false);
		assertEquals(fecha9.valida(), false);
	}

}
