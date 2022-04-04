package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;


public class TelaMenu implements ActionListener {
	private static JFrame janela = new JFrame("Controle Brechó");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton blusa = new JButton("Blusas");
	private static JButton biju = new JButton("Bijuteria");
	private static JButton calca = new JButton("Calça");
	private static JButton usuario = new JButton("Usuário");
	private static JButton carrinho = new JButton("Carrinho");
	private static JButton compra = new JButton("Compra");
	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		blusa.setBounds(70, 70, 100, 30);
		biju.setBounds(70, 120, 100, 30);
		calca.setBounds(70, 170, 100, 30);
		usuario.setBounds(195, 70, 100, 30);
		carrinho.setBounds(195, 120, 100, 30);
		compra.setBounds(195, 170, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(blusa);
		janela.add(biju);
		janela.add(calca);
		janela.add(usuario);
		janela.add(carrinho);
		janela.add(compra);
		
		janela.setSize(400, 300);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		blusa.addActionListener(menu);
		biju.addActionListener(menu);
		calca.addActionListener(menu);
		usuario.addActionListener(menu);
		carrinho.addActionListener(menu);
		compra.addActionListener(menu);
	}
	

	//abre as janelas com mais info
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == blusa)
			new TelaBlusa().mostrarDados(dados, 1); 

//		PRECISA CONSTRUIR AS TELAS E DETALHES DELAS
		if (src == biju)
			new TelaBijuteria().mostrarDados(dados, 2); 

		if (src == calca)
			new TelaCalca().mostrarDados(dados, 3); 

		if (src == usuario)
			new TelaUsuario().mostrarDados(dados, 4); 

		if (src == carrinho)
			new TelaCarrinho().mostrarDados(dados, 5); 
		
		if (src == compra)
			new TelaCompra().mostrarDados(dados, 6); 
		
	
	}
}
