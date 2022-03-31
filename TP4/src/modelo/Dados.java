package modelo;

public class Dados {
	private  Usuario[] usuario = new Usuario[15];
	private int qtdUsuarios = 0;
	private Bijuteria [] bijus = new Bijuteria[15];
	private int qtdBijus = 0;
	private Blusa[] blusas = new Blusa[15];
	private int qtdBlusas = 0;
	private Calca[] calcas = new Calca[15];
	private int qtdCalcas = 0;
	private Carrinho[] car = new Carrinho[15];
	private int qtdCarrinhos = 0;
	private Compra[] compras = new Compra[15];
	private int qtdCompras = 0;
	
	public void fillWithSomeData() {
		Date d = Calendar.getInstance().getTime();
		for(int i = 0; i < 5; i++) {
			tels[i] = new Telefone((i+1)*100, (i+1)*1000000);
			alunos[i] = new Aluno("Aluno"+i, "Endereco"+i, d, (i+1)*123456, (i+1)*112233, 
					tels[i]);
			profs[i] = new Professor("Professor"+i, (i+1)*1000, (i+1)*654321, 
					(i+1)*332211, tels[i]);
			cursos[i] = new Curso("Curso"+1, d, d, 8, 10, 40, "Orientacao a Objetos", 
					profs[i], (i+1)*400, 0);
			matr[i] = new Matricula(alunos[i], d, (i+1)*400, cursos[0], "Turma A");			
		}
		
		qtdAlunos = 5;
		qtdCursos = 5;
		qtdProfs = 5;
		qtdTels = 5;
		qtdMatriculados = 5;
	}
	
	
	
	
	
	
	
	//gets e sets
	
	public Usuario[] getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario[] usuario) {
		this.usuario = usuario;
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
	public Carrinho[] getCar() {
		return car;
	}
	public void setCar(Carrinho[] car) {
		this.car = car;
	}
	public int getQtdCarrinhos() {
		return qtdCarrinhos;
	}
	public void setQtdCarrinhos(int qtdCarrinhos) {
		this.qtdCarrinhos = qtdCarrinhos;
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
	

}
