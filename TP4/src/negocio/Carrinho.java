package negocio;

public class Carrinho {
	private double frete = 30.0; //frete fixo
	private double valorTotal;
	
	//preço
	private Blusa blusa;
	private Calca calca;
	private Bijuteria bijuteria;
	
	public Carrinho(Blusa blusa, Calca calca, Bijuteria bijuteria) {
		this.blusa = blusa;
		this.calca = calca;
		this.bijuteria = bijuteria;
	}
	
	public String toString() {
		return 	" --------- Carrinho ------------" +
				resumirProdutos() +
				"\nPreço do(s) produto(s): "+ somarValores() +
				"\nFrete: R$ 30 reais"+
				"\n\n    Valor total: " + getValorTotal(); 	
	}
	
	//------------------ metodos ----------------
	public String resumirProdutos() {
		String resumo = "";
		if (blusa!= null) {
			resumo += "\nBlusa\nNome: "+blusa.nome+"\n1x "+blusa.preco+ "\ntam: "+blusa.tamanho+"\n";
		}
		if (calca!= null) {
			resumo += "\nCalça\nNome: "+calca.nome+"\n1x "+calca.preco+ "\ntam: "+calca.tamanho+"\n";
		} 
		if (bijuteria!= null) {
			resumo += "\nBijuteria\nNome: "+bijuteria.nome+"\n1x "+bijuteria.preco+ "\ntam: "+bijuteria.tamanho+"\n";
		}
		return resumo;
	}
	
	public double somarValores() {
		double valor = 0;
		valor += blusa.preco;
		valor += calca.preco;
		valor += bijuteria.preco;
		return valor;
	}
	
	public String datarVendedor() {
		int id = blusa.usuario.getIdUsuario();
		String nome = blusa.usuario.getNome();
		return id + " - " + nome;
	}
	
	public void comprar() {
	}
	
	public void deletarItem() {
	}
	
	
	

	
	// -----------gets e sets ------------
	
	

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

	public double getValorTotal() {
		return valorTotal = somarValores() + frete;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Blusa getBlusa() {
		return blusa;
	}

	public void setBlusa(Blusa blusa) {
		this.blusa = blusa;
	}

	public Calca getCalca() {
		return calca;
	}

	public void setCalca(Calca calca) {
		this.calca = calca;
	}

	public Bijuteria getBijuteria() {
		return bijuteria;
	}

	public void setBijuteria(Bijuteria bijuteria) {
		this.bijuteria = bijuteria;
	}
	


	
	
	
}