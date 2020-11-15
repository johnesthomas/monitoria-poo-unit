package associacao_agregacao;

public class Programa {

	public static void main(String[] args) {

		Gabinete gabinete = new Gabinete("Dell", "500X", "ATX", 150.00);
		
		gabinete.addPeca(new Peca("WB", "1TB", "Hard Disk (HD)", 200.00));
		gabinete.addPeca(new Peca("Zotac", "GTX 1060 6GB", "Placa de Vídeo", 1500.00));
		gabinete.addPeca(new Peca("AMD", "Ryzen 5 2600X", "Processador", 1200.00));
		gabinete.addPeca(new Peca("BioStar", "ATX GT5", "Placa Mãe", 500));
		
		Mouse mouse = new Mouse("HyperX", "Ultra", "Normal", 100.00);
		
		Teclado teclado = new Teclado("HyperX", "Ultra", "Mecânico", 400.00);
		
		Monitor monitor = new Monitor("LG", "LED IPS", 21.5, 450.00);
		
		Computador computador = new Computador(monitor, teclado, mouse, gabinete);
		
		System.out.println("====== DADOS DO COMPUTADOR =====");
		
		System.out.print("MONITOR:");
		System.out.println(computador.getMonitor());
		System.out.println();
		
		System.out.print("TECLADO:");
		System.out.println(computador.getTeclado());
		System.out.println();
		
		System.out.print("MOUSE:");
		System.out.println(computador.getMouse());
		
		System.out.print("\nGABINETE: ");
		System.out.println(computador.getGabinete());
		
		computador.calcularPreco();
		System.out.println("--------------------------------------");
		System.out.printf("Valor Total do Computador: R$ %.2f", computador.getPreco());
			 
	}

}
