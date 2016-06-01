package dominio;

import java.io.Serializable;

public class Estudiante implements Serializable {
	@Override
	public String toString() {
		return "Estudiante [Nombre=" + Nombre + ", Apellido=" + Apellido + "]";
	}

	private String Nombre;

	private String Apellido;

	public String getApellido() {
		return Apellido;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
