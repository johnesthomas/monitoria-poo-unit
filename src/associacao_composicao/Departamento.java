package associacao_composicao;

import java.util.ArrayList;

public class Departamento {
	private int codigo;
	private String nomeSetor;
	private int qtdFunc; // quantidade de funcionarios
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
	public Departamento(int codigo, String nomeSetor) {
		this.codigo = codigo;
		this.nomeSetor = nomeSetor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public int getQtdFunc() {
		return qtdFunc;
	}

	public ArrayList<Funcionario> listarFuncionarios() {
		return funcionarios;
	}
	
	public void cadastrarFunc(Funcionario funcionario) {
		funcionarios.add(funcionario);
		qtdFunc++;
	}
	
	public String toString() {
		return
				"Codigo: " + codigo + 
				"\nNome: " + nomeSetor + 
				"\nQtd Funcionarios: " + qtdFunc;
		
	}	
}