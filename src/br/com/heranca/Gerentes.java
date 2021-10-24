package br.com.heranca;

public class Gerentes extends Funcionario {

	private String usuario;
	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double calculaBonificacao() {
		return (this.getSalario() * 0.6) + 100;
	}

	@Override
	public String Imprime() {
		// TODO Auto-generated method stub
		return super.Imprime();
	}

}
