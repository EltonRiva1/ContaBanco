package com.contabanco;

public class Conta {
	private int numero;
	private double saldo;

	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean transferir(Conta outraConta, double valor) {
		if (valor <= this.saldo) {
			this.sacar(valor);
			outraConta.depositar(valor);
			return true;
		}
		return false;
	}
}
