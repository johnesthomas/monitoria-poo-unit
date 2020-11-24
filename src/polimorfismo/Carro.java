package polimorfismo;

public class Carro extends Veiculo {
	private int capMala;
	
	public Carro() {		
	}	
	
	public Carro(String marca, String modelo, String cor, int velMax, int numPass, double capTanque, double kmPorLitro,
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
}
