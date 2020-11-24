package polimorfismo;

public class Programa {

	public static void main(String[] args) {
		
		Veiculo moto = new Moto("Honda", "PCX", "Branca", 102, 2, 8, 55, "Underbone em aço");
		
		System.out.println(moto.calcularAutonomia());
		
		Veiculo carro = new Carro("Chevrolet", "Onix LTZ 1.0 Turbo", "Prata", 187, 5, 44, 13.5, 275);
		
		System.out.println(carro.calcularAutonomia());
	}

}
