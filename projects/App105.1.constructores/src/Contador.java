
public class Contador {

	private int conteo;

	private String nombre;
	private int min;
	private int max;
	
	// CONSTRUCTOR: Inicializar los valores de las propiedades
	public Contador(String nombre, int min, int max) {
		this.nombre = nombre;
		this.min = min;
		this.max = max;
		
		this.conteo = min;
	}
	
	public void incrementar() {
		if (++conteo >= max) {
			conteo = max;
		}
	}
	
	public void decrementar() {
		if (--conteo <= min) {
			conteo = min;
		}
	}

	@Override
	public String toString() {
		return String.format("%s (%d) [%d, %d]", nombre, conteo, min, max);
	}
	
	
	
}
