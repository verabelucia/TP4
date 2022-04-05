package controle;

import modelo.*;

import java.util.Calendar;
import java.util.Date;


public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.preDados();
	}
	
	
	//------------Métodos----------------------
	
		// USUARIO ------------------
	public boolean inserirEditarUsuario(String[] dadosUsuario) {
		 //0 - idUsuario; 1 - nome;2 - cpf; 3 - telefone; 4 - pagamento; 5 - endereco;
	        Usuario p = new Usuario(Integer.parseInt(dadosUsuario[0]), dadosUsuario[1],Integer.parseInt(dadosUsuario[2]), 
	        		null, //telefone
	        		null, //pagamento
	        		null); //endereço
	        d.inserirEditarUsuario(p, Integer.parseInt(dadosUsuario[0]));
	        return true;
	    } 
	
	public boolean removerUsuario(int i) {

		String usuarioRemovido = d.getUsuarios()[i].getNome();

		if (i == (d.getQtdUsuarios() - 1)) { 
			d.setQtdUsuarios(d.getQtdUsuarios() - 1);
			d.getUsuarios()[d.getQtdUsuarios()] = null;
			return true;
		} else { 
			int cont = 0;
			while (d.getUsuarios()[cont].getNome().compareTo(usuarioRemovido) != 0) {
				cont++;
			}
		
			for (int j = cont; j < d.getQtdUsuarios() - 1; j++) {
				d.getUsuarios()[j] = null;
				d.getUsuarios()[j] = d.getUsuarios()[j + 1];
			}
			d.getUsuarios()[d.getQtdUsuarios()] = null;
			d.setQtdUsuarios(d.getQtdUsuarios() - 1);
			return true;
		}
			
	}
		
	
		// BLUSA ---------------------
	public boolean inserirEditarBlusa(String[] dadosBlusa) {
	        Blusa p = new Blusa(Integer.parseInt(dadosBlusa[0]), //ID
	        					dadosBlusa[1], //nome
	        					dadosBlusa[2], //marca
	        					Float.parseFloat(dadosBlusa[3]), //preco
	        					dadosBlusa[4], //departamento
	        					dadosBlusa[5], //descricao
	        					dadosBlusa[6], //cor
	        					dadosBlusa[7], //tamanho
	        					dadosBlusa[8], //modeloblusa
	        					null); //usuario(vendedor)
	        d.inserirEditarBlusa(p, Integer.parseInt(dadosBlusa[0]));
	        return true; 
	    }
	
	public boolean removerBlusa(int i) {
		String blusaRemovida = d.getBlusas()[i].getNome();

		if (i == (d.getQtdBlusas() - 1)) { 
			d.setQtdBlusas(d.getQtdBlusas() - 1);
			d.getBlusas()[d.getQtdBlusas()] = null;
			return true;
		} else { 
			int cont = 0;
			while (d.getBlusas()[cont].getNome().compareTo(blusaRemovida) != 0) {
				cont++;
			}
		
			for (int j = cont; j < d.getQtdBlusas() - 1; j++) {
				d.getBlusas()[j] = null;
				d.getBlusas()[j] = d.getBlusas()[j + 1];
			}
			d.getBlusas()[d.getQtdBlusas()] = null;
			d.setQtdBlusas(d.getQtdBlusas() - 1);
			return true;
		}
			
	}
	
		// CALCAS -------------
	public boolean inserirEditarCalca(String[] dadosCalca) {
	        Calca p = new Calca(Integer.parseInt(dadosCalca[0]), dadosCalca[1], dadosCalca[2], Float.parseFloat(dadosCalca[3]), dadosCalca[4], dadosCalca[5], dadosCalca[6], dadosCalca[7], dadosCalca[8],null);
	        d.inserirEditarCalca(p, Integer.parseInt(dadosCalca[0]));
	        return true; 
	    }
	
	public boolean removerCalca(int i) {
		String calcaRemovida = d.getCalcas()[i].getNome();

		if (i == (d.getQtdCalcas() - 1)) { 
			d.setQtdCalcas(d.getQtdCalcas() - 1);
			d.getCalcas()[d.getQtdCalcas()] = null;
			return true;
		} else { 
			int cont = 0;
			while (d.getCalcas()[cont].getNome().compareTo(calcaRemovida) != 0) {
				cont++;
			}
		
			for (int j = cont; j < d.getQtdCalcas() - 1; j++) {
				d.getCalcas()[j] = null;
				d.getCalcas()[j] = d.getCalcas()[j + 1];
			}
			d.getCalcas()[d.getQtdCalcas()] = null;
			d.setQtdCalcas(d.getQtdCalcas() - 1);
			return true;
		}
			
	}
	
		// BIJUS --------------
	public boolean inserirEditarBijus(String[] dadosBijus) {
	        Bijuteria p = new Bijuteria(Integer.parseInt(dadosBijus[0]), dadosBijus[1], dadosBijus[2], Float.parseFloat(dadosBijus[3]), dadosBijus[4], dadosBijus[5], dadosBijus[6], dadosBijus[7], dadosBijus[8],null);
	        d.inserirEditarBiju(p, Integer.parseInt(dadosBijus[0]));
	        return true; 
	    }
	
	public boolean removerBiju(int i) {
		String bijuRemovida = d.getBijus()[i].getNome();

		if (i == (d.getQtdBijus() - 1)) { 
			d.setQtdBijus(d.getQtdBijus() - 1);
			d.getBijus()[d.getQtdBijus()] = null;
			return true;
		} else { 
			int cont = 0;
			while (d.getBijus()[cont].getNome().compareTo(bijuRemovida) != 0) {
				cont++;
			}
		
			for (int j = cont; j < d.getQtdBijus() - 1; j++) {
				d.getBijus()[j] = null;
				d.getBijus()[j] = d.getBijus()[j + 1];
			}
			d.getBijus()[d.getQtdBijus()] = null;
			d.setQtdBijus(d.getQtdBijus() - 1);
			return true;
		}	
	}
	 
	
	 //------------------- PROBLEMAS DE CÓDIGO -------------------
	 
	
	public boolean inserirEditarCarrinho(String[] dadosCarrinho) {
	        
		Carrinho p = new Carrinho(null); //produto
	        d.inserirEditarCarrinho(p, 0);
	        return true; 
	    }
	 
	 public boolean inserirEditarCompra(String[] dadosCompra) {
		 Date h = Calendar.getInstance().getTime();   //-> USAR POSTERIORMENTE 
		 Compra p = new Compra(h, //dataCompra
	        				   dadosCompra[1], //statusCompra
	        				   Integer.parseInt(dadosCompra[2]), //numeroPedido
	        				   null, //usuario
	        				   null); //carrinho
	        d.inserirEditarCompra(p, Integer.parseInt(dadosCompra[2]));
	        return true; 
	    }

	
	//-------------Gets e sets----------------
	
		public Dados getDados() {
			return d;
		}

		public void setDados(Dados d) {
			this.d = d;
		}
		
		public Usuario[] getUsuarios() {
			return this.d.getUsuarios();
		}
		public int getQtdUsuarios() {
			return this.d.getQtdUsuarios();
		}
		
		public Blusa[] getBlusas() {
			return this.d.getBlusas();
		}
		public int getQtdBlusas() {
			return this.d.getQtdBlusas();
		}
		
		public Bijuteria[] getBijus() {
			return this.d.getBijus();
		}
		public int getQtdBijus() {
			return this.d.getQtdBijus();
		}
		
		public Calca[] getCalcas() {
			return this.d.getCalcas();
		}
		public int getQtdCalcas() {
			return this.d.getQtdCalcas();
		}
		
		public Carrinho[] getCarrs() {
			return this.d.getCarrs();
		}
		public int getQtdItensCarrs() {
			return this.d.getQtdItensCarrs();
		}
		
		public Compra[] getCompras() {
			return this.d.getCompras();
		}
		public int getQtdCompras() {
			return this.d.getQtdCompras();
		}
		
		
		 
	
	
	
}
