// Gerente é um FuncionarioAuntenticaval, Gerente herda da classe FuncionarioAuntenticaval
public class Gerente extends FuncionarioAutenticavel{
	
	public double getBonificacao() {
		System.out.println("Chamou o método bonificação do GERENTE");
		return super.getSalario(); 
	}
	
	
}
