package entities;

public class Produtos {
	String nome;
	double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	
}
