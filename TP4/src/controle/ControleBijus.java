package controle;

import modelo.*;

public class ControleBijus {
	
	private Bijuteria[] biju;
	private int qtdBiju;
	
	
	// ------------  Método -----------------
	
	public ControleBijus(ControleDados d) {
		biju = d.getBijus();
		qtdBiju = d.getQtdBijus();
	}
	
	public String[] getNome() {
		String[] q = new String[qtdBiju];
		for (int i = 0; i < qtdBiju; i++) {
			q[i] = biju[i].getNome();
		}
		return q;
	}
	
	
	//-------------Gets e sets----------------
	
	public int getQtd() {
		return qtdBiju;
	}
	
	public void setQtd(int qtd) {
		this.qtdBiju = qtd;
	}
	
	public String getNome(int i) {
		return biju[i].getNome();
	}
	
	public int getIdProduto(int i) {
		return biju[i].getIdProduto();
	}
	
	public String getMarca(int i) {
		return biju[i].getMarca();
	}
	
	public double getPreco(int i) {
		return biju[i].getPreco();
	}
	
	public String getDepartamento(int i) {
		return biju[i].getDepartamento();
	}
	
	public String getDescricao(int i) {
		return biju[i].getDescricao();
	}
	
	public String getCor(int i) {
		return biju[i].getCor();
	}
	
	public String getTamanho(int i) {
		return biju[i].getTamanho();
	}
	
	public String getModeloBiju(int i) {
		return biju[i].getModeloBiju();
	}
	
	public Usuario getUsuario(int i) {
		return biju[i].getUsuario();
	}
	
}
