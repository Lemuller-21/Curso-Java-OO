package btyebank;

public class TestaMetodos {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		conta1.setTitular(new Cliente());
		
		conta1.getTitular().setNome("ayayayayayayayayaayayayayayayaya");
		
		System.out.println(conta1.getTitular().getNome());
	}

}
