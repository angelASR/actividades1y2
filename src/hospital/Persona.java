package hospital;

public abstract class Persona {
	//el protected es un modificador de acceso
	//permite el acceso a los atributos para los diferentes paquetes
	
	protected String nombre, apellido, fechaNacimiento, direccion;
	protected Integer documento, telefono;

	public abstract void ObtenerPersona();

	public abstract void RegistrarPersona();

	// Estamos Obteniendo los datos
	public String getNombre(String nombre) {
		return this.nombre;
	}

	public String getApellido(String apellido) {
		return this.apellido;
	}

	public String getFechaNacimiento(String fechaNacimiento) {
		return this.fechaNacimiento;
	}

	public String getDireccion(String direccion) {
		return this.direccion;
	}

	public Integer getDocumento(Integer documento) {
		return this.documento;
	}

	public Integer getTelefono(Integer telefono) {
		return this.telefono;
	}

	// Estamos Asignando los datos
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
