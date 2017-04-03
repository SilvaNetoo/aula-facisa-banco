package br.cesed.si.p3.bb;

public abstract class Conta {

	private int agencia;
	private int conta;
	private double saldo;
	private String titular;
	
	public Conta(int agencia, int conta, String titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}
	
	public Conta(int agencia, int conta, String titular, double saldo) {
		this(agencia,conta, titular);
		this.saldo = saldo;
	}

	public void sacar(double valorDeSaque) throws Throwable{
		if(!(valorDeSaque < this.saldo)){
			this.saldo -= valorDeSaque;
		}else{
			throw new Throwable("Valor de saque é indisponicel, por favor, tente novamente!");
		}
		
	}
	
	public void depositar(double valorDeDeposito) throws Throwable{
		if(!(valorDeDeposito < 0)){
			this.saldo += valorDeDeposito;
		}else{
			throw new Throwable("Valor de deposito é menor que zero, por favor, tente novamente!");	
		}
	}

	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
