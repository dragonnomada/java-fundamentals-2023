import java.util.Arrays;

public class Vector {

	double[] valores;
	int it = 0;
	
	public Vector(int tamaño) {
		valores = new double[tamaño];
	}
	
	// Método estático:
	// - Es un método que se puede llamar desde la clase: Vector.dot(v1, v2)
	// - No depende de una instancia y se usa para utilería,
	//   por ejemplo, para computar valores que no dependan de la clase
	//   sino, de instancias de alguna clase o parámetros en general
	// - Como el método estático no depende de una instancia, entonces
	//   no tenemos acceso a un `this`, es decir, no hay un contexto
	//   de instancia.
	public static double dot(Vector u, Vector v) {
		double s = 0;
		
		if (u.size() != v.size()) {
			System.out.println("[ADVERTENCIA] Los vectores no tienen el mismo tamaño");
			return 0;
		}
		
		for (int i = 0; i < u.size(); i++) {
			double ui = u.get(i);
			double vi = v.get(i);
			
			s += ui * vi;
		}
		
		return s;
	}
	
	public static double norm2(Vector u) {
		return Vector.dot(u, u);
	}
	
	public static double norm(Vector u) {
		return Math.sqrt(Vector.norm2(u));
	}
	
	public static double angle(Vector u, Vector v) {
		return Math.acos(Vector.dot(u, v) / (Vector.norm(u) * Vector.norm(v)));
	}

	public int size() {
		return valores.length;
	}
	
	public double get(int index) {
		return valores[index];
	}
	
	public void set(int index, double valor) {
		valores[index] = valor;
	}
	
	public boolean hasNext() {
		return it < valores.length;
	}
	
	public double next() {
		return valores[it++];
	}
	
	public void flush() {
		it = 0;
	}

	@Override
	public String toString() {
		return "Vector [valores=" + Arrays.toString(valores) + ", it=" + it + "]";
	}
	
}
