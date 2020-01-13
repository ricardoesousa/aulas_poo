package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Esta caneta é: " + this.cor);
		System.out.println("Tamanho da ponta: " + this.ponta);
		System.out.println("Quantidade de carga: " + this.carga);
		System.out.println("A caneta está tampada?: " + this.tampada);
	}

	void rabiscar() {
		if (this.tampada == true)
			System.out.println("ERRO! Não é possível rabiscar com a caneta tampada");
		else
			System.out.println("A caneta está rabiscando");
		System.out.println("--------------------------------------------------------");
	}

	void tampar() {
		this.tampada = true;

	}

	void destampar() {
		this.tampada = false;
	}
}
