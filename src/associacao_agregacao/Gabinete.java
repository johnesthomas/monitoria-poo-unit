package associacao_agregacao;

import java.util.ArrayList;

public class Gabinete {
	
	private String marca;
	private String modelo;
	private String tipo;
	private ArrayList<Peca> pecas = new ArrayList<>();
	private double precoGab; // preco do gabinete
	private double precoTotal; // preco do gabinete + pecas
	
	public Gabinete(String marca, String modelo, String tipo, double precoGab) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.precoGab = precoGab;
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

	public ArrayList<Peca> getPecas() {
		return pecas;
	}

	public void setPecas(ArrayList<Peca> pecas) {
		this.pecas = pecas;
	}

	public double getPrecoGab() {
		return precoGab;
	}

	public void setPrecoGab(double precoGab) {
		this.precoGab = precoGab;
	}

	public double getPrecoTotal() {
		return precoTotal+precoGab;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}	
	
	public void addPeca(Peca peca) {
		pecas.add(peca);
		this.precoTotal += peca.getPreco();
	}
	
	public String listarPecas() {
		StringBuilder sb = new StringBuilder();
		for (Peca peca : pecas) {
			sb.append(peca);			
		}
		
		String pecaTxt = sb.toString();
		
		return pecaTxt;
		
	}
	
	public String toString() {
		return 
				"\nMarca: " + marca + 
				"\nModelo: " + modelo + 
				"\nTipo: " + tipo +
				String.format("%nPreco do gabinete: %.2f%n", precoGab) + 				
				"\nPEÇAS: " + listarPecas() + 				
				String.format("%nPreco Total Gabinete + Peças: %.2f", precoTotal+precoGab);
				
		
	}
}