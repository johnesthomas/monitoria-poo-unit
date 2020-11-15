package associacao_composicao;

public class Programa {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("000.000.000/0000-00", "Inst. Tech", "Monitoria Tech", "Bairro do Recife", "92345-6789");

		Departamento depto = new Departamento(1, "TI");

		Funcionario funcionario = new Funcionario("Ana", "Design Jr", 2000.00);
		Funcionario funcionario1 = new Funcionario("Maria", "Gerente", 5000.00);

		// pode cadastrar desta forma
		depto.cadastrarFunc(funcionario);
		depto.cadastrarFunc(funcionario1);

		// pode cadastrar desta forma - sem precisar criar uma variável
		depto.cadastrarFunc(new Funcionario("Joao", "Dev. Jr", 2000.00));
		depto.cadastrarFunc(new Funcionario("Carlos", "Dev. Pl", 3000.00));

		empresa.cadastrarDepto(depto);

		System.out.println("===== Dados da Empresa =====");
		System.out.println();
		System.out.println(empresa);
		
		System.out.println();
		System.out.println("===== Departamento =====");
		System.out.println();

		// stringbuilder é usado para fazer concanenação de forma performatica
		// sem o stringbuilder o print sairá com colchetes do arraylist
		StringBuilder sb = new StringBuilder();
		for (Departamento dept : empresa.getDepartamentos()) {
			sb.append(dept);
		}
		String deptTxt = sb.toString();
		System.out.println(deptTxt);
		
		System.out.println();
		System.out.println("===== Funcionários =====");
		System.out.println();
		sb = new StringBuilder();
		for (Funcionario func : depto.listarFuncionarios()) {
			sb.append(func);
		}
		String funcTxt = sb.toString();
		System.out.print(funcTxt);		
		
		empresa.excluirDeptop(1);
		
		System.out.println("== Depois de Excluir o Departamento ==");
		
		System.out.println(empresa.getDepartamentos());
	}
	
}