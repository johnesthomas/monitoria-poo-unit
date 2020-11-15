package associacao_agregacao;

public class Monitor {

	private String marca;
	private String modelo;
	private double tamanho;
	private double preco;
	
	public Monitor(String marca, String modelo, double tamanho, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho = tamanho;
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

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
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
				String.format("%nTamanho: %.1f'", tamanho) + 
				String.format("%nPreco: %.2f", preco);
	}
}