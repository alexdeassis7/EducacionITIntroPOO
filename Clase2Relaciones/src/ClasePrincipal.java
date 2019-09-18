import java.util.ArrayList;
import java.util.List;

public class ClasePrincipal {
	// Clase Principal o punto de inicio de ejecucion
	public static void main(String[] args) {
		// creamos 3 objetos de la clase alumno
		// imvocando al constructor de Alumno
		Alumno a1 = new Alumno("juan", 39031182);
		Alumno a2 = new Alumno("maria", 39031181);
		Alumno a3 = new Alumno("Jesus", 00000001);

		// creando objeto universidad
		// invocando añ constructor de universidad
		Universidad EducacionIT = new Universidad("EDU IT");
		// utilizamos metodo de agregar alumnos
		EducacionIT.AgregarAlumno(a1, a2, a3);

	}

}
