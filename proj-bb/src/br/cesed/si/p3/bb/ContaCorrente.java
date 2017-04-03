package br.cesed.si.p3.bb;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
	}

	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	public void sacar(double valorDeSaque) throws Throwable{
		super.sacar(valorDeSaque);
	}
	
	public void depositar(double valorDeDeposito) throws Throwable{
		super.depositar(valorDeDeposito);
	}
	
}
