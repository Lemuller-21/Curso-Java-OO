package btyebank;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public boolean saca(double valor) {
		if (valor > 0 && this.saldo > valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (valor > 0 && this.saldo > valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

}
