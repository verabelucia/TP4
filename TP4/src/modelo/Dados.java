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
	private int qtdCarrs = 0;
	private Compra[] compras = new Compra[15];
	private int qtdCompras = 0;
	private  Telefone[] tels = new Telefone[15];
	private int qtdTels = 0;
	private  Endereco[] ends = new Endereco[15];
	private int qtdEnds = 0;
	private  Pagamento[] pagamentos = new Pagamento[15];
	private int qtdPags = 0;

	
	//------m�todos para inserir e editar------------
	
	public void inserirEditarUsuarios(Usuario u, int posicao) {
		this.usuarios[posicao] = u;
		if (posicao == qtdUsuarios)
			qtdUsuarios++;
	}
	
	public void inserirEditarBlusas(Blusa b, int posicao) {
		this.blusas[posicao] = b;
		if (posicao == qtdBlusas)
			qtdBlusas++;
	}
	
	public void inserirEditarCalcas(Calca c, int posicao) {
		this.calcas[posicao] = c;
		if (posicao == qtdCalcas)
			qtdCalcas++;
	}
	
	public void inserirEditarBijus(Bijuteria b, int posicao) {
		this.bijus[posicao] = b;
		if (posicao == qtdBijus)
			qtdBijus++;
	}
	
	public void inserirEditarCarrinho(Carrinho c, int posicao) {
		this.carrs[posicao] = c;
		if (posicao == qtdCarrs)
			qtdCarrs++;
	}
	
	public void inserirEditarCompra(Compra c, int posicao) {
		this.compras[posicao] = c;
		if (posicao == qtdCompras)
			qtdCompras++;
	}
	
	//----- M�todo dados aleat�rios -> PROFESSORA
	
	//Dados aleat�rios
	
//		public void fillWithSomeData() {
//			Date d = Calendar.getInstance().getTime();   //-> USAR POSTERIORMENTE
			
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
//				bijus[i] = new Bijuteria(i, "Nome Biju"+i, "Marca Biju"+i, 10.0+i,"Departamento Biju"+i, "Descri��o Biju"+i, "Cor Biju"+i, "Tamanho Biju"+i, "Modelo Biju"+i, usuarios[i]);
//				blusas[i] = new Blusa(i, "Nome Blusa"+i, "Marca Blusa"+i, 10.0+i,"Departamento Blusa"+i, "Descri��o Blusa"+i, "Cor Blusa"+i, "Tamanho Blusa"+i, "Modelo Blusa"+i, usuarios[i]);
//				calcas[i] = new Calca(i, "Nome Cal�a"+i, "Marca Cal�a"+i, 10.0+i,"Departamento Cal�a"+i, "Descri��o Cal�a"+i, "Cor Cal�a"+i, "Tamanho Cal�a"+i, "Modelo Cal�a"+i, usuarios[i]);
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
			
			usuarios[0] = (new Usuario(0, "Nome"+0,000,null,null,null));
			usuarios[1] = (new Usuario(1, "Nome"+1,111,null,null,null));
			
	        calcas[0] = (new Calca(0, "Cal�a"+0,"Marca"+0, 0,"Departamento"+0, "Descri��o"+0, "Cor"+0,"Tamanho"+0, "Modelo Blusa"+0,null ));
	        calcas[1] = (new Calca(1, "Cal�a"+1,"Marca"+1, 0,"Departamento"+1, "Descri��o"+1, "Cor"+1,"Tamanho"+1, "Modelo Blusa"+1,null ));

	        blusas[0] = (new Blusa(0, "Blusa"+0,"Marca"+0, 0,"Departamento"+0, "Descri��o"+0, "Cor"+0,"Tamanho"+0, "Modelo Cal�a"+0,null ));
	        blusas[1] = (new Blusa(1, "Blusa"+1,"Marca"+1, 0,"Departamento"+1, "Descri��o"+1, "Cor"+1,"Tamanho"+1, "Modelo Cal�a"+1,null ));

	        bijus[0] = (new Bijuteria(0, "Biju"+0,"Marca"+0, 0,"Departamento"+0, "Descri��o"+0, "Cor"+0,"Tamanho"+0, "Modelo Bijuteria"+0,null ));
	        bijus[1] = (new Bijuteria(1, "Biju"+1,"Marca"+1, 0,"Departamento"+1, "Descri��o"+1, "Cor"+1,"Tamanho"+1, "Modelo Bijuteria"+1,null ));
	        
	        compras[0] = (new Compra(d, "Status"+0, 0, null, null));
	        compras[1] = (new Compra(d, "Status"+1, 1, null, null));

	        qtdBijus = 2;
	        qtdUsuarios = 2;
	        qtdCalcas = 2;
	        qtdBlusas = 2;
	        qtdCompras = 2;
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

	public int getQtdCarrs() {
		return qtdCarrs;
	}

	public void setQtdCarrs(int qtdCarrs) {
		this.qtdCarrs = qtdCarrs;
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
