package Parte3;
public class libro {
	String titulo, autor, editorial, edicion;
	int anoPublicacion;
	
	@Override
	public String toString() {
	    return "Libro{" +
	           "titulo='" + titulo + '\'' +
	           ", autor='" + autor + '\'' +
	           ", editorial='" + editorial + '\'' +
	           ", ediion='" + edicion + '\'' +
	           ", anoPublicacion='" + anoPublicacion +
	           '}';
	}
}
