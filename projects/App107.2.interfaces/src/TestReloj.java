
public class TestReloj {

	public static void main(String[] args) {
		
		Reloj r1 = new Reloj();
		
		System.out.println(r1);
		
		r1.tic();
		r1.tic();
		r1.tic();
		r1.tac();
		r1.tac();
		r1.toc();
		
		System.out.println(r1);
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					r1.tic();
					System.out.println(r1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// ...
					}
				}
			}
		});
		
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
