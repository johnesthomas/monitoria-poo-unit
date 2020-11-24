package polimorfismo;

public class Veiculo {

	private String marca;
	private String modelo;
	private String cor;
	private int velMax; // velocidade maxima
	private int numPass; // numero de passageiros
	private double capTanque; // capacidade do tanque de combustivel
	private double kmPorLitro;

	public Veiculo() {
	}

	public Veiculo(String marca, String modelo, String cor, int velMax, int numPass, double capTanque,
			double kmPorLitro) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velMax = velMax;
		this.numPass = numPass;
		this.capTanque = capTanque;
		this.kmPorLitro = kmPorLitro;
	}

	public Veiculo(String marca, String modelo, String cor, int numPass, double capTanque, double kmPorLitro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.numPass = numPass;
		this.capTanque = capTanque;
		this.kmPorLitro = kmPorLitro;
		this.velMax = 200;
	}

	public Veiculo(String marca, String modelo, int numPass, double capTanque, double kmPorLitro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPass = numPass;
		this.capTanque = capTanque;
		this.kmPorLitro = kmPorLitro;
		this.cor = "Branco";
		this.velMax = 180;
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

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public int getNumPass() {
		return numPass;
	}

	public void setNumPass(int numPass) {
		this.numPass = numPass;
	}

	public double getCapTanque() {
		return capTanque;
	}

	public void setCapTanque(int capTanque) {
		this.capTanque = capTanque;
	}

	public double getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	public String calcularAutonomia() {
		double autonomia = getCapTanque() * getKmPorLitro();
		return Double.toString(autonomia);
	}
}