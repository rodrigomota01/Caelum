// Gerente � um FuncionarioAuntenticaval, Gerente herda da classe FuncionarioAuntenticaval
public class Gerente extends FuncionarioAutenticavel{
	
	public double getBonificacao() {
		System.out.println("Chamou o m�todo bonifica��o do GERENTE");
		return super.getSalario(); 
	}
	
	
}
