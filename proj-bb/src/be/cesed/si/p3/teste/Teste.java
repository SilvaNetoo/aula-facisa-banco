package be.cesed.si.p3.teste;

import java.util.Scanner;

import br.cesed.si.p3.bb.Conta;
import br.cesed.si.p3.bb.ContaCorrente;
import br.cesed.si.p3.bb.ContaPoupanca;

public class Teste {

	private static Conta c;

	public static void main(String[] args) throws Throwable {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Criar conta corrente digite 1\nCriar uma conta poupança digite 2\n");
		int tipoConta = teclado.nextInt();
		if(tipoConta == 1){
			operacoesContaCorrente();
		}else if(tipoConta == 2){
			operacoesContaPoupanca();
		} else{
			System.out.println("Operação inválida!");
		}
		
		System.out.println("Operação encerrada!");
		
	}
	
	public static void operacoesContaCorrente() throws Throwable{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite a agencia da conta: ");
		int agenciaContaCorrente = teclado.nextInt();
		System.out.println("Por favor digite o numero da conta: ");
		int contaContaCorrente = teclado.nextInt();
		System.out.println("Por favor digite o nome do titular da conta: ");
		String nomeTitularContaCorrente = teclado.next();
		ContaCorrente cCorrente = (ContaCorrente) c;
		
		cCorrente = new ContaCorrente(agenciaContaCorrente, contaContaCorrente, nomeTitularContaCorrente);
		
		boolean sairOk = false; 
		while(!sairOk){
			System.out.println("Por favor, digite a operação desejada");
			System.out.println("Sacar = 1\nDepositar = 2\nVerificar saldo = 3\nSair = 0");
			int operacao = teclado.nextInt();
			switch (operacao){
				case 1:
					System.out.println("Por favor digite o valor que deseja sacar: ");
					cCorrente.sacar(teclado.nextFloat());
					break;
				case 2:
					System.out.println("Por favor digite o valor que deseja depositar: ");
					cCorrente.depositar(teclado.nextFloat());
					break;
				case 3:
					System.out.println(cCorrente);
					break;
				case 0:
					sairOk = true;
					break;
					
			}
		}
		
	}
	
	public static void operacoesContaPoupanca() throws Throwable{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite a agencia da conta: ");
		int agenciaContaCorrente = teclado.nextInt();
		System.out.println("Por favor digite o numero da conta: ");
		int contaContaCorrente = teclado.nextInt();
		System.out.println("Por favor digite o nome do titular da conta: ");
		String nomeTitularContaCorrente = teclado.nextLine();
		ContaPoupanca cPoupanca = (ContaPoupanca) c;
			
		boolean sairOk = false; 
		while(!sairOk){
			System.out.println("\nPor favor, digite a operação desejada");
			System.out.println("Sacar = 1\nDepositar = 2\nVerificar saldo = 3\nSair = 0");
			int operacao = teclado.nextInt();
			switch (operacao){
				case 1:
					System.out.println("Por favor digite o valor que deseja sacar: ");
					cPoupanca.sacar(teclado.nextFloat());
					break;
				case 2:
					System.out.println("Por favor digite o valor que deseja depositar: ");
					cPoupanca.depositar(teclado.nextFloat());
					break;
				case 3:
					System.out.println(cPoupanca);
					break;
				case 0:
					sairOk = true;
					break;
					
			}
		}
	}

}
