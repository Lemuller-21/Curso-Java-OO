package btyebank;

public class TestaMetodos {

	public static void main(String[] args) {

		Conta conta1 = new Conta(123, 456);
		conta1.setTitular(new Cliente());
		
		conta1.getTitular().setNome("ayayayayayayayayaayayayayayayaya");
		
		System.out.println(conta1.getTitular().getNome());
		
		System.out.println("Total de contas: " + Conta.getTotal());
		
		Conta conta2 = new Conta(456, 789);
		
		System.out.println("Total de contas: " + Conta.getTotal());
	}

}
