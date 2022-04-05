package controle;

import java.util.Date;

import modelo.*;

public class ControleCompra {
	private Compra[] comp;
	private int qtdComp;
	
	public ControleCompra(ControleDados d) {
		comp = d.getCompras();
		qtdComp = d.getQtdCompras();
	}
	// retorna o número do pedido 
	public int[] getNumeroPedido() {
		int[] q = new int[qtdComp];
		for (int i = 0; i < qtdComp; i++) {
			q[i] = comp[i].getNumeroPedido();
		}
		return q;
	}
	
	//-------------Gets e Sets ---------------------
	
	public int getQtd() {
		return qtdComp;
	}
	public void setQtd(int qtd) {
		this.qtdComp = qtd;
	}
	public Date getDataCompra(int i) {
		return comp[i].getDataCompra();
	}
	public String getStatusCompra(int i) {
		return comp[i].getStatusCompra();
	}
	public int getNumeroPedido(int i) {
		return comp[i].getNumeroPedido();
	}
	
	//usuario cliente associado
	public Usuario getUsuario(int i) {
		return comp[i].getUsuario();
	}
	
	//itens
	public Carrinho getCarrinho(int i) {
		return comp[i].getCarrinho();
	}
	
	
	
}
