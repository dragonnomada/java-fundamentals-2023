
/*
 * DIAGRAMA DE FLUJO DEL CICLO CONDICIONAL
 * 
 *        (INICIO)
 *           |
 *           v
 *           ^
 *  +---NO-< ? >-SI---+
 *  |        v        |
 * 	|        ^       [V]
 *  |        |        |
 *  |        +--------+
 *  |
 *  +--------+
 *           |
 *          ...
 *           |
 *         (FIN)
 *         
 *  INICIO. while (?) { [V] } ... FIN
 * 
 */

public class Ciclos {

	public static void main(String[] args) {
		
		// SENTENCIA DE CICLO CONDICIONAL: CONDICIÓN => BLOQUE?
		
		while (true) {
			System.out.println("Es ciclo se repetirá infinitamente");
			break;
			//System.out.println("Está línea ya no alcanzó a ejecutarse");
		}
		
		System.out.println("El ciclo se rompió y no estuvo infinitamente");
		
		double suma = 1.0;
		
		while (suma < 1000) {
			suma = 1.8 * suma;
			System.out.printf("%.4f %n", suma);
		}
		
		System.out.printf("La suma final fue: %.1f %n", suma);
		
		int a = 978321; // 0/1 | 0/1 | ... | 0/1 <- IZQUIERDA A DERECHA
		
		String b = "";
		
		while (a > 0) {
			int d = a % 2;
			b = String.valueOf(d) + b; // ... + ("0" + ("0" + ("1" + (""))))
			System.out.printf("%d", d);
			a = a / 2;
		}
		
		System.out.println();
		
		System.out.println(b);
		
		// b = "11110010101001010101011";
		
		int j = 0;
		
		int c = 0;
		
		while (j < b.length()) {
			int d = b.charAt(j) - '0'; // '1' - '0' | 49 - 48 = 1
			
			c = (int)(c + Math.pow(2, b.length() - 1 - j) * d);
			
			j++;
		}
		
		System.out.println(c);
		
	}
	
}
