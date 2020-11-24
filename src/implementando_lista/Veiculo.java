package implementando_lista;

import java.util.ArrayList;

public class Veiculo {

	private String marca;
	private String modelo;
	private String cor;
	private double velocidadeMaxima;
	private int numPassageiros;
	private int capTanque;
	private ArrayList<Peca> pecas;

	public Veiculo() {
	}

	public Veiculo(String marca, String modelo, String cor, double velocidadeMaxima, int numPassageiros,
			int capTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numPassageiros = numPassageiros;
		this.capTanque = capTanque;
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

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public int getCapTanque() {
		return capTanque;
	}

	public void setCapTanque(int capTanque) {
		this.capTanque = capTanque;
	}

	public ArrayList<Peca> getPecas() {
		return pecas;
	}	

	public void setPecas(ArrayList<Peca> pecas) {
		this.pecas = pecas;
	}

	// caso tenha o metodo "setPecas"
	public void addPecas(ArrayList<Peca> pecas) {
		this.setPecas(pecas);
	}

	// caso não tenha o método "setPecas"
	public void addPecas1(ArrayList<Peca> pecas) {
		this.pecas = pecas;
	}
	// existe essa maneira, mas não é aconselhável
	public void imprimePeca() {
		for (Peca peca : pecas) {

			System.out.println("Codigo: " + peca.getCodigo());
			System.out.println("Descrição: " + peca.getDescricao());
			System.out.println("Marca: " + peca.getMarca());
			System.out.println("Modelo: " + peca.getModelo());
			System.out.println("Cor: " + peca.getCor());
			System.out.printf("Valor: %.2f %n", peca.getValor());
			System.out.println("=================");

		}
	}
}