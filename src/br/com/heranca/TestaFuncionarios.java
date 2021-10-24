package br.com.heranca;


public class TestaFuncionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerentes g = new Gerentes();
		g.setNome("Rafael Consentino");
		g.setSalario(2000);
		g.setUsuario("rafael.consentino");
		g.setSenha("12345");

		Telefonistas t = new Telefonistas();
		t.setNome("Carolina Melo");
		t.setSalario(1000);
		t.setEstacaoDeTrabalho(13);

		Secretarias s = new Secretarias();
		s.setNome("Tatiane Andrade");
		s.setSalario(1500);
		s.setRamal(198);

		/*
		System.out.println("Gerente");
		System.out.println("Nome: " + g.getNome() + "\nSalario: " + g.getSalario() + "\nUsuario: " + g.getUsuario()
				+ "\nSenha: " + g.getSenha() + "\nBonus de Salário: " + g.calculaBonificacao());

		System.out.println("\n------------------------------------");
		System.out.println("Telefonista");
		System.out.println("Nome: " + t.getNome() + "\nSalario: " + t.getSalario() + "\nEstação de Trabalho: "
				+ t.getEstacaoDeTrabalho() + "\nBonus de Salário: " + t.calculaBonificacao());

		System.out.println("\n------------------------------------");
		System.out.println("Secretaria");
		System.out.println("Nome: " + s.getNome() + "\nSalario: " + s.getSalario() + "\nRamal: " + s.getRamal()
				+ "\nBonus de Salário: " + s.calculaBonificacao());
*/
		System.out.println("\n------------------------------------");
		System.out.println(g.Imprime());

		System.out.println("\n------------------------------------");
		System.out.println(t.Imprime());

		System.out.println("\n------------------------------------");
		System.out.println(s.Imprime());

	}

}
