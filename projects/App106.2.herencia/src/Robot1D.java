
/*
 * 
 * Los niveles de acceso protegen propiedades y m�todos para que no se puedan
 * modificar fuera de la clase, al menos que se haga expl�cito con `public`
 * 
 * private - Especifica que s�lo dentro de la clase se puede acceder propiedad/m�todo
 * protected - Especifica que s�lo la clase y sus extendidas pueden acceder propiedad/m�todo
 * default - Especifica que s�lo las clases dentro del mismo paquete pueden acceder propiedad/m�todo
 * public - Especifica que cualquier clase de cualquier paquete puede acceder propiedad/m�todo
 * 
 */

public class Robot1D {

	// El nivel `protected` dice:
	// A todos mis hijos (mis clases derivadas o extendidas)
	// les pido que protejan esta variable
	// Es decir, projan la integridad de la x para que no sea
	// usada de forma mal intencionada
	// A esto se le conoce como `ENCAPSULAMIENTO`
	protected int x = 0;
	
	public void avanzar() {
		x += 1;
	}
	
	public void avanzar(int pasos) {
		if (pasos < 0) {
			return;
		}
		x += pasos;
	}
	
	public void retroceder() {
		x -= 1;
	}
	
	public void retroceder(int pasos) {
		if (pasos < 0) {
			return;
		}
		x -= pasos;
	}

	@Override
	public String toString() {
		return "Robot1D [x=" + x + "]";
	}
	
}
