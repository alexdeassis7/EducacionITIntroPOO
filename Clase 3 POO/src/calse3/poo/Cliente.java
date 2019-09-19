package calse3.poo;

public class Cliente {
	// defino atributos
	private int dni;
	private String name;
	static int objetosCreados;

	private void contarObjetos() {
		// incrementamos la variable de clase!
		objetosCreados += 1;
	}

	// constructor con parametros
	public Cliente(int dni, String name) {
		this.dni = dni;
		this.name = name;
		contarObjetos();
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
