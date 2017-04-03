package br.cesed.si.p3.teste;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.cesed.si.p3.bb.Conta;
import br.cesed.si.p3.bb.ContaCorrente;
import br.cesed.si.p3.bb.ContaPoupanca;

public class Teste {

	private static Conta c;

	public static void main(String[] args) throws Throwable {
		String tipoContaStr = null;
		int tipoConta = 0;
		tipoContaStr = JOptionPane.showInputDialog("Criar conta corrente digite 1\nCriar uma conta poupança digite 2\n");
		tipoConta = Integer.parseInt(tipoContaStr);
		
		if(tipoConta == 1){
			operacoesContaCorrente();
		}else if(tipoConta == 2){
			operacoesContaPoupanca();
		} else{
			JOptionPane.showMessageDialog(null, "Operação inválida!");
		}
		
		JOptionPane.showMessageDialog(null, "Operação encerrada!");
		
	}
	
	public static void operacoesContaCorrente() throws Throwable{
		String agenciaContaCorrenteStr = JOptionPane.showInputDialog("Por favor digite a agencia da conta: ");
		int agenciaContaCorrente = Integer.parseInt(agenciaContaCorrenteStr);
		String contaContaCorrenteStr = JOptionPane.showInputDialog("Por favor digite o numero da conta: ");
		int contaContaCorrente = Integer.parseInt(contaContaCorrenteStr);
		String nomeTitularContaCorrente = JOptionPane.showInputDialog("Por favor digite o nome do titular da conta: ");
		ContaCorrente cCorrente = (ContaCorrente) c;
		
		cCorrente = new ContaCorrente(agenciaContaCorrente, contaContaCorrente, nomeTitularContaCorrente);
		
		boolean sairOk = false; 
		while(!sairOk){
			String operacaoStr = JOptionPane.showInputDialog("Por favor, digite a operação desejada" + "\nSacar = 1\nDepositar = 2\nVerificar saldo = 3\nSair = 0");
			int operacao = Integer.parseInt(operacaoStr);
			switch (operacao){
				case 1:
					String valorDeSaqueStr = JOptionPane.showInputDialog("Por favor digite o valor que deseja sacar: ");
					double valorDeSaque = Double.parseDouble(valorDeSaqueStr);
					cCorrente.sacar(valorDeSaque);
					break;
				case 2:
					valorDeSaqueStr = JOptionPane.showInputDialog("Por favor digite o valor que deseja depositar: ");
					valorDeSaque = Double.parseDouble(valorDeSaqueStr);
					cCorrente.depositar(valorDeSaque);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "O valor do saldo é: \n" + cCorrente.getSaldo());
					break;
				case 0:
					sairOk = true;
					break;
					
			}
		}
		
	}
	
	public static void operacoesContaPoupanca() throws Throwable{
		String agenciaContaPoupancaStr = JOptionPane.showInputDialog("Por favor digite a agencia da conta: ");
		int agenciaContaPoupanca = Integer.parseInt(agenciaContaPoupancaStr);
		String contaContaPoupancaStr = JOptionPane.showInputDialog("Por favor digite o numero da conta: ");
		int contaContaCorrente = Integer.parseInt(contaContaPoupancaStr);
		String nomeTitularContaCorrente = JOptionPane.showInputDialog("Por favor digite o nome do titular da conta: ");
		String jurosContaPoupancaStr = JOptionPane.showInputDialog("Informe por favor o juros referente a conta poupança: ");
		double jurosContaPoupanca = Double.parseDouble(jurosContaPoupancaStr);
		
		ContaPoupanca cPoupanca = (ContaPoupanca) c;
		
		cPoupanca = new ContaPoupanca(agenciaContaPoupanca, contaContaCorrente, nomeTitularContaCorrente, jurosContaPoupanca);
		boolean sairOk = false; 
		while(!sairOk){
			String operacaoStr = JOptionPane.showInputDialog("Por favor, digite a operação desejada" + "\nSacar = 1\nDepositar = 2\nVerificar saldo = 3\nSair = 0");
			int operacao = Integer.parseInt(operacaoStr);
			switch (operacao){
				case 1:
					String valorDeDepositoStr = JOptionPane.showInputDialog("Por favor digite o valor que deseja sacar: ");
					double valorDeDeposito = Double.parseDouble(valorDeDepositoStr);
					cPoupanca.sacar(valorDeDeposito);
					break;
				case 2:
					valorDeDepositoStr = JOptionPane.showInputDialog("Por favor digite o valor que deseja depositar: ");
					valorDeDeposito = Double.parseDouble(valorDeDepositoStr);
					cPoupanca.depositar(valorDeDeposito);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "O valor do saldo é: " + cPoupanca.getSaldo());
					break;
				case 0:
					sairOk = true;
					break;
			}
		}
	}

}
