import java.io.File;

public class VeureInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cogemos el fichero que nos pasan por parámetros
		File file = new File(args[0]); 
		
		// Comprobamos que el fichero exista
		if (file.exists()) {
			
			// Comprobamos si es un directorio o un archivo
			if (file.isDirectory()) {

				// Cogemos el contenido del archivo
				String[] contenido = file.list();
				
				// Lo mostramos
				for (int i = 0; i < contenido.length; i++){
					System.out.println(contenido[i]);
				}

				
			} else if (file.isFile()) {
				
				// Mostramos los datos
				 System.out.println("Nombre del fichero : " + file.getName());
				 System.out.println("Ruta               : " + file.getPath());
				 System.out.println("Ruta absoluta      : " + file.getAbsolutePath());
				 System.out.println("Se puede escribir  : " + file.canRead());
				 System.out.println("Se puede leer      : " + file.canWrite());
				 System.out.println("Tamaño             : " + file.length());
				 System.out.println("¿Es un directorio? : " + file.isDirectory());
				 System.out.println("¿Es un fichero?    : " + file.isFile());

				
			} else {
				
				System.out.println("Ha habido un error.");
			}
			
		} else {
			
			System.out.println("El fichero no existe.");
		}
	}
}
