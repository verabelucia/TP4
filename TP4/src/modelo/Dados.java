package modelo;

import java.util.Calendar;

import java.util.Date;

public class Dados {
	private  Usuario[] usuarios = new Usuario[15];
	private int qtdUsuarios = 0;
	private Bijuteria [] bijus = new Bijuteria[15];
	private int qtdBijus = 0;
	private Blusa[] blusas = new Blusa[15];
	private int qtdBlusas = 0;
	private Calca[] calcas = new Calca[15];
	private int qtdCalcas = 0;
	private Carrinho[] carrs = new Carrinho[15];
	private int qtdItensCarrs = 0;
	private Compra[] compras = new Compra[15];
	private int qtdCompras = 0;
	private  Telefone[] tels = new Telefone[15];
	private int qtdTels = 0;
	private  Endereco[] ends = new Endereco[15];
	private int qtdEnds = 0;
	private  Pagamento[] pagamentos = new Pagamento[15];
	private int qtdPags = 0;

	
	//------métodos para inserir e editar------------
	
	public void inserirEditarUsuario(Usuario u, int posicao) {
		this.usuarios[posicao] = u;
		if (posicao == qtdUsuarios)
			qtdUsuarios++;
	}
	
	public void inserirEditarBlusa(Blusa b, int posicao) {
		this.blusas[posicao] = b;
		if (posicao == qtdBlusas)
			qtdBlusas++;
	}
	
	public void inserirEditarCalca(Calca c, int posicao) {
		this.calcas[posicao] = c;
		if (posicao == qtdCalcas)
			qtdCalcas++;
	}
	
	public void inserirEditarBiju(Bijuteria b, int posicao) {
		this.bijus[posicao] = b;
		if (posicao == qtdBijus)
			qtdBijus++;
	}
	
	public void inserirEditarCarrinho(Carrinho c, int posicao) {
		this.carrs[posicao] = c;
		if (posicao == qtdItensCarrs)
			qtdItensCarrs++;
	}
	
	public void inserirEditarCompra(Compra c, int posicao) {
		this.compras[posicao] = c;
		if (posicao == qtdCompras)
			qtdCompras++;
	}
	
	//----- Método dados aleatórios -> PROFESSORA
	
	//Dados aleatórios
	
//		public void fillWithSomeData() {
//			Date hoje = Calendar.getInstance().getTime();   //-> USAR POSTERIORMENTE
			
//			for(int i = 0; i < 2; i++) {
//				//(int ddd, int numero)
//				tels[i] = new Telefone((i+1)*100, (i+1)*1000000);
//				//(int numeroCartao, int cvc, int validade)
//				pagamentos[i] = new Pagamento((100000)+i, (100)+i, (1000)+i);
//				//(int cep, int lote, String nomeRua, String complemento)
//				ends[i] = new Endereco(2000+i, 200+i,"Rua"+i, "Complemento"+i);
//				//(int idUsuario, String nome,int cpf, Telefone telefone, Pagamento pagamento, Endereco endereco)
//				usuarios[i] = new Usuario(i, "Nome"+i, 22211100+i, tels[i], pagamentos[i],ends[i]);
//				
//				//PRODUTOS
//				
//				//(int idProduto,String nome,String marca, double preco, String departamento, String descricao, String cor, String tamanho/*, byte[] foto*/, String modeloBijuteria, Usuario usuario)
//				bijus[i] = new Bijuteria(i, "Nome Biju"+i, "Marca Biju"+i, 10.0+i,"Departamento Biju"+i, "Descrição Biju"+i, "Cor Biju"+i, "Tamanho Biju"+i, "Modelo Biju"+i, usuarios[i]);
//				blusas[i] = new Blusa(i, "Nome Blusa"+i, "Marca Blusa"+i, 10.0+i,"Departamento Blusa"+i, "Descrição Blusa"+i, "Cor Blusa"+i, "Tamanho Blusa"+i, "Modelo Blusa"+i, usuarios[i]);
//				calcas[i] = new Calca(i, "Nome Calça"+i, "Marca Calça"+i, 10.0+i,"Departamento Calça"+i, "Descrição Calça"+i, "Cor Calça"+i, "Tamanho Calça"+i, "Modelo Calça"+i, usuarios[i]);
//				
//				//(Blusa blusa, Calca calca, Bijuteria bijuteria)
//				carrs[i] = new Carrinho(blusas[i], calcas[i], bijus[i]);
//				//(int dataCompra, String statusCompra, int numeroPedido,Usuario usuario, Carrinho carrinho)
//				compras[i] = new Compra(d, "Status"+i,3000+i, usuarios[i], carrs[i]);
//						
//			}
			
//			qtdUsuarios = 2;
//			qtdBijus = 2;
//			qtdBlusas = 2;
//			qtdCalcas = 2;
//			qtdCarrs = 2;
//			qtdCompras = 2;
//			qtdTels = 2;
//			qtdEnds = 2;
//			qtdPags = 2;
//		}
		
		public void preDados() {
			
			Date d = Calendar.getInstance().getTime();
			
			//usuarios[0] = (new Usuario(1, "Nome"+1,111,new Telefone(11, 91111),new Pagamento(511, 111, 3011),new Endereco(711, 1,"Rua"+1, "Complemento"+1)));
			usuarios[0] = (new Usuario(1, "Nome"+1,111,null,null,null));
			usuarios[1] = (new Usuario(2, "Nome"+2,222,null,null,null));
			
	        calcas[0] = (new Calca(1, "Calça"+1,"Marca"+1, 1,"Departamento"+1, "Descrição"+1, "Cor"+1,"Tamanho"+1, "Modelo Blusa"+1,null ));
	        calcas[1] = (new Calca(2, "Calça"+1,"Marca"+2, 2,"Departamento"+2, "Descrição"+2, "Cor"+2,"Tamanho"+2, "Modelo Blusa"+2,null ));

	        blusas[0] = (new Blusa(1, "Blusa"+1,"Marca"+1, 1,"Departamento"+1, "Descrição"+1, "Cor"+1,"Tamanho"+1, "Modelo Calça"+1,null ));
	        blusas[1] = (new Blusa(2, "Blusa"+2,"Marca"+2, 2,"Departamento"+2, "Descrição"+2, "Cor"+2,"Tamanho"+2, "Modelo Calça"+2,null ));

	        bijus[0] = (new Bijuteria(1, "Bijuteria"+1,"Marca"+1, 1,"Departamento"+1, "Descrição"+1, "Cor"+1,"Tamanho"+1, "Modelo Bijuteria"+1,null ));
	        bijus[1] = (new Bijuteria(2, "Bijuteria"+2,"Marca"+2, 2,"Departamento"+2, "Descrição"+2, "Cor"+2,"Tamanho"+2, "Modelo Bijuteria"+2,null ));
	        
	        compras[0] = (new Compra(d, "Status"+0, 0, null, null));
	        compras[1] = (new Compra(d, "Status"+1, 1, null, null));
	        
	        //carrs[0]= (new Carrinho(null)); dando erro
	        //carrs[1]= (new Carrinho(null));

	        qtdBijus = 2;
	        qtdUsuarios = 2;
	        qtdCalcas = 2;
	        qtdBlusas = 2;
	        qtdCompras = 2;
	        qtdItensCarrs = 2;
	    }

	
	//----------------gets e sets-------------------
	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	public int getQtdUsuarios() {
		return qtdUsuarios;
	}

	public void setQtdUsuarios(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}

	public Bijuteria[] getBijus() {
		return bijus;
	}

	public void setBijus(Bijuteria[] bijus) {
		this.bijus = bijus;
	}

	public int getQtdBijus() {
		return qtdBijus;
	}

	public void setQtdBijus(int qtdBijus) {
		this.qtdBijus = qtdBijus;
	}

	public Blusa[] getBlusas() {
		return blusas;
	}

	public void setBlusas(Blusa[] blusas) {
		this.blusas = blusas;
	}

	public int getQtdBlusas() {
		return qtdBlusas;
	}

	public void setQtdBlusas(int qtdBlusas) {
		this.qtdBlusas = qtdBlusas;
	}

	public Calca[] getCalcas() {
		return calcas;
	}

	public void setCalcas(Calca[] calcas) {
		this.calcas = calcas;
	}

	public int getQtdCalcas() {
		return qtdCalcas;
	}

	public void setQtdCalcas(int qtdCalcas) {
		this.qtdCalcas = qtdCalcas;
	}

	public Carrinho[] getCarrs() {
		return carrs;
	}

	public void setCarrs(Carrinho[] carrs) {
		this.carrs = carrs;
	}

	public int getQtdItensCarrs() {
		return qtdItensCarrs;
	}

	public void setQtdItensCarrs(int qtdCarrs) {
		this.qtdItensCarrs = qtdCarrs;
	}

	public Compra[] getCompras() {
		return compras;
	}

	public void setCompras(Compra[] compras) {
		this.compras = compras;
	}

	public int getQtdCompras() {
		return qtdCompras;
	}

	public void setQtdCompras(int qtdCompras) {
		this.qtdCompras = qtdCompras;
	}

	public Telefone[] getTels() {
		return tels;
	}

	public void setTels(Telefone[] tels) {
		this.tels = tels;
	}

	public int getQtdTels() {
		return qtdTels;
	}

	public void setQtdTels(int qtdTels) {
		this.qtdTels = qtdTels;
	}

	public Endereco[] getEnds() {
		return ends;
	}

	public void setEnds(Endereco[] ends) {
		this.ends = ends;
	}

	public int getQtdEnds() {
		return qtdEnds;
	}

	public void setQtdEnds(int qtdEnds) {
		this.qtdEnds = qtdEnds;
	}

	public Pagamento[] getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(Pagamento[] pagamentos) {
		this.pagamentos = pagamentos;
	}

	public int getQtdPags() {
		return qtdPags;
	}

	public void setQtdPags(int qtdPags) {
		this.qtdPags = qtdPags;
	}



}
