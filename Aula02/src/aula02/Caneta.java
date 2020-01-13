package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Esta caneta �: " + this.cor);
		System.out.println("Tamanho da ponta: " + this.ponta);
		System.out.println("Quantidade de carga: " + this.carga);
		System.out.println("A caneta est� tampada?: " + this.tampada);
	}

	void rabiscar() {
		if (this.tampada == true)
			System.out.println("ERRO! N�o � poss�vel rabiscar com a caneta tampada");
		else
			System.out.println("A caneta est� rabiscando");
		System.out.println("--------------------------------------------------------");
	}

	void tampar() {
		this.tampada = true;

	}

	void destampar() {
		this.tampada = false;
	}
}
