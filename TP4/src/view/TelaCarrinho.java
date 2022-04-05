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

public class TelaCarrinho //implements ActionListener, ListSelectionListener 
{
	
	private JFrame janela;
	private JLabel titulo;
	private JButton atualizar;
	private JButton compra;
	private static ControleDados dados;
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 3) {

			janela = new JFrame("Carrinho");
			titulo = new JLabel("Itens carrinho");
			
			atualizar = new JButton("Atualizar");
			compra = new JButton("Comprar");

			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);

			atualizar.setBounds(70, 190, 100, 30);
			compra.setBounds(200, 190, 100, 30);
			
			janela.setLayout(null);

			janela.add(titulo);
			janela.add(atualizar);
			janela.add(compra);
			
			janela.setSize(400, 320);
			janela.setLocationRelativeTo(null);
			janela.setVisible(true);
			
		
		}else {

			JOptionPane.showMessageDialog(null, "Opção inválida!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	
}
