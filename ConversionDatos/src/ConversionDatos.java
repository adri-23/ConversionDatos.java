
public class ConversionDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * tipos de datos en java
		 * Numericos:byte, short, int, long, float, double
		 * Booleanos (verdadero, falso): boolean
		 * Caracteres: char
		 * Cadenas:String
		 */
		/*
		 * byte 8 bytes
		 * short 16 bytes
		 * int 32 bits
		 * long 64 bits
		 */
		
		//recordemos que un byte puede almacenar de -128 a 127
		//por eso utilizamos el tipo de dato int para que no tengamos errores
		byte numeropequeno = 122;
		byte otronumeropequeno = 122;
		int suma = numeropequeno + otronumeropequeno;
		
		int numero1 = 1000;
		long numero2= numero1;
		float numero3 = numero2;
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(suma);
		
		//casteo de datos 
		long num1= 1000;
		int num2= (int) num1; // casteo de long a int
		float num3 = num2;
	}


}

