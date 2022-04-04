package controle;

import modelo.*;

public class ControleCalcas {

	private Calca[] calc;
	private int qtdCalca;
	
	
	// ------------  Método -----------------
	
	public ControleCalcas(ControleDados d) {
		calc = d.getCalcas();
		qtdCalca = d.getQtdBlusas();
	}
	
	public String[] getNome() {
		String[] q = new String[qtdCalca];
		for (int i = 0; i < qtdCalca; i++) {
			q[i] = calc[i].getNome();
		}
		return q;
	}
	
	
	//-------------Gets e sets----------------
	
	public int getQtd() {
		return qtdCalca;
	}
	
	public void setQtd(int qtd) {
		this.qtdCalca = qtd;
	}
	
	public String getNome(int i) {
		return calc[i].getNome();
	}
	
	public int getIdProduto(int i) {
		return calc[i].getIdProduto();
	}
	
	public String getMarca(int i) {
		return calc[i].getMarca();
	}
	
	public double getPreco(int i) {
		return calc[i].getPreco();
	}
	
	public String getDepartamento(int i) {
		return calc[i].getDepartamento();
	}
	
	public String getDescricao(int i) {
		return calc[i].getDescricao();
	}
	
	public String getCor(int i) {
		return calc[i].getCor();
	}
	
	public String getTamanho(int i) {
		return calc[i].getTamanho();
	}
	
	public String getModeloBlusa(int i) {
		return calc[i].getModeloCalca();
	}
	
	public Usuario getUsuario(int i) {
		return calc[i].getUsuario();
	}
	
}
