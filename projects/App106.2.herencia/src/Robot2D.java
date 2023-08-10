
/*
 * 
 * Cuándo extendemos una clase, la clase a extender se conoce como la `superclase`
 * Y la clase extendida se conoce como la clase actual o la clase derivada
 * 
 * Si queremos acceder a funcionalidad previa que haya sido reemplazada
 * lo podemos conseguir a través de super.
 * 
 * Es decir, `super.foo()` accede al método `foo()` definido en la clase superior
 * y `this.foo()` accede al método `foo()` definido en la clase actual
 * 
 */

public class Robot2D extends Robot1D {

	public static final int NORTE = 0;
	public static final int ESTE = 1;
	public static final int SUR = 2;
	public static final int OESTE = 3;
	
	// +x
	protected int y = 0;
	protected int direccion = Robot2D.ESTE;
	
	@Override
	public void avanzar(int pasos) {
		switch (direccion) {
		case Robot2D.ESTE:
			x += pasos; // La superclase no permite modificar la `x`
			        // Debemos cambiar el nivel de acceso de la `x`
			        // Para que los hijos la puedan modificar
			break;
		case Robot2D.OESTE:
			x -= pasos;
			break;
		case Robot2D.NORTE:
			y += pasos;
			break;
		case Robot2D.SUR:
			y -= pasos;
			break;
		default:
			break;
		}
	}
	
	@Override
	public void retroceder(int pasos) {
		switch (direccion) {
		case Robot2D.ESTE:
			x -= pasos;
			break;
		case Robot2D.OESTE:
			x += pasos;
			break;
		case Robot2D.NORTE:
			y -= pasos;
			break;
		case Robot2D.SUR:
			y += pasos;
			break;
		default:
			break;
		}
	}
	
	@Override
	public void avanzar() {
		this.avanzar(1);
	}
	
	@Override
	public void retroceder() {
		this.retroceder(1);
	}

	public void girarDerecha() {
		switch (direccion) {
		case Robot2D.ESTE:
			direccion = Robot2D.SUR;
			break;
		case Robot2D.OESTE:
			direccion = Robot2D.NORTE;
			break;
		case Robot2D.NORTE:
			direccion = Robot2D.ESTE;
			break;
		case Robot2D.SUR:
			direccion = Robot2D.OESTE;
			break;
		default:
			break;
		}
	}
	
	public void girarIzquierda() {
		switch (direccion) {
		case Robot2D.ESTE:
			direccion = Robot2D.NORTE;
			break;
		case Robot2D.OESTE:
			direccion = Robot2D.SUR;
			break;
		case Robot2D.NORTE:
			direccion = Robot2D.OESTE;
			break;
		case Robot2D.SUR:
			direccion = Robot2D.ESTE;
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		String leyenda = "INVALIDA";
		
		switch (direccion) {
		case Robot2D.ESTE:
			leyenda = "ESTE";
			break;
		case Robot2D.OESTE:
			leyenda = "OESTE";
			break;
		case Robot2D.NORTE:
			leyenda = "NORTE";
			break;
		case Robot2D.SUR:
			leyenda = "SUR";
			break;
		default:
			break;
		}
		
		return "Robot2D [x=" + x + " y=" + y + ", direccion=" + leyenda + "]";
	}
	
}
