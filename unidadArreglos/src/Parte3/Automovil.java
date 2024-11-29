package Parte3;

public class Automovil {
	String marca, modelo, color, version,transmision;
	int anoEdicion;

	@Override
	public String toString() {
	    return "Automovil{" +
	           "marca='" + marca + '\'' +
	           ", modelo='" + modelo + '\'' +
	           ", color='" + color + '\'' +
	           ", version='" + version + '\'' +
	           ", transmision='" + transmision + '\'' +
	           ", anoEdicion=" + anoEdicion +
	           '}';
	}


}
