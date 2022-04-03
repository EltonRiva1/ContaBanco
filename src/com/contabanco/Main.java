package com.contabanco;

public class Main {
	/*
	 * Instru��es
	 * 
	 * 1 - As contas c1 e c2 recebem respectivamente um valor no saldo de R$ 1000 e
	 * 500. O m�todo depositar (linhas 30 e 32) atualiza o saldo de acordo com o
	 * valor recebido no par�metro (n�o � obrigat�rio informar o valor, ou seja,
	 * pode passar o valor 0 se desejar)
	 * 
	 * 2 - Para realizar a transfer�ncia de valores entre contas, basta informar o
	 * valor a ser transferido, como no caso exemplificado de c1 para c2 (linha 36).
	 * Caso deseje alterar a ordem, basta informar: c2.transferir(c1,
	 * valorASerTransferido)
	 * 
	 * 3 - Somente � permitido a transfer�ncia caso o valor seja menor ou igual ao
	 * saldo da conta
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta(111, 1000);
		System.out.println("Saldo inicial da conta c1: - R$:" + c1.getSaldo());
		Conta c2 = new Conta(222, 500);
		System.out.println("Saldo inicial da conta c2: - R$:" + c2.getSaldo());
		System.out.println();
		System.out.println("--------------------||--------------------||--------------------");
		System.out.println();
		c1.depositar(200);
		System.out.println("Saldo da conta C1 ap�s dep�sito - R$:" + c1.getSaldo());
		c2.depositar(300);
		System.out.println("Saldo da conta C2 ap�s dep�sito - R$:" + c2.getSaldo());
		System.out.println();
		System.out.println("--------------------||--------------------||--------------------");
		System.out.println();
		if (c1.transferir(c2, 600.00)) {
			System.out.println("Transfer�ncia ocorreu com sucesso!");
			System.out.println("Saldo da conta C1 ap�s transfer�ncia - R$:" + c1.getSaldo());
			System.out.println("Saldo da conta C2 ap�s transfer�ncia - R$:" + c2.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para executar a transa��o!");
		}
	}

}
