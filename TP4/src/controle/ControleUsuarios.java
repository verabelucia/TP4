package controle;

import modelo.*;

public class ControleUsuarios {
	// implementar método para lidar com usuarios (incluindo pagamento, endereço e telefone)
	private Usuario[] user;
	private int qtdUsuarios;
	
	
	public ControleUsuarios(ControleDados d) {
		user = d.getUsuarios();
		qtdUsuarios = d.getQtdUsuarios();
		
	}
	
	public String[] getNome() {
		String[] q = new String[qtdUsuarios];
		for(int i = 0; i < qtdUsuarios; i++) {
			q[i] = user[i].getNome();
		}
		
		return q;
	}

	
	//-------------Gets e sets----------------
	
	public int getQtd() {
		return qtdUsuarios;
	}
	
	public void setQtdUsuarios(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}

	public void setQtd(int qtd) {
		this.qtdUsuarios = qtd;
	}
	
	public int getIdUsuario(int i) {
		return user[i].getIdUsuario();
	}
	
	public String getNome(int i) {
		return user[i].getNome();
	}

	public Telefone getTelefone(int i) {
		return user[i].getTelefone();
	}

	public Pagamento getPagamento(int i) {
		return user[i].getPagamento();
	}
	
	public Endereco getEndereco(int i) {
		return user[i].getEndereco();
	}
	
	

}
