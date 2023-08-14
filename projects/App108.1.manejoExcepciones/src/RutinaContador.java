
public class RutinaContador {

	Contador contador = new Contador();

	int pasosTotal = 0;

	public void avanzar(int pasos) {
		for (int i = 0; i < pasos; i++) {
			contador.incrementar();
		}

		pasosTotal += pasos;
	}

	// La propagación de error consiste en marcar un método
	// con el tipo de falla que se podría originar
	// si no se controlara el proceso (la operación)
	public void retroceder() throws Exception {
		while (pasosTotal > 0) {
			// Cuándo no seamos capaces de controlar un error inesperado
			// marcado por alguna función (no podemos usar try-catch, porque
			// no sabríamos que poner, por ejemplo, no sabríamos si en este
			// momento el programa debería terminar, o solo advertirle al
			// usuario con una alerta o impresión que no haga mal las cosas)
			// Una manera de "controlar" o delegar el control
			// es mediante el mismo marcado del TIPO EXCEPCION
			// para advertir que este método también es propenso a fallar
			// usando exactamente la misma falla relacionada
			contador.decrementar(); // FALLA: -> Exception
			pasosTotal -= 1;
		}
	}
	
	public void reiniciar() {
		pasosTotal = 0;
		contador = new Contador();
	}

	@Override
	public String toString() {
		return "RutinaContador [contador=" + contador + ", pasosTotal=" + pasosTotal + "]";
	}

}
