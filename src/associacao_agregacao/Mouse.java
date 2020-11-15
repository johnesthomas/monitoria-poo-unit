package associacao_agregacao;

public class Mouse {

	private String marca;
	private String modelo;
	private String tipo;
	private double preco;
	
	public Mouse(String marca, String modelo, String tipo, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
				"\nTipo: " + tipo + 
				String.format("%nPreco: %.2f", preco);
	}
}