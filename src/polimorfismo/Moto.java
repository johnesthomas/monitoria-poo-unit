package polimorfismo;

public class Moto extends Veiculo {

	private String tipoDeQuadro;

	public Moto() {
	}

	public Moto(String marca, String modelo, String cor, int velMax, int numPass, double capTanque, double kmPorLitro,
			String tipoDeQuadro) {
		super(marca, modelo, cor, velMax, numPass, capTanque, kmPorLitro);
		this.tipoDeQuadro = tipoDeQuadro;
	}

	public String getTipoDeQuadro() {
		return tipoDeQuadro;
	}

	public void setTipoDeQuadro(String tipoDeQuadro) {
		this.tipoDeQuadro = tipoDeQuadro;
	}

	@Override
	public String calcularAutonomia() {
		double autonomia = (super.getCapTanque() * super.getKmPorLitro());
		return "Autonomia da Moto: " + Double.toString(autonomia);

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
				"Cor:: " + super.getCor() + "\n" + 
				"Vel. Máx.: " + super.getVelMax() + "\n" + 
				"Num. Passagueiros: " + super.getNumPass() + "\n" +
				"Capac. Tanque: " + super.getCapTanque() + "\n" + 
				"Km/L: " + super.getKmPorLitro()  + "\n" +
				"Tipo de Quadro: " + getTipoDeQuadro() + "\n";
		
	}
}