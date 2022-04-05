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

public class TelaCompra //implements ActionListener, ListSelectionListener 
{
	
	private JFrame janela;
	private JLabel titulo;
	private JButton atualiza;
	//private JButton compra;
	private JButton busca;
	private JTextField numeroBusca;
	private static ControleDados dados;
//	private JList<String> listaBlusaCadastradas;
//	private String[] listaCodigos = new String[10];
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 4) {
			//listaCodigos = new ControleCarrinho(dados).getNome();
			//listaBlusaCadastradas = new JList<String>(listaCodigos);
			janela = new JFrame("Compras");
			titulo = new JLabel("Consultar compras");
			
			numeroBusca = new JTextField();
			busca = new JButton("Pesquisar");
			atualiza = new JButton("Atualizar");
			//compra = new JButton("Comprar");

			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
		
			//listaBlusaCadastradas.setBounds(20, 50, 350, 120);
			//listaBlusaCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			//listaBlusaCadastradas.setVisibleRowCount(10);

			numeroBusca.setBounds(20, 240, 230, 30);
			busca.setBounds(270, 240, 100, 30);
			atualiza.setBounds(150, 190, 100, 30);
			
			
			janela.setLayout(null);

			janela.add(titulo);
			//janela.add(listaBlusaCadastradas);
			janela.add(numeroBusca);
			janela.add(busca);
			janela.add(atualiza);
			//janela.add(nomeBusca);
			//janela.add(busca);
			
			janela.setSize(400, 320);
			janela.setLocationRelativeTo(null);
			janela.setVisible(true);
			
			//edita.addActionListener(this);
			//compra.addActionListener(this);
			//busca.addActionListener(this);
			//listaBlusaCadastradas.addListSelectionListener(this);
		}else {

			JOptionPane.showMessageDialog(null, "Opção inválida!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	
}