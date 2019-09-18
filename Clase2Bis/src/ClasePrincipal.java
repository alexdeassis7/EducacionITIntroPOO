
public class ClasePrincipal {

	public static void main(String[] args) {
		// invocamos al constructor vacio
		Electrodomestico pava = new Electrodomestico();

		// invocamos al constructor con parametros
		Electrodomestico microondas = new Electrodomestico("microooooooodas  ", 220, 1999.99f, "china");
		System.out.println("nombre = " + microondas.getNombre() + "  VOLTAJE = " + microondas.getVoltaje());
		System.out.println("PRECIO = " + microondas.getPrecio() + "  ORIGEN = " + microondas.getOrigen());
		// aumentamos el 10 % del precio
		microondas.aumentarPrecio();
		System.out.println(microondas.getPrecio());
		microondas.bajarPrecio(100);
		System.out.println(microondas.getPrecio());
		microondas.bajarPrecio(3000);

	}

}
