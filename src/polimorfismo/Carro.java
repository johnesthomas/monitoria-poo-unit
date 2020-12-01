package polimorfismo;

public class Carro extends Veiculo {

	private int capMala;

	public Carro() {
	}

	public Carro(
			String marca, String modelo, String cor, int velMax, int numPass, double capTanque, double kmPorLitro,
			int capMala) {
		super(marca, modelo, cor, velMax, numPass, capTanque, kmPorLitro);
		this.capMala = capMala;
	}

	public int getCapMala() {
		return capMala;
	}

	public void setCapMala(int capMala) {
		this.capMala = capMala;
	}

	@Override
	public String calcularAutonomia() {
		double autonomia = (super.getCapTanque() * super.getKmPorLitro());
		return "Autonomia do Carro: " + Double.toString(autonomia);

	}

	@Override
	public void cor(String cor) {
		super.setCor(cor);
	}

	@Override
	public void numPass(int num) {
		super.setNumPass(num);
	}

	@Override
	public void capTanque(double capTanque) {
		super.setCapTanque(capTanque);

	}
	
	@Override
	public String toString() {
		return "Marca: " + super.getMarca() + "\n" +
				"Modelo: " + super.getModelo() + "\n" +
				"Cor: " + super.getCor() + "\n" + 
				"Vel. Máx.: " + super.getVelMax() + "\n" + 
				"Num. Passagueiros: " + super.getNumPass() + "\n" +
				"Capac. Tanque: " + super.getCapTanque() + "\n" + 
				"Km/L: " + super.getKmPorLitro()  + "\n" +
				"Capac. da Mala: " + getCapMala() + "\n";
		
	}
}