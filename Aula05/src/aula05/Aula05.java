package aula05;

import aula05.ContaBanco;

public class Aula05 {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.estadoAtual();
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Creusa");
		p2.estadoAtual();
		p2.abrirConta("CP");
		
		p1.estadoAtual();
		p2.estadoAtual();
		
	}
	
	
}