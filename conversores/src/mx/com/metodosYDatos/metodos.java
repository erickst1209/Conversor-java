package mx.com.metodosYDatos;

public class metodos implements datos {


	/**
	 * esta funcion es para hacer los calculos de la convercion de las divisas
	 * @param opcion
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	public static  double funcionDivisas(Double opcion, Double opcion2, Double cantidad,double resultado) {

		if(opcion == divisasValor[0]) {
			resultado = Math.round((cantidad*opcion2)/opcion * 1000.0)/1000.0;
			System.out.println("opcion 1 "+resultado);
		}else if (opcion2 == divisasValor[0]) {
			resultado = Math.round((cantidad*opcion2)/opcion *1000.0)/1000.0;
			System.out.println("opcion 2 "+resultado);
		}else if(opcion != divisasValor[0] && opcion2 != divisasValor[0]) {
			resultado = Math.round((cantidad*(cantidad*MEXICANO)/opcion)*opcion2 * 1000.0)/1000.0;
			System.out.println("opcion 3 "+resultado);
		}
		return Math.round(resultado * 1000.0)/1000.0;
	}
	/**
	 * Esta funcion es para la convercion de las unidades de temoeratura
	 * @param opcion1
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	public static double funcionTemperatura(String opcion1, String opcion2,Double cantidad, double resultado) {
		if(opcion1 == grados[0] && opcion2 == grados[1]) {
			resultado = (cantidad * 9 / 5) + 32;
			System.out.println(" se combirtio de celsius a fahrenheit " + resultado);//1
		}else if(opcion1 == grados[0] && opcion2 == grados[2]) {
			resultado = cantidad + 273.15;
			System.out.println(" se combirtio de celsius a kelvin " + resultado);//3
		}else if(opcion1 == grados[1] && opcion2 == grados[0]) {
			resultado = (cantidad - 32)* 5/9;
			System.out.println(" se combirtio de farhentheit a celsius " + resultado);//2
		}else if(opcion1 == grados[2] && opcion2 == grados[0]) {
			resultado = cantidad - 273.15;
			System.out.println(" se combirtio de kelvin a celsius " + resultado);//4
		}else if(opcion1 == grados[1] && opcion2 == grados[2]) {
			resultado = (cantidad - 32) * 5/9 + 273.15;
			System.out.println(" se combirtio de farhentheit a kelvin " + resultado);//5
		}else if(opcion1 == grados[2] && opcion2 == grados[1]) {
			resultado = (cantidad - 273.15) * 9/5 + 32;
			System.out.println(" se combirtio de kelvin a farhentheit " + resultado);//6
		}
		return resultado;
	}
	/**
	 * Esta es la funcion para la convercion de las unidades de longitud
	 * @param opcion1
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return 
	 */
	public static double funcionLongitud(String opcion1,String opcion2, Double cantidad,double resultado) {

		switch(opcion1) {
		case " Metros ":
			switch(opcion2) {
			case " Kilometros ":
				resultado = cantidad / 1000.0;

				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Centimetros ":
				resultado = cantidad * 100.0;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pulgadas ":
				resultado = cantidad * 39.37;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies ":
				resultado = cantidad * 3.281;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yardas ":
				resultado = cantidad * 1.094;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Millas ":
				resultado = cantidad * 0.000621371;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Kilometros ":
			switch(opcion2) {
			case " Metros ":
				resultado = cantidad * 1000.0;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Centimetros ":
				resultado = cantidad * 100000.0;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pulgadas ":
				resultado = cantidad * 39370.1;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies ":
				resultado = cantidad * 3280.84;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yardas ":
				resultado = cantidad * 1093.61;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Millas ":
				resultado = cantidad * 0.621371;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Centimetros ":
			switch(opcion2) {
			case " Metros ":
				resultado = cantidad / 100;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilometros ":
				resultado = cantidad / 100000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pulgadas ":
				resultado = cantidad / 2.54;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies ":
				resultado = cantidad / 30.48;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yardas ":
				resultado = cantidad / 91.44;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Millas ":
				resultado = cantidad  / 160934.4;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Pulgadas ":
			switch(opcion2) {
			case " Metros ":
				resultado = cantidad * 0.0254;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilometros ":
				resultado = cantidad * 0.0000254;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Centimetros ":
				resultado = cantidad * 2.54;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies ":
				resultado = cantidad * 0.083333;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yardas ":
				resultado = cantidad * 0.027778;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Millas ":
				resultado = cantidad  * 0.000015783;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Pies ":
			switch(opcion2) {
			case " Metros ":
				resultado = cantidad  * 0.3048;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilometros ":
				resultado = cantidad * 0.0003048;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);;
				break;
			case " Centimetros ":
				resultado = cantidad * 30.48;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pulgadas ":
				resultado = cantidad * 12;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yardas ":
				resultado = cantidad * 0.33333;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Millas ":
				resultado = cantidad  * 0.00018939;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Yardas ":
			switch(opcion2) {
			case " Metros ":
				resultado = cantidad  * 0.9144;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilometros ":
				resultado = cantidad * 0.0009144;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Centimetros ":
				resultado = cantidad *  91.44;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pulgadas ":
				resultado = cantidad * 36.0;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies ":
				resultado = cantidad * 3.0;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Millas ":
				resultado = cantidad  * 0.00056818;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;

		case " Millas ":
			switch(opcion2) {
			case " Metros ":
				resultado = cantidad  * 1609.34;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilometros ":
				resultado = cantidad * 1.60934;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Centimetros ":
				resultado = cantidad *  160934;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pulgadas ":
				resultado = cantidad * 63360;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies ":
				resultado = cantidad *  5280;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yardas ":
				resultado = cantidad  * 1760;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		default:
			resultado = 0.0;
			System.out.println(" Erro de convercion, opcion no encontrada");
			break;
		}
		return resultado;



	}
	/**
	 * Esta es la funcion para la convercion de las unidades de area
	 * @param opcion1
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	public static double funcionArea(String opcion1,String opcion2, Double cantidad, double resultado) {

		switch(opcion1) {
		case " M² ":
			switch(opcion2) {
			case " Km² ":
				resultado = cantidad / 1000000.0;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm² ":
				resultado = cantidad * 10000.0;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Hectareas ":
				resultado = cantidad / 10000.0;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Acres ":
				resultado = cantidad / 4046.86;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft² ":
				resultado = cantidad * 10.764;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yd² ":
				resultado = cantidad * 1.196;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Km² ":
			switch(opcion2) {
			case " M² ":
				resultado = cantidad * 1000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm² ":

				resultado = cantidad * 10000000000.0;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Hectareas ":
				resultado = cantidad * 100;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Acres ":
				resultado = cantidad * 247.105;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft² ":
				resultado = cantidad * 10763910.4;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yd² ":
				resultado = cantidad * 1195990.05;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Cm² ":
			switch(opcion2) {
			case " M² ":
				resultado = cantidad /  10000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Km² ":
				resultado = cantidad / Math.pow(10, 10);
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Hectareas ":
				resultado = cantidad / 100000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Acres ":
				resultado = cantidad / 4046.856;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft² ":
				resultado = cantidad / 929.0304;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yd² ":
				resultado = cantidad  / 8361.2736;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Hectareas ":
			switch(opcion2) {
			case " M² ":
				resultado = cantidad * 10000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Km² ":
				resultado = cantidad * 0.01;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm² ":
				resultado = cantidad * 10000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Acres ":
				resultado = cantidad * 2.47105;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft² ":
				resultado = cantidad * 107639.1;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yd² ":
				resultado = cantidad  *  11959.9;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Acres ":
			switch(opcion2) {
			case " M² ":
				resultado = cantidad  * 4046.85642;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Km² ":
				resultado = cantidad * 0.00404686;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);;
				break;
			case " Cm² ":
				resultado = cantidad * 40468564.2;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Hectareas ":
				resultado = cantidad * 0.404686;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft² ":
				resultado = cantidad * 43560;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yd² ":
				resultado = cantidad  * 4840;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Ft² ":
			switch(opcion2) {
			case " M² ":
				resultado = cantidad  * 0.09290304;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Km² ":
				resultado = cantidad *  9.290304e-8;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm² ":
				resultado = cantidad * 929.0304;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Hectareas ":
				resultado = cantidad * 0.0000092903;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Acres ":
				resultado = cantidad / 43560;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Yd² ":
				resultado = cantidad  / 9;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Yd² ":
			switch(opcion2) {
			case " M² ":
				resultado = cantidad  * 0.83612736;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Km² ":
				resultado = cantidad * 8.3612736e-7;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm² ":
				resultado = cantidad *  8361.2736;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Hectareas ":
				resultado = cantidad * 0.000083612736;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Acres ":
				resultado = cantidad / 4840;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft² ":
				resultado = cantidad  * 9;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		default:
			resultado = 0.0;
			System.out.println(" Erro de convercion, opcion no encontrada");
			break;
		}
		return resultado;



	}
	/**
	 * Esta es la funcion para la conversion de las unidades de volumen
	 * @param opcion1
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	public static double funcionVolumen(String opcion1,String opcion2, Double cantidad,double resultado) {

		switch(opcion1) {
		case " M³ ":
			switch(opcion2) {
			case " Cm³ ":
				resultado = cantidad * 1000000;

				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Litros ":
				resultado = cantidad * 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mL ":
				resultado = cantidad * 1000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft³ ":
				resultado = cantidad * 35.3147;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Galones ":
				resultado = cantidad * 264.172;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Fl oz ":
				resultado = cantidad * 33814.023;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Cm³ ":
			switch(opcion2) {
			case " M³ ":
				resultado = cantidad / 1000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Litros ":
				resultado = cantidad / 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mL ":
				resultado = cantidad * 1;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft³ ":
				resultado = cantidad * 0.0000353147;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Galones ":
				resultado = cantidad * 0.000264172;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Fl oz ":
				resultado = cantidad * 0.033814;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Litros ":
			switch(opcion2) {
			case " M³ ":
				resultado = cantidad / 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm³ ":
				resultado = cantidad * 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mL ":
				resultado = cantidad * 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft³ ":
				resultado = cantidad * 0.0353147;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Galones ":
				resultado = cantidad * 0.264172;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Fl oz ":
				resultado = cantidad  * 33.814;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " mL ":
			switch(opcion2) {
			case " M³ ":
				resultado = cantidad / 1000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm³ ":
				resultado = cantidad * 1;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Litros ":
				resultado = cantidad / 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft³ ":
				resultado = cantidad * 0.0000353147;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Galones ":
				resultado = cantidad * 0.000264172;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Fl oz ":
				resultado = cantidad  * 0.033814;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Ft³ ":
			switch(opcion2) {
			case " M³ ":
				resultado = cantidad  * 0.0283168;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm³ ":
				resultado = cantidad * 28316.8;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);;
				break;
			case " Litros ":
				resultado = cantidad * 28.3168;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mL ":
				resultado = cantidad * 28316.8;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Galones ":
				resultado = cantidad * 7.48052 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Fl oz ":
				resultado = cantidad  * 957.506;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Galones ":
			switch(opcion2) {
			case " M³ ":
				resultado = cantidad  * 0.00378541;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm³ ":
				resultado = cantidad * 3785.41 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Litros ":
				resultado = cantidad * 3.78541;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mL ":
				resultado = cantidad * 3785.41 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft³ ":
				resultado = cantidad * 0.133681 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Fl oz ":
				resultado = cantidad  * 128;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;

		case " Fl oz ":
			switch(opcion2) {
			case " M³ ":
				resultado = cantidad  / 33814 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Cm³ ":
				resultado = cantidad * 29.5735;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Litros ":
				resultado = cantidad / 33.814 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mL ":
				resultado = cantidad * 29.5735 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Ft³ ":
				resultado = cantidad * 0.00104438;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Galones ":
				resultado = cantidad * 0.0078125;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		default:
			resultado = 0.0;
			System.out.println(" Erro de convercion, opcion no encontrada");
			break;
		}
		return resultado;



	}



	/**
	 * Esta es la funcion para la conversion de las unidades de peso y masa
	 * 
	 * @param opcion1
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	public static double funcionPesoYmasa(String opcion1,String opcion2, Double cantidad,double resultado) {

		switch(opcion1) {
		case " Gramos ":
			switch(opcion2) {
			case " Kilogramos ":
				resultado = cantidad / 1000;

				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Toneladas ":
				resultado = cantidad / 1000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Oz ":
				resultado = cantidad * 0.035274;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Libras ":
				resultado = cantidad * 0.00220462;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Quintal ":
				resultado = cantidad * 0.000019684;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Tonelada Metrica ":
				resultado = cantidad / 1000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Kilogramos ":
			switch(opcion2) {
			case " Gramos ":
				resultado = cantidad * 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Toneladas ":
				resultado = cantidad / 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Oz ":
				resultado = cantidad * 35.274;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Libras ":
				resultado = cantidad * 2.20462;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Quintal ":
				resultado = cantidad * 0.019684;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Tonelada Metrica ":
				resultado = cantidad / 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Toneladas ":
			switch(opcion2) {
			case " Gramos ":
				resultado = cantidad * 1000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilogramos ":
				resultado = cantidad * 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Oz ":
				resultado = cantidad * 35274;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Libras ":
				resultado = cantidad * 2204.62;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Quintal ":
				resultado = cantidad * 19.684;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Tonelada Metrica ":
				resultado = cantidad  * 1;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Oz ":
			switch(opcion2) {
			case " Gramos ":
				resultado = cantidad * 28.3495;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilogramos ":
				resultado = cantidad / 35.274;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Toneladas ":
				resultado = cantidad * 0.0000283495;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Libras ":
				resultado = cantidad * 0.0625;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Quintal ":
				resultado = cantidad * 0.0000220462;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Tonelada Metrica ":
				resultado = cantidad  * 0.0000000283495;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Libras ":
			switch(opcion2) {
			case " Gramos ":
				resultado = cantidad  * 453.592;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilogramos ":
				resultado = cantidad / 2.205;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);;
				break;
			case " Toneladas ":
				resultado = cantidad * 0.000453592;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Oz ":
				resultado = cantidad * 16;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Quintal ":
				resultado = cantidad * 0.00453592 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Tonelada Metrica ":
				resultado = cantidad  * 0.000453592;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Quintal ":
			switch(opcion2) {
			case " Gramos ":
				resultado = cantidad  * 50802.3;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilogramos ":
				resultado = cantidad * 100;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Toneladas ":
				resultado = cantidad * 0.05;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Oz ":
				resultado = cantidad * 1799.66 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Libras ":
				resultado = cantidad * 220.462;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Tonelada Metrica ":
				resultado = cantidad  * 0.05;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;

		case " Tonelada Metrica ":
			switch(opcion2) {
			case " Gramos ":
				resultado = cantidad  * 1000000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilogramos ":
				resultado = cantidad * 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Toneladas ":
				resultado = cantidad * 1;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Oz ":
				resultado = cantidad * 35274;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Libras ":
				resultado = cantidad * 2204.62;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Quintal ":
				resultado = cantidad * 20;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		default:
			resultado = 0.0;
			System.out.println(" Erro de convercion, opcion no encontrada");
			break;
		}
		return resultado;



	}

	/**
	 * Esta es la funcion para la conversion de las unidades de tiempo.
	 * La convercio de meses y años son ausimiendo que el mes es de 30.44 dias
	 * 
	 * @param opcion1
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	public static double funcionTiempo(String opcion1,String opcion2, Double cantidad,double resultado) {

		switch(opcion1) {
		case " Segundos ":
			switch(opcion2) {
			case " Minutos ":
				resultado = cantidad / 60;

				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Horas ":
				resultado = cantidad / 3600;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Dias ":
				resultado = cantidad / 86400;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Semanas ":
				resultado = cantidad / 604800;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Meses ":
				resultado = cantidad / 2628000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Años ":
				resultado = cantidad / 31536000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Minutos ":
			switch(opcion2) {
			case " Segundos ":
				resultado = cantidad * 60;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Horas ":
				resultado = cantidad / 60;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Dias ":
				resultado = cantidad / 1440;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Semanas ":
				resultado = cantidad / 10080;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Meses ":
				resultado = cantidad / 43800 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Años ":
				resultado = cantidad / 525600;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Horas ":
			switch(opcion2) {
			case " Segundos ":
				resultado = cantidad * 3600;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Minutos ":
				resultado = cantidad * 60;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Dias ":
				resultado = cantidad / 24;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Semanas ":
				resultado = cantidad / 168;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Meses ":
				resultado = cantidad / 730.001;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Años ":
				resultado = cantidad  / 8766;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Dias ":
			switch(opcion2) {
			case " Segundos ":
				resultado = cantidad * 86400;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Minutos ":
				resultado = cantidad * 1440;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Horas ":
				resultado = cantidad * 24;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Semanas ":
				resultado = cantidad / 7;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Meses ":
				resultado = cantidad / 30.44;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Años ":
				resultado = cantidad  / 365 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Semanas ":
			switch(opcion2) {
			case " Segundos ":
				resultado = cantidad  * 604800;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Minutos ":
				resultado = cantidad * 10080;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);;
				break;
			case " Horas ":
				resultado = cantidad * 168;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Dias ":
				resultado = cantidad * 7;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Meses ":
				resultado = cantidad * 4.348;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Años ":
				resultado = cantidad  / 52.143;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Meses ":
			switch(opcion2) {
			case " Segundos ":
				resultado = cantidad  * 2628000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Minutos ":
				resultado = cantidad * 43800 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Horas ":
				resultado = cantidad * 730.001;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Dias ":
				resultado = cantidad * 30.44;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Semanas ":
				resultado = cantidad / 4.348;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Años ":
				resultado = cantidad  / 12;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;

		case " Años ":
			switch(opcion2) {
			case " Segundos ":
				resultado = cantidad  * 31536000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Minutos ":
				resultado = cantidad * 525600;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Horas ":
				resultado = cantidad * 8766;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Dias ":
				resultado = cantidad * 365;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Semanas ":
				resultado = cantidad * 52.143;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Meses ":
				resultado = cantidad * 12;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		default:
			resultado = 0.0;
			System.out.println(" Erro de convercion, opcion no encontrada");
			break;
		}
		return resultado;
	}
	
	/**
	 * Esta es la funcion para la convercion de la medida de velocidad
	 * @param opcion1
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	
	public static double funcionVelocidad(String opcion1,String opcion2, Double cantidad,double resultado) {

		switch(opcion1) {
		case " M/S ":
			switch(opcion2) {
			case " Km/S ":
				resultado = cantidad / 1000;

				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Mph ":
				resultado = cantidad * 2.23694;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Nudos ":
				resultado = cantidad * 1.94384 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies por Segundo ":
				resultado = cantidad * 3.28084;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		case " Km/S ":
			switch(opcion2) {
			case " M/S ":
				resultado = cantidad * 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Mph ":
				resultado = cantidad * 2236.94;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Nudos ":
				resultado = cantidad * 1943.84;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies por Segundo ":
				resultado = cantidad * 3280.84;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			
			break;
		case " Mph ":
			switch(opcion2) {
			case " M/S ":
				resultado = cantidad / 2.23694;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Km/S ":
				resultado = cantidad / 2236.94 ;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Nudos ":
				resultado = cantidad / 1.15078;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies por Segundo ":
				resultado = cantidad * 1.46667;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			 
			break;
		case " Nudos ":
			switch(opcion2) {
			case " M/S ":
				resultado = cantidad / 1.94384;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Km/S ":
				resultado = cantidad / 1943.84;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Mph ":
				resultado = cantidad * 1.15078;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Pies por Segundo ":
				resultado = cantidad * 1.68781;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			 
			break;
		case " Pies por Segundo ":
			switch(opcion2) {
			case " M/S ":
				resultado = cantidad  / 3.28084;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Km/S ":
				resultado = cantidad / 3280.84;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);;
				break;
			case " Mph ":
				resultado = cantidad / 1.46667;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Nudos ":
				resultado = cantidad / 1.68781;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		default:
			resultado = 0.0;
			System.out.println(" Erro de convercion, opcion no encontrada");
			break;
		}
		return resultado;
	}
	/**
	 * Esta es la funcion para la convencion de la unidad de precion
	 * @param opcion1
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	public static double funcionPrecion(String opcion1,String opcion2, Double cantidad,double resultado) {
		
		switch(opcion1) {
		case " Pascales ":
			switch(opcion2) {
			case " Bar ":
				resultado = cantidad / 100000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Psi ":
				resultado = cantidad / 6895;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mmHg ":
				resultado = cantidad / 133;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Atmosfera ":
				resultado = cantidad / 101325;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilopascales ":
				resultado = cantidad / 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
			
		case " Bar ":
			switch(opcion2) {
			case " Pascales ":
				resultado = cantidad * 100000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Psi ":
				resultado = cantidad * 14.504;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mmHg ":
				resultado = cantidad * 750.062;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Atmosfera ":
				resultado = cantidad * 0.986923;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilopascales ":
				resultado = cantidad * 100;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		
		case " Psi ":
			switch(opcion2) {
			case " Pascales ":
				resultado = cantidad * 6895;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Bar ":
				resultado = cantidad / 14.504;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mmHg ":
				resultado = cantidad * 51.715;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Atmosfera ":
				resultado = cantidad / 14.696;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilopascales ":
				resultado = cantidad  * 6.895;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
			
		case " mmHg ":
			switch(opcion2) {
			case " Pascales ":
				resultado = cantidad * 133;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Bar ":
				resultado = cantidad * 0.00133322;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Psi ":
				resultado = cantidad / 51.715;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Atmosfera ":
				resultado = cantidad * 0.00131579;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilopascales ":
				resultado = cantidad  * 0.133322;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		
		case " Atmosfera ":
			switch(opcion2) {
			case " Pascales ":
				resultado = cantidad  * 101325;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Bar ":
				resultado = cantidad * 1.01325;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Psi ":
				resultado = cantidad * 14.696;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mmHg ":
				resultado = cantidad * 0.00131579;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Kilopascales ":
				resultado = cantidad  * 101.325;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
			
		case " Kilopascales ":
			switch(opcion2) {
			case " Pascales ":
				resultado = cantidad  * 1000;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Bar ":
				resultado = cantidad * 0.01;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Psi ":
				resultado = cantidad * 0.14504;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " mmHg ":
				resultado = cantidad * 7.50062;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			case " Atmosfera ":
				resultado = cantidad / 101.325;
				System.out.println(" La convercion de " + opcion1 + " a " + opcion2 +" es : " + resultado);
				break;
			default:
				resultado = 0.0;
				System.out.println(" Erro de convercion, opcion no encontrada");
				break;
			}
			break;
		default:
			resultado = 0.0;
			System.out.println(" Erro de convercion, opcion no encontrada");
			break;
		}
		return resultado;
	}
}

