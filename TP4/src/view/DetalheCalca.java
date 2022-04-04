package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControleDados;


public class DetalheCalca implements ActionListener {
	
	private JFrame janela;
	private JLabel labelID = new JLabel("ID: ");
	private JTextField valorID;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelPreco = new JLabel("Preço: ");
	private JTextField valorPreco;
	private JLabel labelDepartamento = new JLabel("Departamento: ");
	private JTextField valorDepartamento;
	private JLabel labelDescricao = new JLabel("Descrição: ");
	private JTextField valorDescricao;
	private JLabel labelCor = new JLabel("Cor: ");
	private JTextField valorCor;
	private JLabel labelTamanho = new JLabel("Tamanho: ");
	private JTextField valorTamanho;
	private JLabel labelModelo = new JLabel("Modelo Calça: ");
	private JTextField valorModelo;
	
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	
	public void inserirEditar(int op, ControleDados d, TelaCalca p, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;
		
		//Nome na aba
		if (op == 1)
			s = "Cadastro Calça";
		if (op == 2)
			s = "Detalhe Calça";
		
		janela = new JFrame(s);
		
		// Mostrar dados cadastrados
		if(op == 2) { 
			valorID = new JTextField(String.valueOf(dados.getCalcas()[pos].getIdProduto()), 200);
			valorNome = new JTextField(dados.getCalcas()[pos].getNome(), 200);
			valorMarca = new JTextField(dados.getCalcas()[pos].getMarca(), 200);
			valorPreco = new JTextField(String.valueOf(dados.getCalcas()[pos].getPreco()), 200);
			valorDepartamento = new JTextField(dados.getCalcas()[pos].getDepartamento(), 200);
			valorDescricao = new JTextField(dados.getCalcas()[pos].getDescricao(), 200);
			valorCor = new JTextField(dados.getCalcas()[pos].getCor(), 200);
			valorTamanho = new JTextField(String.valueOf(dados.getCalcas()[pos].getTamanho()), 200);
			valorModelo = new JTextField(dados.getCalcas()[pos].getModeloCalca(), 200);
			
			
		// Inserir dados
		}else { 
			valorID = new JTextField(200);
			valorNome = new JTextField(200);
			valorMarca = new JTextField(200);
			valorPreco = new JTextField(200);
			valorDepartamento = new JTextField(200);
			valorDescricao = new JTextField(200);
			valorCor = new JTextField(200);
			valorTamanho = new JTextField(200);
			valorModelo = new JTextField(200);
			
			botaoSalvar.setBounds(245, 300, 115, 30);
		}
		
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(130, 20, 230, 25); 
		labelID.setBounds(30, 50, 150, 25);
		valorID.setBounds(130, 50, 230, 25);
		labelMarca.setBounds(30, 110, 150, 25);
		valorMarca.setBounds(130, 110, 230, 25);
		labelPreco.setBounds(30, 140, 150, 25);
		valorPreco.setBounds(130, 140, 230, 25);
		labelDepartamento.setBounds(30, 170, 150, 25);
		valorDepartamento.setBounds(130, 170, 230, 25);
		labelDescricao.setBounds(30, 230, 150, 25);
		valorDescricao.setBounds(130, 230, 230, 25);
		labelCor.setBounds(30, 230, 150, 25);
		valorCor.setBounds(130, 230, 230, 25);
		labelTamanho.setBounds(30, 80, 150, 25);
		valorTamanho.setBounds(130, 80, 230, 25); 		
		labelModelo.setBounds(30, 200, 150, 25);
		valorModelo.setBounds(130, 200, 230, 25);	
		
		
		if(op == 2) {
			botaoSalvar.setBounds(100, 300, 115, 30);
			botaoExcluir.setBounds(240, 300, 115, 30);
			this.janela.add(botaoExcluir);
		}
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelID);
		this.janela.add(valorID);
		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
		this.janela.add(labelDepartamento);
		this.janela.add(valorDepartamento);
		this.janela.add(labelDescricao);
		this.janela.add(valorDescricao);
		this.janela.add(labelCor);
		this.janela.add(valorCor);
		this.janela.add(labelTamanho);
		this.janela.add(valorTamanho);
		this.janela.add(labelModelo);
		this.janela.add(valorModelo);
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
				novoDado[2] = valorMarca.getText();
				novoDado[3] = valorPreco.getText();
				novoDado[4] = valorDepartamento.getText();
				novoDado[5] = valorDescricao.getText();
				novoDado[6] = valorCor.getText();
				novoDado[7] = valorTamanho.getText();
				novoDado[8] = valorModelo.getText();
				
				res = dados.inserirEditarCalcas(novoDado);
				
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
				res = dados.removerCalca(posicao);
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
						+ "2. Tamanho ou preço não contém apenas números",
				null, JOptionPane.ERROR_MESSAGE);
	}


	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n ", 
				null ,JOptionPane.ERROR_MESSAGE);
	}
}
