
public class Alumno {
	// atributos
	private String name;
	private int dni;

	// Constructor vacio
	public Alumno() {

	}

	// Constructor vcon todos los atributos
	public Alumno(String nombre, int id) {
		name = nombre;
		dni = id;
		System.out.println("se creo un alumno con el nombre : " + nombre);

	}

	// GET and SET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

}
