package CuentaBancaria;

public class ClientesBanca {

	public static void main(String[] args) {
		Saldo c=new Saldo(100);
		c.obtenerSaldo(c);
		RetirarDinero retirada1=new RetirarDinero("Cliente1",c,40);
		IngresarDinero ingreso1=new IngresarDinero("Cliente2",c,100);
		RetirarDinero retirada2=new RetirarDinero("Cliente3",c,50);
		IngresarDinero ingreso2=new IngresarDinero("Cliente4",c,80);

		retirada1.start();
		ingreso1.start();
		retirada2.start();
		ingreso2.start();
	}

}
