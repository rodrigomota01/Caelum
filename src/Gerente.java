
public class Gerente extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamou o m�todo bonifica��o do GERENTE");
		return super.getSalario(); 
	}
	
	
}
