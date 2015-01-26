package java2_AbstractInterface;

public abstract class Electrodomestico {
	
	//Uso variables protected para que solo las puedan usar la misma clase 
	//y las que extiendan
	
	
	//Medidas
	protected double x,y,z,vol,precio,precioIva;
	protected boolean encendido,corriente,agua;
	
	abstract double volumen();
	abstract double precioConIva();
}
