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

public class TelaProdutos implements ActionListener 
{
	private static JFrame janela = new JFrame("Controle Produtos");
	private static JLabel titulo = new JLabel("Produtos");
	private static JButton blusa = new JButton("Blusas");
	private static JButton biju = new JButton("Bijuteria");
	private static JButton calca = new JButton("Calça");
	private static ControleDados dados;
	
	
	
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 2) {
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(150, 10, 150, 30);
			blusa.setBounds(145, 70, 100, 30);
			biju.setBounds(145, 120, 100, 30);
			calca.setBounds(145, 170, 100, 30);
			
			janela.setLayout(null);

			janela.add(titulo);
			janela.add(blusa);
			janela.add(biju);
			janela.add(calca);
			
			janela.setSize(400, 300);
			janela.setLocationRelativeTo(null);
			janela.setVisible(true);
			
			blusa.addActionListener(this);
			calca.addActionListener(this);
			biju.addActionListener(this);
			
			
			
		}else {

			JOptionPane.showMessageDialog(null, "Opção inválida!", null, JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == blusa)
			new TelaBlusa().mostrarDados(dados, 1); 


		if (src == biju)
			new TelaBijuteria().mostrarDados(dados, 2); 

		if (src == calca)
			new TelaCalca().mostrarDados(dados, 3); 
 
	
	}
	
	
}
