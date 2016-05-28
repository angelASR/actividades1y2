package cine;

public class Peliculas {
	private String nombrePeliculas;
	private String director;
	private String sinosis;
	private String subtitulada;
	private Publico TipoPublico;
	private String convencional;
	private String peliculas3d;
	private Sala sala;
	public String getNombrePeliculas() {
		return nombrePeliculas;
	}
	public void setNombrePeliculas(String nombrePeliculas) {
		this.nombrePeliculas = nombrePeliculas;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getSinosis() {
		return sinosis;
	}
	public void setSinosis(String sinosis) {
		this.sinosis = sinosis;
	}
	public String getSubtitulada() {
		return subtitulada;
	}
	public void setSubtitulada(String subtitulada) {
		this.subtitulada = subtitulada;
	}
	public Publico getTipoPublico() {
		return TipoPublico;
	}
	public void setTipoPublico(Publico tipoPublico) {
		TipoPublico = tipoPublico;
	}
	public String getConvencional() {
		return convencional;
	}
	public void setConvencional(String convencional) {
		this.convencional = convencional;
	}
	public String getPeliculas3d() {
		return peliculas3d;
	}
	public void setPeliculas3d(String peliculas3d) {
		this.peliculas3d = peliculas3d;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
}