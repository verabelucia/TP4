package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;


public class TelaMenu implements ActionListener {
	private static JFrame janela = new JFrame("Controle Brech�");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton usuario = new JButton("Usu�rios");
	private static JButton carrinho = new JButton("Carrinho");
	private static JButton compra = new JButton("Compra");
	private static JButton produtos = new JButton("Produtos");
	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(125, 20, 150, 30);
		usuario.setBounds(145, 70, 100, 30);
		produtos.setBounds(145, 110, 100, 30);
		carrinho.setBounds(80, 170, 100, 30);
		compra.setBounds(200, 170, 100, 30);
		
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(usuario);
		janela.add(carrinho);
		janela.add(produtos);
		janela.add(compra);
		
		
		janela.setSize(400, 300);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		usuario.addActionListener(menu);
		carrinho.addActionListener(menu);
		produtos.addActionListener(menu);
		compra.addActionListener(menu);
	}
	

	//abre as janelas com mais info
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == usuario)
			new TelaUsuario().mostrarDados(dados, 1); 
		
		if (src == produtos)
			new TelaProdutos().mostrarDados(dados, 2); 

		if (src == carrinho)
			new TelaCarrinho().mostrarDados(dados, 3); 
	
		
		if (src == compra)
			new TelaCompra().mostrarDados(dados, 4); 
		
	
	}
}
