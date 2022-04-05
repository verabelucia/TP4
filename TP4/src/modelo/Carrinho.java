package modelo;

import modelo.*;

import java.util.Random;

public class Carrinho {
	private double frete; //frete fixo
	private Produto item;
	private double valorCada;
	private double valorTotal;
	private int idVendedor;
	
	
	
	public Carrinho(Produto item) {
		this.item = item;
		
		Random random = new Random();
		frete = 10.1*(random. nextInt(3));
		valorCada = item.getPreco();
		valorTotal = valorCada + frete;
		idVendedor = item.usuario.getIdUsuario();
		
	}
	
	public String toString() {
		return 	" --------- Carrinho ------------" +
				resumirProdutos() +
				"\nPreço do(s) produto(s): "+ valorCada +
				"\nFrete: R$ "+ frete + " reais" +
				"\n\n    Valor total: " + valorTotal; 	
	}
	
	//------------------ metodos ----------------
	
	public String resumirProdutos() {
		String resumo = "\nItens:\n\tNome: "+item.nome+"\n\t1x "+item.preco+ "\n\ttam: "+item.tamanho+"\n"; //categoria
		return resumo;
	}
	
	
	// -----------gets e sets ------------
	
	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Produto getItem() {
		return item;
	}

	public void setItem(Produto item) {
		this.item = item;
	}

	public double getValorCada() {
		return valorCada;
	}

	public void setValorCada(double valorCada) {
		this.valorCada = valorCada;
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	
	

	
	


	
	
	
}