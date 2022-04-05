package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.*;

public class TelaUsuario implements ActionListener, ListSelectionListener{
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastro;
	private JButton atualiza;
	private JButton busca;
	private JTextField nomeBusca;
	private static ControleDados dados;
	private JList<String> listaUsuariosCadastrados;
	private String[] listaCodigos = new String[10];
	
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 1) {
			listaCodigos = new ControleUsuarios(dados).getNome();
			listaUsuariosCadastrados = new JList<String>(listaCodigos);
			janela = new JFrame("Usuários");
			titulo = new JLabel("Usuários Cadastrados");
			
			cadastro = new JButton("Cadastrar");
			atualiza = new JButton("Atualizar");
			busca = new JButton("Pesquisar");
			nomeBusca = new JTextField();

			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaUsuariosCadastrados.setBounds(20, 50, 350, 120);
			listaUsuariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaUsuariosCadastrados.setVisibleRowCount(10);

			cadastro.setBounds(70, 190, 100, 30);
			atualiza.setBounds(200, 190, 100, 30);
			nomeBusca.setBounds(20, 240, 230, 30);
			busca.setBounds(270, 240, 100, 30);
			
			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaUsuariosCadastrados);
			janela.add(cadastro);
			janela.add(atualiza);
			janela.add(nomeBusca);
			janela.add(busca);
			
			janela.setSize(400, 320);
			janela.setLocationRelativeTo(null);
			janela.setVisible(true);
			
			cadastro.addActionListener(this);
			atualiza.addActionListener(this);
			busca.addActionListener(this);
			listaUsuariosCadastrados.addListSelectionListener(this);
		}else {

			JOptionPane.showMessageDialog(null, "Opção inválida!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		//Cadastrar
		if (src == cadastro) 
			new DetalheUsuario().inserirEditar(1, dados, this, 0);
		
		//Atualizar
		if (src == atualiza) { 
			listaUsuariosCadastrados.setListData(new ControleUsuarios(dados).getNome());
			listaUsuariosCadastrados.updateUI();
		}
		
		//buscar
		if (src == busca) { 
			String digitado = nomeBusca.getText();
			int i = 0;
			String[] nome = new String[1];
			boolean pesquisa = false;
			
			do {
				nome[0] = dados.getDados().getUsuarios()[i].getNome();
				if(digitado.toUpperCase().equals(nome[0].toUpperCase())) {
					listaUsuariosCadastrados.setListData(nome);
					listaUsuariosCadastrados.updateUI();
					pesquisa = true;
				}
				i++;
			}while(i < dados.getQtdUsuarios() && pesquisa == false);
			
			if(!pesquisa)
				mensagemErroBusca();
		}
	}
	

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if (e.getValueIsAdjusting() && src == listaUsuariosCadastrados) {
			new DetalheUsuario().inserirEditar(2, dados, this, listaUsuariosCadastrados.getSelectedIndex());
		}
	}
	public void mensagemErroBusca() {
		JOptionPane.showMessageDialog(null,"Calça não encontrada.\n " , null, 
				JOptionPane.ERROR_MESSAGE);
	}
}
