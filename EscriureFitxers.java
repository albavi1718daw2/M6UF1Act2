import java.io.IOException;
import java.util.Scanner;

public class EscriureFitxers {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Damos a elegir al usuario
		menu();

	}
	
	public static void menu() throws IOException, ClassNotFoundException {
		
		Scanner teclado = new Scanner(System.in);
		
		// Variables
		int opcionUsuario;
		
		// Damos a elegir al usuario
		System.out.println("Elige qu� quieres hacer: ");
		System.out.println("1) Guardar coches de uno en uno");
		System.out.println("2) Guardar coches en bloque");
		System.out.println("3) Recuperar coches seg�n un campo");
		System.out.println("4) Recuperar todos los coches");
		opcionUsuario = teclado.nextInt();
		
		accion(opcionUsuario);
	}
	
	public static void accion(int opcionUsuario) throws IOException, ClassNotFoundException {

		Scanner teclado = new Scanner(System.in);
		
		// Seg�n lo que elija el usuario, hacemos una cosa u otra
		switch(opcionUsuario) {

		case 1:
			EscriureFitxerObject.escribirUno();
			System.out.println("Fichero escrito con �xito.");
			break;
			
		case 2:
			EscriureFitxerObject.escribirEnBloque();
			System.out.println("Fichero escrito con �xito.");
			break;
			
		case 3:
			System.out.println("------------------------------");
			System.out.println("�Qu� campo quieres recuperar?");
			System.out.println("1) Modelo");
			System.out.println("2) Marca");
			System.out.println("3) Matr�cula");
			System.out.println("4) A�o");
			int opcion = teclado.nextInt();
			LlegirFitxerObject.recuperarUno(opcion);
			break;
			
		case 4:
			LlegirFitxerObject.recuperarTodos();
			break;
			
		default:
			System.out.println("Has elegido una opci�n incorrecta.");
			menu();
			break;
		}
	}
}
