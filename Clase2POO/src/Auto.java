
public class Auto {

	private String marca;
	private String color;

	// Creamos un constructor con parametro(marca)
	public Auto(String marca, String color) {
		this.marca = marca;
		this.color = color;
	}

	// constructor sobrecargado 1
	public Auto(String marca) {
		this.marca = marca;
	}

	// constructor vacio!
	public Auto() {

	}

	// DEfinimos GETTERS ySETTERS
	// Encapsulamiento
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
