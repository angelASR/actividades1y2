package actividad2;

public class Prestamo {
private String prestamoPendiente;
private String fechaPrestamo;
private String fechaDevolucion;
private String ejemplares;
public String getPrestamoPendiente() {
	return prestamoPendiente;
}
public void setPrestamoPendiente(String prestamoPendiente) {
	this.prestamoPendiente = prestamoPendiente;
}
public String getFechaPrestamo() {
	return fechaPrestamo;
}
public void setFechaPrestamo(String fechaPrestamo) {
	this.fechaPrestamo = fechaPrestamo;
}
public String getFechaDevolucion() {
	return fechaDevolucion;
}
public void setFechaDevolucion(String fechaDevolucion) {
	this.fechaDevolucion = fechaDevolucion;
}
public String getEjemplares() {
	return ejemplares;
}
public void setEjemplares(String ejemplares) {
	this.ejemplares = ejemplares;
}
}
