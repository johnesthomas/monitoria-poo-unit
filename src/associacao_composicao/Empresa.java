package associacao_composicao;

import java.util.ArrayList;

public class Empresa {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String endereco;
	private String telefone;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String endereco, String telefone) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public void cadastrarDepto(Departamento depto) {
		departamentos.add(depto);
	}
	
	public void excluirDeptop(int codDepto) {
		for (Departamento departamento : departamentos) {
			if(departamento.getCodigo() == codDepto) {
				departamentos.remove(departamento);
				break;
			}
		}
	}
	
	public String toString() {
		return "Nome: " + nomeFantasia + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
	}

}
