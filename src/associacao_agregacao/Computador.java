package associacao_agregacao;

public class Computador {

	private Monitor monitor;
	private Teclado teclado;
	private Mouse mouse;
	private Gabinete gabinete;
	private double preco; // valor total do computador
	
	public Computador(Monitor monitor, Teclado teclado, Mouse mouse, Gabinete gabinete) {
		this.monitor = monitor;
		this.teclado = teclado;
		this.mouse = mouse;
		this.gabinete = gabinete;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Gabinete getGabinete() {
		return gabinete;
	}

	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void calcularPreco() {
		this.preco = monitor.getPreco() + teclado.getPreco() + mouse.getPreco() + gabinete.getPrecoTotal();
	}	
}