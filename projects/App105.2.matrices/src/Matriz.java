
public class Matriz {

	private double[][] valores;
	private int n;
	private int m;

	public Matriz(int n, int m) {
		valores = new double[n][m];
		this.n = n; // n = n (absurdo)
		this.m = m; // m = m (absurdo)
	}

	public Matriz T() {
		Matriz matrizTranspuesta = new Matriz(m, n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrizTranspuesta.set(j, i, this.get(i, j));
			}
		}

		return matrizTranspuesta;
	}

	public Matriz adyacente(int i, int j) {
		Matriz matrizTranspuesta = new Matriz(n - 1, m - 1);

		int iii = 0;
		for (int ii = 0; ii < n; ii++) {
			if (ii == i)
				continue;
			int jjj = 0;
			for (int jj = 0; jj < m; jj++) {
				if (jj == j)
					continue;
				matrizTranspuesta.set(iii, jjj, this.get(ii, jj));
				jjj++;
			}
			iii++;
		}

		return matrizTranspuesta;
	}

	public Matriz copy() {
		Matriz otraMatriz = new Matriz(n, m);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				otraMatriz.set(i, j, this.get(i, j));
			}
		}

		return otraMatriz;
	}

	public double get(int i, int j) {
		return valores[i][j];
	}

	public void set(int i, int j, double valor) {
		valores[i][j] = valor;
	}

	public void fill(double valor) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				valores[i][j] = valor;
			}
		}
	}

	public void diag() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i != j) {
					valores[i][j] = 0;
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(String.format("MATRIZ %d x %d %n", n, m));
		
		for (int j = 0; j < m; j++) {
			builder.append("--------");
		}
		builder.append("\n");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				builder.append(String.format("%7.2f ", get(i, j)));
			}
			builder.append("\n");
		}

		for (int j = 0; j < m; j++) {
			builder.append("--------");
		}
		builder.append("\n");
		
		return builder.toString();
	}

}
