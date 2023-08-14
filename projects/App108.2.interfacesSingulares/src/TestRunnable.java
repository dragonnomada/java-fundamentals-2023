import java.util.Date;

// Las interfaces que quieren ser usadas como objetos
// tienen que proveer una implementación directa
// por ejemplo, podrían implementar en una clase el método
// establecido por la interfaz o directamente en la definición del objeto
// es decir, al instanciar una interfaz, podemos proveer su funcionalidad
// directamente (Java 8+)

// La interfaz Runnable es una interfaz singular (de un sólo método)
// llamado run, el cuál puede ser invocado cuándo se desee.

public class TestRunnable {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable disparador = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Se ejecutó el disparador: " + new Date());
				// TODO: Hacer algo cada que se invoque el método run
				try {
					Thread.sleep(10_000);
				} catch (InterruptedException e) {
					System.out.println("La tarea falló");
					return;
				}
				System.out.println("La tarea ha sido completada");
			}
			
		};
		
		disparador.run(); // Tarda 10 segundos en completarse (+10)
		
		Thread.sleep(5_000); // +5 segundos
		
		disparador.run(); // Tarda 10 segundos (+10) 
		
		// el progama terminará después de +25 segundos
		
	}
	
}
