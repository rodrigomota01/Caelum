
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Alura");
		nico.setCpf("222.222.222-99");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
