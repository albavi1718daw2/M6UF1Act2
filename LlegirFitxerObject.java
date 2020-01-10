import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class LlegirFitxerObject {

	public static void recuperarTodos() throws ClassNotFoundException, IOException {

		// Campo variable tipo coche
		Coche coche;

		// Declaración del fichero
		File fichero = new File("coches.txt");

		// Crea el flujo de entrada
		FileInputStream filein = new FileInputStream(fichero);

		// Conectar el flujo de bytes al flujo de entrada
		ObjectInputStream dataInCoche = new ObjectInputStream(filein);

		try {

			int contador = 1;
			
			// Leemos el fichero
			while (true) {
				
				// Lee el coche
				coche = (Coche) dataInCoche.readObject();
				System.out.println(" ");
				System.out.println("Coche nº " + contador);
				System.out.println("Modelo: " + coche.getModelo());
				System.out.println("Marca: " + coche.getMarca());
				System.out.println("Matrícula: " + coche.getMatricula());
				System.out.println("Año: " + coche.getAnyo());
				
				contador++;
			}
			
		} catch (EOFException eo) {
			
		}
		
		// Cierra el stream de entrada
		dataInCoche.close();
	}
	
	public static void recuperarUno(int opcion) throws ClassNotFoundException, IOException {

		// Campo variable tipo coche
		Coche coche;

		// Declaración del fichero
		File fichero = new File("coches.txt");

		// Crea el flujo de entrada
		FileInputStream filein = new FileInputStream(fichero);

		// Conectar el flujo de bytes al flujo de entrada
		ObjectInputStream dataInCoche = new ObjectInputStream(filein);

		Scanner teclado = new Scanner(System.in);
		
		try {
			int contador = 1;

			if (opcion == 1) {
				System.out.println("Introduce el modelo: ");
				String modelo = teclado.nextLine();

				while (true) {
					coche = (Coche) dataInCoche.readObject();
					if (coche.getModelo().equalsIgnoreCase(modelo)) {
						System.out.println(" ");
						System.out.println("Coche nº " + contador);
						System.out.println("Modelo: " + coche.getModelo());
						System.out.println("Marca: " + coche.getMarca());
						System.out.println("Matrícula: " + coche.getMatricula());
						System.out.println("Año: " + coche.getAnyo());
						contador++;
					} 
				}
			} else if (opcion == 2) {
				System.out.println("Introduce la marca: ");
				String marca = teclado.nextLine();

				while (true) {
					coche = (Coche) dataInCoche.readObject();
					if (coche.getMarca().equalsIgnoreCase(marca)) {
						System.out.println(" ");
						System.out.println("Coche nº " + contador);
						System.out.println("Modelo: " + coche.getModelo());
						System.out.println("Marca: " + coche.getMarca());
						System.out.println("Matrícula: " + coche.getMatricula());
						System.out.println("Año: " + coche.getAnyo());
						contador++;
					} 
				}
			} else if (opcion == 3) {
				System.out.println("Introduce la matrícula: ");
				String matricula = teclado.nextLine();

				while (true) {
					coche = (Coche) dataInCoche.readObject();
					if (coche.getMatricula().equalsIgnoreCase(matricula)) {
						System.out.println(" ");
						System.out.println("Coche nº " + contador);
						System.out.println("Modelo: " + coche.getModelo());
						System.out.println("Marca: " + coche.getMarca());
						System.out.println("Matrícula: " + coche.getMatricula());
						System.out.println("Año: " + coche.getAnyo());
						contador++;
					} 
				}
			} else if (opcion == 4) {
				System.out.println("Introduce el año: ");
				int anyo = teclado.nextInt();

				while (true) {
					coche = (Coche) dataInCoche.readObject();
					if (coche.getAnyo() == anyo) {
						System.out.println(" ");
						System.out.println("Coche nº " + contador);
						System.out.println("Modelo: " + coche.getModelo());
						System.out.println("Marca: " + coche.getMarca());
						System.out.println("Matrícula: " + coche.getMatricula());
						System.out.println("Año: " + coche.getAnyo());
						contador++;
					} 
				}
			} else {
				System.out.println("No has elegido una opción correcta.");
				EscriureFitxers.menu();
			}
			
		} catch (Exception $e) {
			
		}
		
		// Cierra el stream de entrada
		dataInCoche.close();
	}
}
