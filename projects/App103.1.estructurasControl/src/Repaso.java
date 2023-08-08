
public class Repaso {

	public static void main(String[] args) {
		
		// ARREGLOS: Un tipo T puede ser usado como
		//           arreglo (replicado en memoria)
		//           mediante T[]
		
		// Podemos reservar memoria para un arreglo
		// mediante: new T[<tamaño>]
		
		int[] primos = new int[100]; // primos es un arreglo con 100 enteros
		int i = 0;
		int n = 2;
		
		while (i < 100) {
			
			boolean esPrimo = true;
			
			for (int j = 0; j < i; j++) {
				int p = primos[j];
				if (n % p == 0) {
					esPrimo = false;
				}
			}
			
			if (esPrimo) {
				System.out.printf("%d - PRIMO %n", n);
				primos[i++] = n;
			} else {
				System.out.printf("%d - NO-PRIMO %n", n);
			}
			
			n += 1;
		}

		System.out.println();
		
		for (int j = 0; j < 100; j++) {
			char c = (j + 1) % 5 == 0 ? '\n' : ',';
			
			System.out.printf("%3d%c ", primos[j], c);
		}
		
		System.out.println();
		
	}
	
}
