import java.util.ArrayList;
import java.util.List;

public class Universidad {

	// creo una colecciòn de Alumnos
	private List<Alumno> alumnos = new ArrayList();
	private String NombreUniversidad;

	public void AgregarAlumno(Alumno nuevoAlumno, Alumno a2, Alumno a3) {

		alumnos.add(nuevoAlumno);
		alumnos.add(a2);
		alumnos.add(a3);
		System.out.println("se agregaron tres nuevos alumnos ");
	}

	public Universidad(String nombreUniversidad) {
		this.NombreUniversidad = nombreUniversidad;

		System.out.println("se creo la universidad : " + nombreUniversidad);
	}

	public Universidad(List<Alumno> alumnos, String nombreUniversidad) {
		this.alumnos = alumnos;
		NombreUniversidad = nombreUniversidad;
	}

	// GEt and SEt
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public String getNombreUniversidad() {
		return NombreUniversidad;
	}

	public void setNombreUniversidad(String nombreUniversidad) {
		NombreUniversidad = nombreUniversidad;
	}

}
