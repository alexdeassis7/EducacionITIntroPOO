
public class Persona {
	// Creo los atributos
	private int dni;
	private String nombre;
	private String apellido;
	
	//Sobrecarga de constructores!
	
	public Persona() {
	//constructor vacio 
	}
	public Persona(int dni) {
		this.dni = dni ;
	}
	//constructor sobrecargado1
	public Persona(String nombre, String Apellido ) {
		this.apellido = Apellido;
		this.nombre = nombre;
	}
	//constructor sobrecargado2
	public Persona(int dni ,String nombre , String Apellido ) {
		this.apellido = Apellido;
		this.nombre = nombre;
		this.dni = dni ;
	}
	
	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	
}
