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
}
