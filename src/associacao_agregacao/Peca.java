package associacao_agregacao;

public class Peca {
	
	private String marca;
	private String modelo;
	private String descricao;
	private double preco;
	
	public Peca(String marca, String modelo, String descricao, double preco) {		
		this.marca = marca;
		this.modelo = modelo;
		this.descricao = descricao;
		this.preco = preco;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return
				"\nMarca: " + marca + 
				"\nModelo: " + modelo +
				"\nDescrição: " + descricao + 
				String.format("%nPreco: %.2f%n", preco);
	}
}