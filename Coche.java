import java.io.Serializable;

public class Coche implements Serializable {
					
	private String marca, modelo, matricula;
	private int anyo;
	
	// Constructor
	public Coche(String marca, String modelo, String matricula, int anyo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.anyo = anyo;
	}
	
	// GETTERS

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}


	public String getMatricula() {
		return matricula;
	}

	public int getAnyo() {
		return anyo;
	}

	// SETTERS
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
}
