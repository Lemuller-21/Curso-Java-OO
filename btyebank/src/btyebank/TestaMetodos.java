package btyebank;

public class TestaMetodos {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		conta1.titular = new Cliente();
		
		conta1.titular.nome = "ayayayayayayayayaayayayayayayaya";
		
		System.out.println(conta1.titular.nome);
	}

}
