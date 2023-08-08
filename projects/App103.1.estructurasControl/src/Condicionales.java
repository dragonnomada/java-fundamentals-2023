import java.util.Date;
import java.util.Scanner;

/*
 * DIAGRAMA DE FLUJO DE LA CONDICIONAL
 * 
 *        (INICIO)
 *           |
 *           v
 *           ^
 *  +---NO-< ? >-SI---+
 *  |        v        |
 * [F]               [V]
 *  |                 |
 *  +--------*--------+
 *           |
 *          ...
 *           |
 *         (FIN)
 *         
 *  INICIO. if (?) { [V] } else { [F] } ... FIN
 * 
 */

public class Condicionales {

	public static void main(String[] args) {
		
		// SENTENCIA: TIPO CLASE (+BLOQUE)
	
		// SENTENCIA: TIPO MÉTODO (+BLOQUE)
		
		// SENTENCIA: TIPO CONTROL (+BLOQUE)
		
		// SENTENCIA CONDICIONAL: CONDICIÓN -> BLOQUE?
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dame el valor de x: ");
		
		int x = scanner.nextInt();
		
		if (x > 3) {
			System.out.printf("%d es mayor a 3 %n", x);
		}
		
		// SENTENCIA CONDICIONAL DOBLE: CONDICIÓN -> BLOQUE_V? : BLOQUE_F?
		
		if (x > 2 && x < 10) {
			System.out.printf("2 < %d < 10 | x ⇥  (2, 10) %n", x);
		} else {
			System.out.printf("%d <= 2 | x ⇥ (-inf, 2] %n", x);
		}
		
		// SENTENCIA CONDICIONAL MÚLTIPLE: 
		// CONDICIÓN_1 -> BLOQUE_1? : 
		// CONDICIÓN_2 -> BLOQUE_2? :
		// ...
		// CONDICIÓN_N -> BLOQUE_N? :
		// SINO : BLOQUE_F?
		
		if (x > 0) {
			System.out.printf("%d es positivo (estricto) %n", x);
		} else if (x < 0) {
			System.out.printf("%d es negativo (estricto) %n", x);
		} else {
			System.out.printf("%d es cero %n", x);			
		}
		
		// EXPRESIONES LÓGICAS
		// -> ES TODA OPERACIÓN QUE DEVUELVA UN BOOLEAN COMO RESULTADO
		//    Y SE CONSIDERA EL PREDICADO O LA CONDICIÓN
		
		boolean esCasado = false;
		
		if (esCasado) {
			System.out.println("Es casado");
		} else {
			System.out.println("No está casado");
		}
		
		Date now = new Date();
		
		if (now.getDay() == 0) {
			System.out.println("Hoy es Domingo");
		} else {
			System.out.println("No es Domingo");
		}
		
	}
	
}
