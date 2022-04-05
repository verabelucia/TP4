package controle;

import modelo.*;

public class ControleCarrinho {
	private Carrinho[] carrin;
	private int qtdItens;
	
	public ControleCarrinho(ControleDados d) {
		carrin = d.getCarrs();
		qtdItens = d.getQtdItensCarrs();
	}
	// retorna o id vendedor associado ao carrinho
	public int[] getIdVendedor() {
		int[] q = new int[qtdItens];
		for (int i = 0; i < qtdItens; i++) {
			q[i] = carrin[i].getIdVendedor();
		}
		return q;
	}
	
	//-------------Gets e Sets ---------------------
	
	public int getQtd() {
		return qtdItens;
	}
	public void setQtd(int qtd) {
		this.qtdItens = qtd;
	}
	public double getFrete(int i) {
		return carrin[i].getFrete();
	}
	public Produto getItem(int i) {
		return carrin[i].getItem();
	}
	public double getValorCada(int i) {
		return carrin[i].getValorCada();
	}
	
	public double getValorTotal(int i) {
		return carrin[i].getValorTotal();
	}
	
	
	
}
