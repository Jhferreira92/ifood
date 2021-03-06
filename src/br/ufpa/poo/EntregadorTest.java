  package br.ufpa.poo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntregadorTest {

	@Test
	void testNovoEntregador() {
		Entregador entregador = new Entregador("Henrique");
		
		Assertions.assertEquals(entregador.getNome(), "Henrique");
	}

	@Test
	void testReceberPedido() {
		Entregador entregador = new Entregador("Henrique");
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		entregador.receberPedido(novoPedido);
		
		Assertions.assertEquals(entregador.getPedido().getNome(), "Pizza de Queijo");
	}

	@Test
	void testReceberPagamento() {
		Entregador entregador = new Entregador("Henrique");
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		entregador.receberPedido(novoPedido);
		
		
		// QUAL O VALOR DO PEDIDO????
		boolean valorDoPedido = true;  
		
		Assertions.assertEquals(entregador.getPedido().statusPagamento(), valorDoPedido);
	}

}
