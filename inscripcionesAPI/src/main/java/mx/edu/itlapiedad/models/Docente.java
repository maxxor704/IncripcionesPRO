package mx.edu.itlapiedad.models;

public class Docente {
	int iddocente;
	String nombre;
	String apellido;
	String RFC;
	String mail;
	
	
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Docente(int iddocente, String nombre, String apellido, String rFC, String mail) {
		super();
		this.iddocente = iddocente;
		this.nombre = nombre;
		this.apellido = apellido;
		RFC = rFC;
		this.mail = mail;
	}


	public int getIddocente() {
		return iddocente;
	}


	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
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


	public String getRFC() {
		return RFC;
	}


	public void setRFC(String rFC) {
		RFC = rFC;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}