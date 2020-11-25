package br.ufpa.poo;

public class Cliente {
	//Variávis de Classe de nom e cpf 
	private String nome;
	private String cpf;
	
	//Construtor
	public Cliente(String nome, String cpf) {
		//Aqui esta rolando uma atribuiçãó
		this.nome = nome ;
		this.cpf = cpf ;
	
	}

	public String getNome() {
		return this.nome ;
	}

	public void realizarPedido(String pedido, Restaurante restaurant) {
		
	}
	// É UM METODO DE CLIENTE 
	public Pedido getPedido() {
		// TODO Auto-generated method stub
		return null;
	}

}
