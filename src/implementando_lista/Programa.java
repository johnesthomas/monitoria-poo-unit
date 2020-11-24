package implementando_lista;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {

		// Veiculo automovel = new Veiculo();

		// automovel.setMarca("Renault");
		// automovel.setModelo("Kwid");
		// automovel.setCor("Branco");
		// automovel.setVelocidadeMaxima(156.00);
		// automovel.setNumPassageiros(5);
		// automovel.setCapTanque(38);

		// (1) Instanciando uma lista de peças

		ArrayList<Peca> listaPecas = new ArrayList<Peca>();

		// (2) Adicionando peças à lista
		
		listaPecas.add(new Peca(500, "Pneu", "Continental", "165/70 R14", "Preto", 200.00)); // 1
		listaPecas.add(new Peca(501, "Porta", "Fiat", "XX", "Branca", 800.00)); // 2

		// (3) Imprimindo a lista de peças
		
		for (Peca peca : listaPecas) {
			
			System.out.println("Codigo: " + peca.getCodigo());
			System.out.println("Descrição: " + peca.getDescricao());
			System.out.println("Marca: " + peca.getMarca());
			System.out.println("Modelo: " + peca.getModelo());
			System.out.println("Cor: " + peca.getCor());
			System.out.printf("Valor: %.2f %n", peca.getValor());
			System.out.println("=================");

		}

		// (4) Remover peça da lista

		//listaPecas.remove(1);

		System.out.println("Depois do remove()");
		System.out.println();

		for (Peca peca : listaPecas) {

			System.out.println("Codigo: " + peca.getCodigo());
			System.out.println("Descrição: " + peca.getDescricao());
			System.out.println("Marca: " + peca.getMarca());
			System.out.println("Modelo: " + peca.getModelo());
			System.out.println("Cor: " + peca.getCor());
			System.out.printf("Valor: %.2f %n", peca.getValor());
			System.out.println("=================");

		}

		// (5) Retornando um elemento da lista
		System.out.println("Usando get");
		System.out.println(listaPecas.get(0)); // não vai funcionar enquanto o objeto "pecas" n tiver toString()
		System.out.println("-----------------------");
		
		Veiculo auto = new Veiculo("Fiat", "Toro", "Branco", 188, 5, 60);
		
		auto.addPecas(listaPecas);
		
		System.out.println("Marca:" + auto.getMarca());
		System.out.println("Modelo: " + auto.getModelo());		
				
		StringBuilder sb = new StringBuilder();
		for (Peca peca : auto.getPecas()) {
			sb.append(peca);
		}
		String pecaTxt = sb.toString();
		System.out.println(pecaTxt);
		
		//System.out.println(auto.getPecas());
		//auto.imprimePeca(); // -- também imprime, mas não é a melhor forma
		
		
		
	}

	public static void imprimePeca(ArrayList<Peca> listaPecas) {

		for (Peca peca : listaPecas) {

			System.out.println("Codigo: " + peca.getCodigo());
			System.out.println("Descrição: " + peca.getDescricao());
			System.out.println("Marca: " + peca.getMarca());
			System.out.println("Modelo: " + peca.getModelo());
			System.out.println("Cor: " + peca.getCor());
			System.out.printf("Valor: %.2f %n", peca.getValor());
			System.out.println("=================");

			// imprimePeca(listaPecas);
		}
	}

}
