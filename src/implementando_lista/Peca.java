package implementando_lista;

public class Peca {
	
	private int codigo;
	private String descricao;
	private String marca;
	private String modelo;
	private String cor;
	private double valor;
		
	public Peca() {		
	}
	
	public Peca(int codigo, String descricao, String marca, String modelo, String cor, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public String toString() {
		return 
				"\nCodigo: " + getCodigo() +
				"\nDescrição: " + getDescricao() +
				"\nMarca: " + getMarca() + 
				"\nModelo: " + getModelo() + 
				"\nCor: " + getCor() + 
				String.format("%nR$: %.2f", getValor()) +
				 "\n";
		
	}		
}