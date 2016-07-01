package hospital;

public class Medico extends Persona {
private Integer registroMedico;
private Servicio servicio;
private Especialidad especilidad;

	public Medico() {
		super();
		nombre="angel";
	}
	
	public void ObtenerPersona(){
		this.getNombre(nombre);
		this.getApellido(apellido);
		this.getTelefono(telefono);
		this.getDocumento(documento);
	
	}
	@Override
	public void RegistrarPersona() {
		// TODO Auto-generated method stub
		
	}

	public Integer getRegistroMedico() {
		return registroMedico;
	}

	public void setRegistroMedico(Integer registroMedico) {
		this.registroMedico = registroMedico;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Especialidad getEspecilidad() {
		return especilidad;
	}

	public void setEspecilidad(Especialidad especilidad) {
		this.especilidad = especilidad;
	}

}
