package CuentaBancaria;

public class RetirarDinero extends Thread{
	private Saldo cuenta;
	private int cantidad;
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public RetirarDinero(String name, Saldo cuenta,int cantidadRetirar) {
		this.cuenta=cuenta;
		this.setName(name);
		this.cantidad=cantidadRetirar;
	}
	
	public void run() {
		super.run();
		//for(int i=0;i<4;i++) {
			cuenta.retirarDinero(this.getCantidad(), this.getName());
		//}
	}

}
