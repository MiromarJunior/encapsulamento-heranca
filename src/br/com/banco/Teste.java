package br.com.banco;

public class Teste {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.setNome(("Miromar"));
		f.setSalario(5000);
		
		System.out.println("O seu nome � : "+f.getNome()+"\ne o seu salario � : "+f.getSalario());

		f.setValorDeposito(500);
		f.deposito();
		
	}

}
