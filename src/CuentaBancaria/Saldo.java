package CuentaBancaria;

public class Saldo {
	private int saldo;
	public Saldo(int a) {
		this.saldo=a;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void restar(int cantidad) {
		this.saldo-=cantidad;
		
	}
	
	public void sumar(int cantidad) {
		this.saldo+=cantidad;
	}
	
	public void obtenerSaldo(Saldo c) {
		c.getSaldo();
		System.out.println("SU SALDO ACTUAL ES DE "+c.getSaldo()+" EUROS");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//
	public synchronized void retirarDinero(int cant, String nombre) {
		if(this.getSaldo()>=cant) {
			System.out.println(nombre+" SE VA A RETIRAR DINERO, EL SALDO SERA DE: "+this.getSaldo());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			this.restar(cant);
			
			System.out.println("\t"+nombre+" retira-->"+cant+" [saldo actual= "+this.getSaldo()+"]");
			
		}else {
			System.out.println("No se puede retirar dinero, SALDO ACTUAL= "+this.getSaldo());
		}
		
		if(this.getSaldo()<=0) {
			System.out.println("SALDO NEGATIVO-->"+this.getSaldo());
		}
	}
	//
	public synchronized void ingresarDinero(int cant, String nombre) {
			System.out.println(nombre+" INGRESAR DINERO, EL SALDO SERA DE: "+this.getSaldo());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			this.sumar(cant);
			
			System.out.println("\t"+nombre+" ingresa-->"+cant+" [saldo actual= "+this.getSaldo()+"]");
			
	}

}
