package br.ufpa.poo;

public class Pedido {
// variável de classe é aconselhavel que tenha visibilidade PRIVATE.
	private String nomeDoPedido ;
	
//Construtor 
	public Pedido(String pedido) {
		this.nomeDoPedido = pedido;
	}
	public String getNome() {
	 return this.nomeDoPedido ;
		
	}

}
