package mx.edu.itlapiedad.models;

public class ModeloCargaAcademica {
	int creditos;
	String codigo_materia;
	String nombre_materia;
	
	public ModeloCargaAcademica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModeloCargaAcademica(int creditos, String codigo_materia, String nombre_materia) {
		super();
		this.creditos = creditos;
		this.codigo_materia = codigo_materia;
		this.nombre_materia = nombre_materia;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getCodigo_materia() {
		return codigo_materia;
	}

	public void setCodigo_materia(String codigo_materia) {
		this.codigo_materia = codigo_materia;
	}

	public String getNombre_materia() {
		return nombre_materia;
	}

	public void setNombre_materia(String nombre_materia) {
		this.nombre_materia = nombre_materia;
	}
	
	
	
}
