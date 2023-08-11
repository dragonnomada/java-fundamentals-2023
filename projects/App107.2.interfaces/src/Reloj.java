
/*
 * Las clases puden implementar a las interfaces
 * si determinan cómo debería ser la implementación de
 * cada uno de los métodos propuestos en la interfaz.
 * 
 * La clase se comporta como la clase misma, por ejemplo,
 * el Reloj hace todo lo que un reloj hace.
 * 
 * Pero, también se comporta como un contador.
 * 
 */

public class Reloj implements Contador {

	protected int segundos = 0; // tic -> segundos++
	protected int minutos = 0; // tac -> minutos++
	protected int horas = 0; // toc -> horas

	public void tic() {
		segundos += 1;

		if (segundos == 60) {
			segundos = 0;
			tac();
		}
	}

	public void tac() {
		minutos += 1;

		if (minutos == 60) {
			minutos = 0;
			toc();
		}
	}

	public void toc() {
		horas += 1;
	}

	public int totalSegundos() {
		return segundos + 60 * minutos + 60 * 60 * horas;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d (%d)", horas, minutos, segundos, totalSegundos());
	}

	@Override
	public int obtenerValorActual() {
		return totalSegundos();
	}

	@Override
	public void incrementar() {
		tic();
	}

	@Override
	public void decrementar() {
		if (segundos == 0) {
			segundos = 59;

			if (minutos == 0) {
				minutos = 59;
				horas -= 1;
				return;
			}
			
			minutos -= 1;
			return;
		}
		
		segundos -= 1;
	}

	@Override
	public void reiniciar() {
		segundos = 0;
		minutos = 0;
		horas = 0;
	}

}
