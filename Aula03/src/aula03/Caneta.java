package aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;

	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Esta caneta �: " + this.cor);
		System.out.println("Tamanho da ponta: " + this.ponta);
		System.out.println("Quantidade de carga: " + this.carga);
		System.out.println("A caneta est� tampada?: " + this.tampada);
	}

	private void rabiscar() {
		if (this.tampada == true)
			System.out.println("ERRO! N�o � poss�vel rabiscar com a caneta tampada");
		else
			System.out.println("A caneta est� rabiscando");
		System.out.println("--------------------------------------------------------");
	}

	protected void tampar() {
		this.tampada = true;

	}

	protected void destampar() {
		this.tampada = false;
		
	}
}
