import javax.swing.JFrame;

public class App {

	// ALT+SHIFT+X -> J
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Mi App");
		
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}

/*
 * 1. Importa el tipo JFrame (javax.swing.JFrame)
 * 2. Declara la clase App
 *    [define la clase App]
 * 3. Declara un punto de ejecución para la clase App (public static void main(String[] args) { ... })
 * 	  [define el método principal]
 * 4. Crea una instancia de la clase JFrame()
 *    4.1 Declara la variable tipo frame de JFrame
 *    4.2 Crea una referencia a una instancia nueva de JFrame (new JFrame())
 *    4.3 Llama al constructor por defecto (vacío) de JFrame
 *    [Construye una venta de Java Swing vacía]
 * 5. Llama al método setSize de frame con sobrecarga (int, int) con valores (400, 400)
 *    [define el tamaño de la venta]
 * 6. Llama al método setDefaultCloseOperation con sobrecarga (int) con valor JFrame.EXIT_ON_CLOSE -> int 
 * 	  [define que el programa termine cuándo se cierra la ventana]
 * 7. Llama al método setVisible con sobrecarga (boolean) con valor true 
 *    [hacer visible la ventana]
 * 
 */