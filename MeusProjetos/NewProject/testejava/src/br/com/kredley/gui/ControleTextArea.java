package br.com.kredley.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class ControleTextArea extends JFrame implements ActionListener{
	

	public ControleTextArea(){
		super("Editor de Textos");
		
		JTextArea texto = new JTextArea();
		JScrollPane sroll = new JScrollPane(texto);
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		
		JButton botao = new JButton("Abrir Arquivo");
		botao.setFont(new Font("serif", Font.PLAIN, 26));
		botao.addActionListener(this);
		
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, sroll);
		c.add(BorderLayout.SOUTH, botao);
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ControleTextArea();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(this);
		File file = c.getSelectedFile();
		try {
			//JAVA 7
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(this, "Nao conseguimos carregar seu arquivo,Lamento");
			// TODO: handle exception
		}
		
	}


}
