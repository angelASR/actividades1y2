package hospital;
import java.util.Date;

public class Paciente extends Persona {
	public Paciente() {
		super();
		nombre="Antonio";
	}

	private Diagnostico diagnostico;
	private Estudio estudio;
	private Procedimiento procedimiento;
	private Servicio servicio;
	private Date fecha;
	private String responsable;
	
	@Override
	public void ObtenerPersona() {
		// TODO Auto-generated method stub
		this.getNombre(nombre);
		this.getApellido(apellido);
		this.getFechaNacimiento(fechaNacimiento);
		this.getDocumento(documento);
		this.getTelefono(telefono);
		this.getDireccion(direccion);
	}

	@Override
	public void RegistrarPersona() {
		// TODO Auto-generated method stub
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechaNacimiento(fechaNacimiento);
		this.setDocumento(documento);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Estudio getEstudio() {
		return estudio;
	}

	public void setEstudio(Estudio estudio) {
		this.estudio = estudio;
	}

	public Procedimiento getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(Procedimiento procedimiento) {
		this.procedimiento = procedimiento;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

}
