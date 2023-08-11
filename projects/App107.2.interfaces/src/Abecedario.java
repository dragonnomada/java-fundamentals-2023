
public class Abecedario implements Contador {

	private String cadena = "";
	
	public void expandirDerecha() {
		char c = (char)('A' + cadena.length());
		
		cadena += String.valueOf(c);
	}
	
	public void contraerIzquierda() {
		if (cadena.length() == 0) {
			return;
		}
		
		cadena = cadena.substring(0, cadena.length() - 1);
	}
	
	@Override
	public String toString() {
		return cadena;
	}

	@Override
	public int obtenerValorActual() {
		return cadena.length();
	}

	@Override
	public void incrementar() {
		expandirDerecha();
	}

	@Override
	public void decrementar() {
		contraerIzquierda();
	}

	@Override
	public void reiniciar() {
		cadena = "";
	}
	
}
