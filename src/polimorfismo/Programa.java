package polimorfismo;

public class Programa {

	public static void main(String[] args) {

		Veiculo moto = new Moto("Honda", "PCX", "Branca", 102, 2, 8, 55, "Underbone em aço");
		Veiculo carro = new Carro("Chevrolet", "Onix LTZ 1.0 Turbo", "Prata", 187, 5, 44, 13.5, 275);
		
		// Utilizando os métodos sobreescritos da classe principal.		
		System.out.println(moto.calcularAutonomia());
		System.out.println(carro.calcularAutonomia());
		
		// Imprimir os objetos.
		System.out.println(moto);
		System.out.println(carro);
		
		// Atualizando os atributos de acordo com os métodos estabelecidos pela Interface
		moto.cor("Vermelha");
		moto.capTanque(15.00);
		moto.numPass(3);

		carro.cor("Vermelho");
		carro.capTanque(50.00);
		carro.numPass(2);
		
		// Imprimir os objetos depois da atualização.
		System.out.println(moto);
		System.out.println(carro);	
		

	}
}