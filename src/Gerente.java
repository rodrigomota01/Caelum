// Gerente � um Funcionario, Gerente herda da classe Funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private Autenticacaoutil autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticacaoutil();
	}

	public double getBonificacao() {
		System.out.println("Chamou o m�todo bonifica��o do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}


}
