
public class Electrodomestico {
	@Override
	public String toString() {
		return "Electrodomestico [nombre=" + nombre + ", voltaje=" + voltaje + ", precio=" + precio + ", origen="
				+ origen + "]";
	}

	// defino Atributos
	private String nombre;
	private int voltaje;
	private float precio;
	private String origen;

	// defino constructor vacio
	public Electrodomestico() {

	}

	// defino constructor sobrecargado
	public Electrodomestico(String name, int volt, float p, String O) {
		nombre = name;
		voltaje = volt;
		precio = p;
		origen = O;

	}

	// definimos metodos
	public void enceder() {
		System.out.println("estoy encendiendo electrodomestico : " + nombre);
	}

	public void usar() {
		System.out.println("estoy usando el electrodomestico : " + nombre);
	}

	public void apagar() {
		System.out.println("apagaste el electro");
	}

	public void aumentarPrecio(float Precio) {
		precio += Precio;
		// precio = precio + Precio

	}

	// metodo sobrecargado
	public void aumentarPrecio() {

		precio = (float) (precio * 1.10);

	}

	public void bajarPrecio(float Precio) {
		if (Precio <= precio) {
			precio -= Precio;
		} else {
			System.err.println("VAS A PERDER PLATA AMEGO!");
		}

	}

	// DEFINIMOS GETTERS Y SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

}
