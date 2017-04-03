package br.cesed.si.p3.bb;

public class ContaPoupanca extends Conta {

	private double juros;
	private static final double PORCENTAGEM = 100;
	
	public ContaPoupanca(int agencia, int conta, String titular, double saldo, double juros) {
		super(agencia, conta, titular, saldo);
		this.juros = juros;
	}

	public ContaPoupanca(int agencia, int conta, String titular, double juros) {
		super(agencia, conta, titular);
		this.juros = juros;
	}

	public void sacar(double valorDeSaque) throws Throwable{
		double juros = (valorDeSaque / PORCENTAGEM) * this.juros;
		double valorSacado = valorDeSaque + juros;
		super.sacar(valorSacado);
	}
	
	public void depositar(double valorDeDeposito) throws Throwable{
		super.depositar(valorDeDeposito);
	}
	
	public double getJuros(){
		return juros;
	}
	
	public void setJuros(double juros){
		this.juros = juros;
	}
	
}
