
/*
 * DIAGRAMA DE FLUJO DEL SECUENCIADOR
 * 
 *        (INICIO)
 *           |
 *           v
 *  +---NO-{ x : Q }-SI---+
 *  |           ^            |
 * 	|           |           [Bx]
 *  |           |            |
 *  |           +------------+
 *  |
 *  +--------+
 *           |
 *          ...
 *           |
 *         (FIN)
 *         
 *  INICIO. for (x : Q) { [Bx] } ... FIN
 * 
 */

/*
 *  PARA x << Q:
 *  	BLOQUE(x) 
 */

public class Secuenciadores {

	public static void main(String[] args) {

		String[] frutas = new String[5];

		frutas[0] = "Manzana";
		frutas[1] = "Mango";
		frutas[2] = "Kiwi";
		frutas[3] = "Melón";
		frutas[4] = "Guayaba";
		// frutas[5] = "Fresa"; // Índice fuera del rango

		/*
		 * for (int i = 0; i < frutas.length; i++) { String fruta = frutas[i];
		 * System.out.println(fruta); }
		 */

		for (String fruta : frutas) {
			System.out.printf("%s (%d) %n", fruta, fruta.length());
		}

		System.out.println("-------------------------------");

		int[] edades = new int[11];

		edades[0] = 23;
		edades[1] = 32;
		edades[2] = 19;
		edades[3] = 28;
		edades[4] = 19;
		edades[5] = 25;
		edades[6] = 26;
		edades[7] = 31;
		edades[8] = 45;
		edades[9] = 16;
		edades[10] = 35;

		int s = 0;

//		for (int i = 0; i < edades.length; i++) {
//			int edad = edades[i];
//			s = s + edad;
//		}

		for (int edad : edades) {
			s = s + edad;
		}

		System.out.printf("Suma edades: %d %n", s);

		int n = edades.length;

		double promedio = 1.0 * s / n;

		System.out.printf("Promedio edades: %.2f %n", promedio);

	}

}
