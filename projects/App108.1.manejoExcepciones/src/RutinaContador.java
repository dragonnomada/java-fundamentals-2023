
public class RutinaContador {

	Contador contador = new Contador();

	int pasosTotal = 0;

	public void avanzar(int pasos) {
		for (int i = 0; i < pasos; i++) {
			contador.incrementar();
		}

		pasosTotal += pasos;
	}

	// La propagaci�n de error consiste en marcar un m�todo
	// con el tipo de falla que se podr�a originar
	// si no se controlara el proceso (la operaci�n)
	public void retroceder() throws Exception {
		while (pasosTotal > 0) {
			// Cu�ndo no seamos capaces de controlar un error inesperado
			// marcado por alguna funci�n (no podemos usar try-catch, porque
			// no sabr�amos que poner, por ejemplo, no sabr�amos si en este
			// momento el programa deber�a terminar, o solo advertirle al
			// usuario con una alerta o impresi�n que no haga mal las cosas)
			// Una manera de "controlar" o delegar el control
			// es mediante el mismo marcado del TIPO EXCEPCION
			// para advertir que este m�todo tambi�n es propenso a fallar
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
