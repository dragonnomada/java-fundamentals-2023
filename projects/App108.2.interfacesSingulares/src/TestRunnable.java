import java.util.Date;

// Las interfaces que quieren ser usadas como objetos
// tienen que proveer una implementaci�n directa
// por ejemplo, podr�an implementar en una clase el m�todo
// establecido por la interfaz o directamente en la definici�n del objeto
// es decir, al instanciar una interfaz, podemos proveer su funcionalidad
// directamente (Java 8+)

// La interfaz Runnable es una interfaz singular (de un s�lo m�todo)
// llamado run, el cu�l puede ser invocado cu�ndo se desee.

public class TestRunnable {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable disparador = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Se ejecut� el disparador: " + new Date());
				// TODO: Hacer algo cada que se invoque el m�todo run
				try {
					Thread.sleep(10_000);
				} catch (InterruptedException e) {
					System.out.println("La tarea fall�");
					return;
				}
				System.out.println("La tarea ha sido completada");
			}
			
		};
		
		disparador.run(); // Tarda 10 segundos en completarse (+10)
		
		Thread.sleep(5_000); // +5 segundos
		
		disparador.run(); // Tarda 10 segundos (+10) 
		
		// el progama terminar� despu�s de +25 segundos
		
	}
	
}
