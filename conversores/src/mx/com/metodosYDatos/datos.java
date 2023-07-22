package mx.com.metodosYDatos;
/**
 * 
 * @author erisi
 *
 */
public interface datos {
	/**
	 * Divisa con su valor en double qué equivale 1 Peso Mexicano
	 */
	//PESO MEXICANO
	double MEXICANO = 1; 
	//BOLIVAR
	double VENEZOLANO = 1969.370;
	//CORONA
	double CHECA = 1.263;
	//CORONA
	double DANESA = 0.396;
	//CORONA
	double NORUEGA = 0.600;
	//CORONA
	double SUECA = 0.611;
	//DINAR
	double KUWAIT = 0.018;
	//DIRHAM
	double EMIRATOS = 0.219;
	//DÓLAR
	double USA = 0.059;
	//DÓLAR
	double AUSTRALIANO = 0.087;
	//DÓLAR
	double CANADIENSE = 0.078;
	//DÓLAR
	double HONG_KONG = 0.466;
	//DÓLAR
	double NEOZELANDES = 0.093;
	//DÓLAR
	double SINGAPUR = 0.078;
	//EURO
	double EURO = 0.053;
	//FLORIN
	double HÚNGARO = 19.900;
	//FRANCO
	double SUIZO = 0.051;
	//Libra
	double LIBRA = 0.045;
	//LIRA
	double TURCA = 1.562;
	//LITAS
	double LITUANO = 0.175;
	//PESO
	double ARGENTINO = 15.820;
	//PESO
	double CHILENO = 48.604;
	//PESO
	double COLOMBIANO = 242.799;
	//PESO
	double URUGUAYO = 2.275;
	//RAND
	double SUDAFRICANO = 1.080;
	//REAL
	double BRASILENO = 0.286;
	//RIAL
	double SAUDI = 0.223;
	//RINGGIT
	double MALASIO = 0.270;
	//RUBLO
	double RUSO = 5.388;
	//RUPIA
	double INDIA = 4.900;
	//SHEKEL
	double ISRAELI = 0.220;
	//YEN
	double YEN = 8.287;
	//YUAN
	double YUAN = 0.426;
	//ZLOTY
	double POLACO = 0.236;
/**
 * aqui se pusieron los valores de las divisas en un array
 */
	double[] divisasValor = {
			MEXICANO,	//0
			VENEZOLANO,	//1
			CHECA,		//2
			DANESA, 	//3				
			NORUEGA, 	//4				
			SUECA, 		//5			
			KUWAIT, 	//6				
			EMIRATOS, 	//7				
			USA, 	//8				
			AUSTRALIANO,//9 					
			CANADIENSE,	//10			
			HONG_KONG, 	//11				
			NEOZELANDES,//12 					
			SINGAPUR, 	//13			
			EURO, 		//14			
			HÚNGARO, 	//15				
			SUIZO, 		//16			
			LIBRA, 		//17			
			TURCA, 		//18			
			LITUANO, 	//19				
			ARGENTINO, 	//20				
			CHILENO, 	//21				
			COLOMBIANO,	//22				
			URUGUAYO,	//23				
			SUDAFRICANO,//24 					
			BRASILENO, 	//25				
			SAUDI,		//26			
			MALASIO, 	//27				
			RUSO, 		//28			
			INDIA, 		//29			
			ISRAELI, 	//30				
			YEN, 		//31			
			YUAN, 		//32			
			POLACO      //33



	};
/**
 * aqui se puso el nombre de las divisas en un array en el mismo orden que en los valores
 */
	String[] divisasString = {
			" PESOS MEXICANO",	//0
			" BOLIVAR VENEZOLANO",	//1
			" CORONA CHECA",		//2
			" CORONA DANESA", 	//3				
			" CORONA NORUEGA", 	//4				
			" CORONA SUECA", 		//5			
			" DINAR KUWAIT", 	//6				
			" DIRHAM EMIRATOS", 	//7				
			" DOLLAR USA", 	//8				
			" DOLLAR AUSTRALIANO",//9 					
			" DOLLAR CANADIENSE",	//10			
			" DOLLAR HONG KONG", 	//11				
			" DOLLAR NEOZELANDÉS",//12 					
			" DOLLAR SINGAPUR", 	//13			
			" EUROS ", 		//14			
			" FLORIN HÚNGARO", 	//15				
			" FRANCO SUIZO", 		//16			
			" LIBRAS ", 		//17			
			" LIRA TURCA", 		//18			
			" LITAS LITUANO", 	//19				
			" PESO ARGENTINO", 	//20				
			" PESO CHILENO", 	//21				
			" PESO COLOMBIANO",	//22				
			" PESO URUGUAYO",	//23				
			" RAND SUDAFRICANO",//24 					
			" REAL BRASILEÑO", 	//25				
			" RIAL SAUDI",		//26			
			" RINGGIT MALASIO", 	//27				
			" RUBLO RUSO", 		//28			
			" RUPIA INDIA", 		//29			
			" SHEKEL ISRAELI", 	//30				
			" YENS ", 		//31			
			" YUANS ", 		//32			
			" ZLOTY POLACO"      //33



	};
	/**
	 * datos de los grados y los arrays
	 */
	double CELSIUS = 0.0;
	double FAHRENHEIT = 0.0;
	double KELVIN = 0.0;
	
	Double[] gradosValor = {
			CELSIUS,
			FAHRENHEIT,
			KELVIN
	};
	String[] grados = {
			" Grados Celsius ",
			" Grados Fahrenheit ",
			" Grados Kelvin "
	};
	
	/**
	 * datod y arrays de las medidas
	 * 
	 * De metros a pies: pies = metros * 3.28084
	 * De pies a metros: metros = pies / 3.28084
	 * De metros a pulgadas: pulgadas = metros * 39.3701
	 * De pulgadas a metros: metros = pulgadas / 39.3701
	 * De kilómetros a millas: millas = kilómetros * 0.621371
	 * De millas a kilómetros: kilómetros = millas / 0.621371
	 * De centímetros a pulgadas: pulgadas = centímetros / 2.54
	 * De pulgadas a centímetros: centímetros = pulgadas * 2.54
	 * 
	 */
	String[] longitud = {
			" Metros ",
			" Kilometros ",
			" Centimetros ",
			" Pulgadas ",
			" Pies ",
			" Yardas ",
			" Millas "
	};
	
	
	
}
