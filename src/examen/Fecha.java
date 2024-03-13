package examen;
/**
 * Esta clase calculo por medio de unas condiciones si la fecha introducida es valida o no.
 * 
 * @author Tomas
 * @version 1.0
 */
public class Fecha {
	/**
	 * Declaracion la variable fechaValida de tipo statico booleano.
	 */
	public static boolean fechaValida;
	/**
	 * Este método publico pide los parametros de la fecha y calucla si es valido o no.
	 * 
	 * @param dia Introduce el dia 
	 * @param mes Introduce el mes
	 * @param anio Introduce el año
	 * @return Devuelve un valor booleano, true o false.
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}