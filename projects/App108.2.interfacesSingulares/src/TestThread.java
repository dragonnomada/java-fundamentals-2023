import java.util.Date;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Comienza la tarea 1: " + new Date());
				try {
					Thread.sleep(10_000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Termina la tarea 1: " + new Date());
			}
			
		};
		
		Runnable task2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Comienza la tarea 2: " + new Date());
				try {
					Thread.sleep(5_000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Termina la tarea 2: " + new Date());
			}
		};
		
//		task1.run(); // +10s
//		task2.run(); // +5s
//		
//		// TOTAL: 15s
		
		// Los hilos nos permiten ejectuar tareas en procesos concurrentes
		// o llamados procesos background
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start(); // +0s
		t2.start(); // +0s
		
		t1.join(); // ? +10s
		t2.join(); // ? +5s
		
		// TOTAL: max (10s, 5s) -> 10s
		
	}
	
}
