/**
 * 
 */
package es.cifpcm.mislibrosgonzalezveronica.model;

import java.io.Serializable;

/**
 * @author Veronica_Gonzalez
 *
 */
public class Libro implements Serializable {
	private String titulo;
	private String genero;
	private int nPaginas;
	private int precio;

	public Libro(String titulo, String genero, int nPaginas, int precio) {
		this.titulo=titulo;
		this.genero=genero;
		this.nPaginas=nPaginas;
		this.precio=precio;
	}

	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

}
