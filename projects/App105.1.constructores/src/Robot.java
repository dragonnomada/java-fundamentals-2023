
/*
 * Variables no-estáticas (propiedades de la clase)
 * - Sólo pueden ser accedidas a través de una instancia
 *   Por ejemplo, Robot robot = new Robot(...)
 *                robot.x | this.x
 * 
 * Variables estáticas (variables de la clase)
 * - No dependen de una instancia
 *   Por ejemplo, int direccion = Robot.NORTE
 *   
 * Variables finales (constantes)
 * - No permiten cambiar el valor
 *   Por ejemplo, ERROR: Robot.NORTE = 8
 * 
 */

public class Robot {

	// VARIABLES FINALES ESTÁTICAS
	public final static int NORTE = 0; // Robot.NORTE ~ 0
	public final static int ESTE = 1;  // Robot.ESTE  ~ 1
	public final static int SUR = 2;   // Robot.SUR   ~ 2
	public final static int OESTE = 3; // Robot.OESTE ~ 3
	
	String nombre; // null
	int x; // 0
	int y; // 0
	int direccion; // 0
	
	// CONSTRUCTOR Robot robot = new Robot([String], [int])
	public Robot(String nombre, int direccion) {
		// TODO: Validar los parámetros de construcción
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void avanzar() {
		switch (direccion) {
		case Robot.NORTE: // case 0:
			y++; // NORTE
			break;
		case Robot.ESTE: // case 1:
			x++; // ESTE
			break;
		case Robot.SUR: // case 2:
			y--; // SUR
			break;
		case Robot.OESTE: // case 3:
			x--; // OSTE
			break;
		default:
			System.out.println("[ADVERTENCIA] LA dirección no es válida");
			break;
		}
	}

	@Override
	public String toString() {
		String direccionTexto = "DESCONOCIDA";
		
		switch (direccion) {
		case Robot.NORTE: // case 0:
			direccionTexto = "NORTE";
			break;
		case Robot.ESTE: // case 1:
			direccionTexto = "ESTE";
			break;
		case Robot.SUR: // case 2:
			direccionTexto = "SUR";
			break;
		case Robot.OESTE: // case 3:
			direccionTexto = "OSTE";
			break;
		}
		
		return "Robot [nombre=" + nombre + ", x=" + x + ", y=" + y + ", direccion=" + direccionTexto + "]";
	}
	
}
