package java2_AbstractInterface;

public class Frigorifico extends Electrodomestico implements Corriente{
	
	public double volumen(){
		vol = x*y*z;
		return vol;
	}
	
	protected double precioConIva() {
		precioIva = precio+(precio*0.21);
		return Math.round(precioIva*Math.pow(10, 2))/Math.pow(10, 2);
	}
	
	public double getX(){
		return x;
	}
	public void setX(double x){
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getVol() {
		return vol;
	}
	public void setVol(double vol) {
		this.vol = vol;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPrecioIva() {
		return precioIva;
	}
	public void setPrecioIva(double precioIva) {
		this.precioIva = precioIva;
	}
	public boolean getEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public boolean getCorriente() {
		return corriente;
	}
	public void setCorriente(boolean corriente) {
		this.corriente = corriente;
	}
	public boolean getAgua() {
		return agua;
	}
	public void setAgua(boolean agua) {
		this.agua = agua;
	}
	public boolean darCorriente(){
		return true;
	}
	public boolean quitarCorriente(){
		return false;
	}
	//Interruptor ON
	public boolean encender(){
		return true;
	}
	//Interruptor OFF
	public boolean apagar(){
		return false;
	}
}
