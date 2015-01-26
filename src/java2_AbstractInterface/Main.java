package java2_AbstractInterface;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Crear frigorífico basado en Electrodomestico
		
		//Objetos
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Frigorifico frigo = new Frigorifico();
		
		System.out.println("*******************************************");
		System.out.println("\nIntroduce las medidas en cm del frigorífico");
		System.out.println("\nAncho: ");
		frigo.setX(sc.nextDouble());
		System.out.println("\nLargo: ");
		frigo.setY(sc.nextDouble());
		System.out.println("\nAlto: ");
		frigo.setZ(sc.nextDouble());
		frigo.setVol(frigo.volumen());
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("\nEl volumen del frigorífico es: " + frigo.getVol() + "\n");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("\nIntroduce el precio del frigorífico: ");
		frigo.setPrecio(sc.nextDouble());
		frigo.setPrecioIva(frigo.precioConIva());
		System.out.println("\nSu precio con IVA es: " + frigo.getPrecioIva());
		System.out.println("\nFrigorífico creado: ");
		System.out.println("\nAncho: \t" + frigo.getX());
		System.out.println("Largo: \t" + frigo.getY());
		System.out.println("Alto: \t" + frigo.getZ());
		System.out.println("Volumen: \t" + frigo.getVol());
		System.out.println("Precio: \t" + frigo.getPrecio());
		System.out.println("Precio con IVA: \t" + frigo.getPrecioIva());
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		
		//Menú de funcionamiento
		int opcion;
		do{
			System.out.println("Menu: ");
			System.out.println("*******************************************");
			System.out.println("Dar corriente-----------------------------1");
			System.out.println("Quitar corriente--------------------------2");
			System.out.println("Encender electrodoméstico-----------------3");
			System.out.println("Apagar electrodoméstico-------------------4");
			System.out.println("Salir-------------------------------------0");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Corriente del electrodoméstico: " + frigo.getCorriente());
				System.out.println("Dando corriente (cerrar disyuntor).......");
				frigo.setCorriente(frigo.darCorriente());
				System.out.println("Corriente del electrodoméstico: " + frigo.getCorriente());
				break;
				
			case 2:
				System.out.println("Corriente del electrodoméstico: " + frigo.getCorriente());
				System.out.println("Quitando corriente (abrir disyuntor).......");
				frigo.setCorriente(frigo.quitarCorriente());
				System.out.println("Corriente del electrodoméstico: " + frigo.getCorriente());
				break;
				
			case 3:
				System.out.println("Electrodoméstico encendido: " + frigo.getEncendido());
				System.out.println("Encendiendo el electrodoméstico (interruptor ON).......");
				frigo.setEncendido(frigo.encender());
				System.out.println("Electrodoméstico encendido: " + frigo.getEncendido());
				break;

			case 4:
				System.out.println("Electrodoméstico encendido: " + frigo.getEncendido());
				System.out.println("Apagando el electrodoméstico (interruptor OFF).......");
				frigo.setEncendido(frigo.apagar());
				System.out.println("Electrodoméstico encendido: " + frigo.getEncendido());
				break;
				
			default:
				System.out.println("Eso no es una opción....");
				break;
			}
		}while(opcion != 0);
		System.out.println("Menu: ");
		System.out.println("*******************************************");
		System.out.println("Dar corriente-----------------------------1");
		System.out.println("Quitar corriente--------------------------2");
		System.out.println("Encender electrodoméstico-----------------3");
		System.out.println("Apagar electrodoméstico-------------------4");
		System.out.println("Salir-------------------------------------0");
		opcion = sc.nextInt();
	}
}
