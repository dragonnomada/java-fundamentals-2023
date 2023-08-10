
public class Contador {

	private int valor;

	// ()
	public Contador() {
		valor = 0;
	}
	
	// (int)
	public Contador(int inicial) {
		valor = inicial;
	}
	
	// () -> void
	public void incrementar() {
		valor += 1;
	}

	// SOBRECARGA +1
	// (int) -> void
	public void incrementar(int salto) {
		valor += salto;
	}

	// SOBRECARGA +2
	// (int, int) -> int
	public int incrementar(int mul, int offset) { // 0 3 9 21 45 93 ...
		int ans = valor;

		valor = mul * valor + offset;

		return ans;
	}

	// () -> void
	public void decrementar() {
		valor -= 1;
	}

	// SOBRECARGA +1
	// (int) -> void
	public void decrementar(int salto) {
		for (int i = 0; i < salto; i++) {
			// decrementar(); // decrementar: () -> void
			incrementar(-1); // incrementar: (int) -> void
		}
	}

	@Override
	public String toString() {
		return "Contador [valor=" + valor + "]";
	}

}
