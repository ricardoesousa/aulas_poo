package aula03;

public class Aula03 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		// c1.ponta = 0.5f; *n�o � poss�vel alterar o atributo, pois o mesmo est� definido como privado na classe Caneta
		c1.carga = 80;
		//c1.tampada = true;
		// c1.rabiscar(); *n�o � poss�vel alterar o m�todo, pois o mesmo est� definido como privado na classe Caneta
		c1.destampar();
		c1.status();
	}

}
