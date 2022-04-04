package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControleDados;


public class DetalheUsuario implements ActionListener {
	
	private JFrame janela;
	private JLabel labelID = new JLabel("ID: ");
	private JTextField valorID;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorTelefone;
	private JLabel labelPagamento = new JLabel("Pagamento: ");
	private JTextField valorPagamento;
	private JLabel labelEndereco = new JLabel("Endereço: ");
	private JTextField valorEndereco;
	
	
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	
	public void inserirEditar(int op, ControleDados d, TelaUsuario p, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;
		
		//Nome na aba
		if (op == 1)
			s = "Cadastro Usuário";
		if (op == 2)
			s = "Detalhe Usuário";
		
		janela = new JFrame(s);
		
		// Mostrar dados cadastrados
		if(op == 2) { 
			valorID = new JTextField(String.valueOf(dados.getUsuarios()[pos].getIdUsuario()), 200);
			valorNome = new JTextField(dados.getUsuarios()[pos].getNome(), 200);
			valorCPF = new JTextField(String.valueOf(dados.getUsuarios()[pos].getCpf()), 200);
			valorTelefone = new JTextField(String.valueOf(dados.getUsuarios()[pos].getTelefone()), 200);
			valorPagamento = new JTextField(String.valueOf(dados.getUsuarios()[pos].getPagamento()), 200);
			valorEndereco = new JTextField(String.valueOf(dados.getUsuarios()[pos].getEndereco()), 200);
			
			
		// Inserir dados
		}else { 
			valorID = new JTextField(200);
			valorNome = new JTextField(200);
			valorCPF = new JTextField(200);
			valorTelefone = new JTextField(200);
			valorPagamento = new JTextField(200);
			valorEndereco = new JTextField(200);
			
			botaoSalvar.setBounds(245, 300, 115, 30);
		}
		
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(130, 20, 230, 25); 
		labelID.setBounds(30, 50, 150, 25);
		valorID.setBounds(130, 50, 230, 25);
		labelCPF.setBounds(30, 110, 150, 25);
		valorCPF.setBounds(130, 110, 230, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorTelefone.setBounds(130, 140, 230, 25);
		labelPagamento.setBounds(30, 170, 150, 25);
		valorPagamento.setBounds(130, 170, 230, 25);
		labelEndereco.setBounds(30, 230, 150, 25);
		valorEndereco.setBounds(130, 230, 230, 25);	
		
		
		if(op == 2) {
			botaoSalvar.setBounds(100, 300, 115, 30);
			botaoExcluir.setBounds(240, 300, 115, 30);
			this.janela.add(botaoExcluir);
		}
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelID);
		this.janela.add(valorID);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelTelefone);
		this.janela.add(valorTelefone);
		this.janela.add(labelPagamento);
		this.janela.add(valorPagamento);
		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
	
		this.janela.add(botaoSalvar);
		
		
		this.janela.setLayout(null);
		
		this.janela.setSize(400, 400);
		janela.setLocationRelativeTo(null);
		this.janela.setVisible(true);
		
		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);		
	}

	// chama funções lá em controle de dados
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 1)
					novoDado[0] = Integer.toString(dados.getQtdBlusas());
				else
					novoDado[0] = Integer.toString(posicao);
				
				novoDado[1] = valorNome.getText();
				novoDado[2] = valorCPF.getText();
				novoDado[3] = valorTelefone.getText();
				novoDado[4] = valorPagamento.getText();
				novoDado[5] = valorEndereco.getText();
				
				
				res = dados.inserirEditarUsuarios(novoDado);
				
				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}
		if (src == botaoExcluir) {
			boolean res = false;
			if (opcao == 2) {
				res = dados.removerUsuario(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusao();
			}

		}
			
	}
	
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. CPF, Telefone, Pagamento e Endereço não contém apenas números",
				null, JOptionPane.ERROR_MESSAGE);
	}


	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n ", 
				null ,JOptionPane.ERROR_MESSAGE);
	}
}
