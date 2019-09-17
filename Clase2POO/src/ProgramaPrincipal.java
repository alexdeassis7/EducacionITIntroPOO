
public class ProgramaPrincipal {

	public static void main(String[] args) {

		System.out.println("Hola Mundo!");
		// creamos un objeto auto

		Auto a1 = new Auto("AUDI", "plata");// invoco al constructor
		Auto a2 = new Auto();
		// System.out.println(a1.getMarca());
		// System.out.println(a1.getColor());

		a1.setMarca("Fiat");
		// System.out.println(a1.getMarca());

		// a1.color= "verde";
		// a1.marca= "BMW";
		// .setColor("verde");

		// invoco al constructor vacio
		Persona p1 = new Persona();
		// invoco a los constructores con parametros
		Persona p2 = new Persona(36863837);
		Persona p3 = new Persona("alex ", "de assis");
		Persona p4 = new Persona(37212184, "rodrigo", "montenegro ");

		// mostramos obejeto p1
		System.out.println(p1.getApellido());
		System.out.println(p1.getDni());
		System.out.println(p1.getNombre());

		// mostramos obejeto p2
		System.out.println(p2.getApellido());
		System.out.println(p2.getDni());
		System.out.println(p2.getNombre());

		// mostramos obejeto p3
		
		System.out.println("SOY persona 3");
		System.out.println(p3.getApellido());
		System.out.println(p3.getDni());
		System.out.println(p3.getNombre());
		
	// mostramos obejeto p3
		
		System.out.println("SOY persona 4");
		System.out.println(p4.getApellido());
		System.out.println(p4.getDni());
		System.out.println(p4.getNombre());

	}

}
