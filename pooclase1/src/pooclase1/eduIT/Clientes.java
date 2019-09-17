package pooclase1.eduIT;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clientes {
	// definimos atributos
	String nombre;
	String apellido;
	int id;
	boolean disponible;
	long dni;
	String domicilio;
	List<CD> historial = new ArrayList<CD>();
	boolean sancion = false;

	Stock s1 = new Stock();

	public boolean alquilar(String tituloSolicitado) {

		if (sancion) {
			System.out.println("paga la deuda si queres alquilar amego ");
		} else {
			if (s1.cantidadDisponible > 0) {
				CD esperandoLaCarroza = new CD();
				System.out.println("llevalo wuachennn");
				historial.add(esperandoLaCarroza);

			}
		}

		return disponible;
	}
}
