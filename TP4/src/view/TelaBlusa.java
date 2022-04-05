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

public class TelaBlusa implements ActionListener, ListSelectionListener{
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastro;
	private JButton atualiza;
	private JButton busca;
	private JTextField nomeBusca;
	private static ControleDados dados;
	private JList<String> listaBlusaCadastradas;
	private String[] listaCodigos = new String[10];
	
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 1) {
			listaCodigos = new ControleBlusas(dados).getNome();
			listaBlusaCadastradas = new JList<String>(listaCodigos);
			janela = new JFrame("Blusas");
			titulo = new JLabel("Blusas Cadastradas");
			
			cadastro = new JButton("Cadastrar");
			atualiza = new JButton("Atualizar");
			busca = new JButton("Pesquisar");
			nomeBusca = new JTextField();

			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaBlusaCadastradas.setBounds(20, 50, 350, 120);
			listaBlusaCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaBlusaCadastradas.setVisibleRowCount(10);

			cadastro.setBounds(70, 190, 100, 30);
			atualiza.setBounds(200, 190, 100, 30);
			nomeBusca.setBounds(20, 240, 230, 30);
			busca.setBounds(270, 240, 100, 30);
			
			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaBlusaCadastradas);
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
			listaBlusaCadastradas.addListSelectionListener(this);
		}else {

			JOptionPane.showMessageDialog(null, "Opção inválida!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		//Cadastrar
		if (src == cadastro) 
			new DetalheBlusa().inserirEditar(1, dados, this, 0);
		
		//Atualizar
		if (src == atualiza) { 
			listaBlusaCadastradas.setListData(new ControleBlusas(dados).getNome());
			listaBlusaCadastradas.updateUI();
		}
		
		//buscar
		if (src == busca) { 
			String digitado = nomeBusca.getText();
			int i = 0;
			String[] nome = new String[1];
			boolean pesquisa = false;
			
			do {
				nome[0] = dados.getDados().getBlusas()[i].getNome();
				if(digitado.toUpperCase().equals(nome[0].toUpperCase())) {
					listaBlusaCadastradas.setListData(nome);
					listaBlusaCadastradas.updateUI();
					pesquisa = true;
				}
				i++;
			}while(i < dados.getQtdBlusas() && pesquisa == false);
			
			if(!pesquisa)
				mensagemErroBusca();
			
		}
		
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if (e.getValueIsAdjusting() && src == listaBlusaCadastradas) {
			new DetalheBlusa().inserirEditar(2, dados, this, listaBlusaCadastradas.getSelectedIndex());
		}
	}
	public void mensagemErroBusca() {
		JOptionPane.showMessageDialog(null,"Blusa não encontrada.\n " , null, 
				JOptionPane.ERROR_MESSAGE);
	}
}
