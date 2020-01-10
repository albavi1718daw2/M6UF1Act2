import java.io.*;
import java.util.Scanner;

public class EscriureFitxerObject {
	
	static Scanner teclado = new Scanner(System.in);
	protected static File fichero;
	
	public static void escribirUno() throws IOException {
		
		fichero = new File("coches.txt");
		Coche coche;
		
		// Creamos el flujo de salida
		FileOutputStream fileout = new FileOutputStream(fichero);
		
		// Conectamos el flujo de bytes al de salida
		ObjectOutputStream dataOuCoche = new ObjectOutputStream(fileout);
		
		String marca;
		String modelo;
		String matricula;
		int anyo;
		
		// Pedimos la información
		System.out.println("Escribe la marca del coche: ");
		marca = teclado.nextLine();
		System.out.println("Escribe el modelo del coche: ");
		modelo = teclado.nextLine();
		System.out.println("Escribe la matrícula del coche: ");
		matricula = teclado.nextLine();
		System.out.println("Escribe el año del coche: ");
		anyo = teclado.nextInt();
		
		// Creamos el objeto
		coche = new Coche(marca, modelo, matricula, anyo);
		
		// Lo escribimos
		dataOuCoche.writeObject(coche);
		
		// Cerramos el stream de salida
		dataOuCoche.close();
	}
	
	public static void escribirEnBloque() throws IOException {
		
		fichero = new File("coches.txt");
		Coche coche;
		
		// Creamos el flujo de salida
		FileOutputStream fileout = new FileOutputStream(fichero);
		
		// Conectamos el flujo de bytes al de salida
		ObjectOutputStream dataOuCoche = new ObjectOutputStream(fileout);
		
		// Cogemos los datos
		String marca;
		String modelo;
		String matricula;
		String continuar = "s";
		int anyo;
		
		while (continuar.equalsIgnoreCase("s")) {
			
			// Pedimos la información
			System.out.println("Escribe la marca del coche: ");
			marca = teclado.nextLine();
			System.out.println("Escribe el modelo del coche: ");
			modelo = teclado.nextLine();
			System.out.println("Escribe la matrícula del coche: ");
			matricula = teclado.nextLine();
			System.out.println("Escribe el año del coche: ");
			anyo = teclado.nextInt();
			
			// Creamos el objeto
			coche = new Coche(marca, modelo, matricula, anyo);
			
			// Lo escribimos
			dataOuCoche.writeObject(coche);
			
			teclado.nextLine();
			
			System.out.println("¿Quieres continuar (s/n)?");
			continuar = teclado.nextLine();
		}
		
		// Cerramos el stream de salida
		dataOuCoche.close();
	}
}
