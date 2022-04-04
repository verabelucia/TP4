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

public class TelaBijuteria implements ActionListener, ListSelectionListener{
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastro;
	private JButton atualiza;
	private JButton busca;
	private JTextField nomeBusca;
	private static ControleDados dados;
	private JList<String> listaBijusCadastradas;
	private String[] listaCodigos = new String[10];
	
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 2) {
			listaCodigos = new ControleBijus(dados).getNome();
			listaBijusCadastradas = new JList<String>(listaCodigos);
			janela = new JFrame("Bijuterias");
			titulo = new JLabel("Bijuterias Cadastradas");
			
			cadastro = new JButton("Cadastrar");
			atualiza = new JButton("Atualizar");
			busca = new JButton("Pesquisar");
			nomeBusca = new JTextField();

			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaBijusCadastradas.setBounds(20, 50, 350, 120);
			listaBijusCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaBijusCadastradas.setVisibleRowCount(10);

			cadastro.setBounds(70, 190, 100, 30);
			atualiza.setBounds(200, 190, 100, 30);
			nomeBusca.setBounds(20, 240, 230, 30);
			busca.setBounds(270, 240, 100, 30);
			
			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaBijusCadastradas);
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
			listaBijusCadastradas.addListSelectionListener(this);
		}else {

			JOptionPane.showMessageDialog(null, "Opção inválida!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		//Cadastrar
		if (src == cadastro) 
			new DetalheBijuteria().inserirEditar(1, dados, this, 0);
		
		//Atualizar
		if (src == atualiza) { 
			listaBijusCadastradas.setListData(new ControleBijus(dados).getNome());
			listaBijusCadastradas.updateUI();
		}
		
		//buscar
		if (src == busca) { 
			String digitado = nomeBusca.getText();
			int i = 0;
			String[] nome = new String[1];
			boolean pesquisa = false;
			
			do {
				nome[0] = dados.getDados().getBijus()[i].getNome();
				if(digitado.toUpperCase().equals(nome[0].toUpperCase())) {
					listaBijusCadastradas.setListData(nome);
					listaBijusCadastradas.updateUI();
					pesquisa = true;
				}
				i++;
			}while(i < dados.getQtdBijus() && pesquisa == false);
			
			if(!pesquisa)
				mensagemErroBusca();
		}
	}
	

	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if (e.getValueIsAdjusting() && src == listaBijusCadastradas) {
			new DetalheBijuteria().inserirEditar(2, dados, this, listaBijusCadastradas.getSelectedIndex());
		}
	}
	public void mensagemErroBusca() {
		JOptionPane.showMessageDialog(null,"Bijuteria não encontrada.\n " , null, 
				JOptionPane.ERROR_MESSAGE);
	}
}
