package hospital;

public class Estudio {
private String nombreEstudio,laboratorio,tomografia,radiografia;
private Medico registroMedico;
public String getNombreEstudio() {
	return nombreEstudio;
}
public void setNombreEstudio(String nombreEstudio) {
	this.nombreEstudio = nombreEstudio;
}
public String getLaboratorio() {
	return laboratorio;
}
public void setLaboratorio(String laboratorio) {
	this.laboratorio = laboratorio;
}
public String getTomografia() {
	return tomografia;
}
public void setTomografia(String tomografia) {
	this.tomografia = tomografia;
}
public String getRadiografia() {
	return radiografia;
}
public void setRadiografia(String radiografia) {
	this.radiografia = radiografia;
}
public Medico getRegistroMedico() {
	return registroMedico;
}
public void setRegistroMedico(Medico registroMedico) {
	this.registroMedico = registroMedico;
}



}
