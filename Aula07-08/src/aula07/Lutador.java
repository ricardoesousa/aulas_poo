package aula07;

public class Lutador {
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.println("Altura: " + getAltura() + "m de altura");
		System.out.println("Pesando: " + getPeso() + "Kg");
		System.out.println("Ganhou: " + getVitorias() + " lutas");
		System.out.println("Perdeu: " + getDerrotas() + " lutas");
		System.out.println("Empatou " + getEmpates() + " lutas");
	}

	public void status() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println(getNome());
		System.out.println("� um peso " + getCategoria());
		System.out.println(getVitorias() + " vit�rias");
		System.out.println(getDerrotas() + " derrotas");
		System.out.println(getEmpates() + " empates");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {

		this.setEmpates(this.getEmpates() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2)
			this.categoria = "Inv�lido";
		else if (this.peso <= 70.3)
			this.categoria = "Leve";
		else if (this.peso <= 83.9)
			this.categoria = "M�dio";
		else if (this.peso <= 120.2)
			this.categoria = "Pesado";
		else
			this.categoria = "Inv�lido";
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}

}
