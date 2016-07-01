package hospital;

public class Sala {
 private String camaDisponible;
 private Integer numeroSala;
 private Internacion internacion;
 private Urgencia urgencia;
 
public String getCamaDisponible() {
	return camaDisponible;
}
public void setCamaDisponible(String camaDisponible) {
	this.camaDisponible = camaDisponible;
}
public Integer getNumeroSala() {
	return numeroSala;
}
public void setNumeroSala(Integer numeroSala) {
	this.numeroSala = numeroSala;
}
public Internacion getInternacion() {
	return internacion;
}
public void setInternacion(Internacion internacion) {
	this.internacion = internacion;
}
public Urgencia getUrgencia() {
	return urgencia;
}
public void setUrgencia(Urgencia urgencia) {
	this.urgencia = urgencia;
}
 
}
