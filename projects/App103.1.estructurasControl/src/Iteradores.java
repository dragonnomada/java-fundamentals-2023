
/*
 * DIAGRAMA DE FLUJO DEL ITERADOR
 * 
 *        (INICIO)
 *           |
 *           v
 *  +---NO-{ i; ?; ++ }-SI---+
 *  |           ^            |
 * 	|           |           [V]
 *  |           |            |
 *  |           +------------+
 *  |
 *  +--------+
 *           |
 *          ...
 *           |
 *         (FIN)
 *         
 *  INICIO. for (i; ?; ++) { [V] } ... FIN
 * 
 */

public class Iteradores {

	public static void main(String[] args) {
		
		// INCREMENTO | SUSTICIÓN | ACUMULACIÓN
		// i++        | i = i + 1 | i += 1
		// i--        | i = i - 1 | i -= 1
		// ++i        | i = i + 1 | i += 1
		// --i        | i = i - 1 | i -= 1
		
		// SENTENCIA DE ITERADOR: ITERADOR i = INICIAL; CONDICIÓN; INCREMENTO => BLOQUE?
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Hola %d %n", i);
		}
		
		int s = 0;
		
		for (int j = 1; j <= 100; j++) {
			s += j; // 0 + 1 | 1 + 2 | 3 + 3 | 6 + 4 | 10 + 5 | 15 + 6 | ... | 4950 + 100	
		}
		
		System.out.printf("1 + 2 + 3 + ... + 98 + 99 + 100 = %d %n", s);
		
		/*    
		 *    A         B             C    
		 * | 1 3 |              |  5 19 10 |
		 * | 4 5 |  | 5 1 1 | = | 20 34 19 |
		 * | 7 9 |  | 0 6 3 |   | 35 61 34 |
		 * 
		 * 3x2 * 2x3 = 3x3
		 * 
		 */
		
		int[][] A = new int[][] {
				new int[] { 1, 3 },
				new int[] { 4, 5 },
				new int[] { 7, 9 },
		};
		
		int[][] B = new int[][] {
			new int[] { 5, 1, 1 },
			new int[] { 0, 6, 3 },
		};
		
		int[][] C = new int[][] {
			new int[] { 0, 0, 0 },
			new int[] { 0, 0, 0 },
			new int[] { 0, 0, 0 },
		};
		
		// A
		System.out.println("+---------+");
		System.out.printf("| A:%2d x%2d|%n", A.length, A[0].length);
		System.out.println("+----+----+");
		for (int i = 0; i < A.length; i++) {
			int[] Ai = A[i]; // [1, 3] | [4, 5] | [7, 9]
			
			System.out.print("| ");
			
			for (int j = 0; j < Ai.length; j++) {
				int Aij = Ai[j]; // A[i][j]
				System.out.printf("%3d ", Aij);
			}
			
			System.out.print("|");
			
			System.out.println();
		}
		System.out.println("+----+----+");
		
		System.out.println();
		
		// B
		System.out.println("+----+---+----+");
		System.out.printf("| B:%2d x%2d    |%n", B.length, B[0].length);
		System.out.println("+----+---+----+");
		for (int i = 0; i < B.length; i++) {
			int[] Bi = B[i]; // [1, 3] | [4, 5] | [7, 9]
			
			System.out.print("| ");
			
			for (int j = 0; j < Bi.length; j++) {
				int Bij = Bi[j]; // A[i][j]
				System.out.printf("%3d ", Bij);
			}
			
			System.out.print("|");
			
			System.out.println();
		}
		System.out.println("+----+---+----+");
		
		System.out.println();
		
		// A * B
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				int ss = 0;
				for (int k = 0; k < A[0].length; k++) {
					 ss += A[i][k] * B[k][j];
				}
				C[i][j] = ss;
			}
		}
		
		// C
		System.out.println("+----+---+----+");
		System.out.printf("| C:%2d x%2d    |%n", C.length, C[0].length);
		System.out.println("+----+---+----+");
		for (int i = 0; i < C.length; i++) {
			int[] Ci = C[i]; // [1, 3] | [4, 5] | [7, 9]
			
			System.out.print("| ");
			
			for (int j = 0; j < Ci.length; j++) {
				int Cij = Ci[j]; // A[i][j]
				System.out.printf("%3d ", Cij);
			}
			
			System.out.print("|");
			
			System.out.println();
		}
		System.out.println("+----+---+----+");
		
		System.out.println();
		
	}
	
}
