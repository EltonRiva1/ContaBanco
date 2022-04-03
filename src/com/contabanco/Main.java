package com.contabanco;

public class Main {
	/*
	 * Instruções
	 * 
	 * 1 - As contas c1 e c2 recebem respectivamente um valor no saldo de R$ 1000 e
	 * 500. O método depositar (linhas 30 e 32) atualiza o saldo de acordo com o
	 * valor recebido no parâmetro (não é obrigatório informar o valor, ou seja,
	 * pode passar o valor 0 se desejar)
	 * 
	 * 2 - Para realizar a transferência de valores entre contas, basta informar o
	 * valor a ser transferido, como no caso exemplificado de c1 para c2 (linha 36).
	 * Caso deseje alterar a ordem, basta informar: c2.transferir(c1,
	 * valorASerTransferido)
	 * 
	 * 3 - Somente é permitido a transferência caso o valor seja menor ou igual ao
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
		System.out.println("Saldo da conta C1 após depósito - R$:" + c1.getSaldo());
		c2.depositar(300);
		System.out.println("Saldo da conta C2 após depósito - R$:" + c2.getSaldo());
		System.out.println();
		System.out.println("--------------------||--------------------||--------------------");
		System.out.println();
		if (c1.transferir(c2, 600.00)) {
			System.out.println("Transferência ocorreu com sucesso!");
			System.out.println("Saldo da conta C1 após transferência - R$:" + c1.getSaldo());
			System.out.println("Saldo da conta C2 após transferência - R$:" + c2.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para executar a transação!");
		}
	}

}
