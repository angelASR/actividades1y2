package actividad2;

public class Libro {
	private String titulo ;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEdiciones() {
		return ediciones;
	}
	public void setEdiciones(String ediciones) {
		this.ediciones = ediciones;
	}
	private String autor ;
	private String editorial ;
	private String ediciones;
}
