package br.com.banco;

public class Funcionario {
	private double salario;
	private String nome;
	private double valorDeposito;
	private double saldo;
	

	
	
	public double getValorDeposito() {
		
		return valorDeposito;
	}


	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void deposito() {
		 saldo  += valorDeposito;
		System.out.println("O valor do saldo e :" + saldo);
		
	}
}
