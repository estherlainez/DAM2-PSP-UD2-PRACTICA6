package CuentaBancaria;

public class IngresarDinero extends Thread{
	private Saldo cuenta;
	private int cantidad;
	public IngresarDinero(String name,Saldo cuenta,int cantidad) {
		this.cuenta=cuenta;
		this.cantidad=cantidad;
		this.setName(name);
	}
	
	public void run() {
		super.run();
		//for(int i=0;i<4;i++) {
			cuenta.ingresarDinero(this.cantidad, this.getName());
		//}
	}

}
