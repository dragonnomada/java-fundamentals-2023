import java.util.Date;

public class TestThreadLambda {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> {
			System.out.println("Comienza la tarea 1: " + new Date());
			try {
				Thread.sleep(10_000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Finalizó la tarea 1: " + new Date());
		});
		
		Thread t2 = new Thread(() -> {
			System.out.println("Comienza la tarea 2: " + new Date());
			try {
				Thread.sleep(5_000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Finalizó la tarea 2: " + new Date());
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Ambas tareas finalizaron: " + new Date());
		
	}
	
}
