package codigo;
/**
 * Paquete que contiene el código propiamente dicho, para separarlo del código
 * correspondiente a las pruebas unitarias.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fecha {
	/**
	 * @author Rob
	 * @version 1.2
	 * 
	 */
	private int dia;
	private int mes;
	private int anio;
	
	/**
	 * Esta es la clase fecha, sus tres atributos son privados.
	 * @param dia número del día del mes en formato dd
	 * @param mes número del mes del año en formato mm
	 * @param anio año en formato yyyy
	 */

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

	}

	private int diasMes() {
		/**
		 * Método que devuelve cuantos días tiene un mes
		 * @return Dias que tiene el mes
		 */
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
		case 2: // verificación de año bisiesto
			if (bisiesto())
				diasMes = 29;
			else
				diasMes = 28;
			break;
		}
		return diasMes;
	}

	private boolean bisiesto() {
		return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
	}

	public boolean valida() {
		/**
		 * Método para comprobar si una fecha es válida
		 */
		if (dia < 1 || dia > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;
		if (anio < 0)
			return false;

		if (dia > diasMes())
			return false;
		else
			return true;

	}

	public static void main(String[] args) throws IOException {
		int dia, mes, anyo;
		System.out.println("Introduce un día: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		dia = Integer.parseInt(entrada.readLine());
		System.out.println("Introduce un mes: ");
		mes = Integer.parseInt(entrada.readLine());
		System.out.println("Introduce un año: ");
		anyo = Integer.parseInt(entrada.readLine());
		Fecha f1 = new Fecha(dia, mes, anyo);
		if (f1.valida())
			System.out.println("La fecha: " + dia + "/" + mes + "/" + anyo
					+ " es válida");
		else
			System.out.println("La fecha: " + dia + "/" + mes + "/" + anyo
					+ " NO es válida");
	}
}
