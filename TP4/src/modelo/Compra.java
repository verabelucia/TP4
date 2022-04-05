package modelo;

import java.util.Calendar;
import java.util.Date;



public class Compra {
	
	private Date dataCompra;
	private String statusCompra;
	private int numeroPedido;
	
	private Usuario usuario;
	private Carrinho carrinho;

	

	public Compra(Date dataCompra, String statusCompra, int numeroPedido,Usuario usuario, Carrinho carrinho) {
		this.dataCompra = dataCompra;
		this.statusCompra = statusCompra;
		this.numeroPedido = numeroPedido;
		this.usuario = usuario;
		this.carrinho = carrinho;
	
	}
	
	public String toString() {
		Date dataCompra = Calendar.getInstance().getTime();
		return 	" ------------ Compra ------------------" +
		"\nNúmero Pedido: " + numeroPedido + 
		"\n\nData da Compra: " + dataCompra +
		"\nStatus: " + statusCompra +
		
		"\n\nID Vendedor: " + carrinho.getIdVendedor() +
		"\nID Cliente: " + usuario.getIdUsuario() + "\n" +
		
		carrinho.resumirProdutos() +
		"\nPreço do produto: "+ carrinho.getValorCada() +
		"\nFrete: R$ "+ carrinho.getFrete() + " reais" +
		"\n\n    Valor total: " + carrinho.getValorTotal(); 	
	}
				
	//------------------------ metodos -----------------------
	public void confirmar() {
	}
	
	public void cancelar() {
	}
	
	public void editarEndereco() {
	}
	

	
	// -------------------gets e sets -----------------------
	public Date getDataCompra() {
		return dataCompra;
	}
	
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	public String getStatusCompra() {
		return statusCompra;
	}
	
	public void setStatusCompra(String statusCompra) {
		this.statusCompra = statusCompra;
	}
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Carrinho getCarrinho() {
		return carrinho;
	}
	
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	
}