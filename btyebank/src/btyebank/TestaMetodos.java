package btyebank;

public class TestaMetodos {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		System.out.println(conta1.saldo);
		
		conta1.deposita(150);
		System.out.println(conta1.saldo);
		
		conta1.saca(50);
		System.out.println(conta1.saldo);
		
		Conta conta2 = new Conta();
		conta2.deposita(400);
		
		System.out.println(conta2.transfere(150, conta1));
		
		System.out.println(conta1.saldo);
		System.out.println(conta2.saldo);
	}

}
