
public class Gerente extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamou o método bonificação do GERENTE");
		return super.getSalario(); 
	}
	
	
}
