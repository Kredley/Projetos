package br.com.kredley.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener{
	
	JComboBox combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/foto.jpg")),
			new ImageIcon(getClass().getResource("fotos/foto1.jpg")),
			new ImageIcon(getClass().getResource("fotos/foto2.jpg")),
			new ImageIcon(getClass().getResource("fotos/teste.jpg"))
	};
	
	
	public ControleCombo(){
		super("Album de Fotos");
		Container c = getContentPane();
		combo = new JComboBox();
		combo.setFont(new Font("serif", Font.PLAIN, 26));
		combo.addItem("Kredley1");
		combo.addItem("Kredley2");
		combo.addItem("Kredley3");
		combo.addItem("Kredley4");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		
		
		
	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,530);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ControleCombo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			label.setIcon(imagens[combo.getSelectedIndex()]);
			
		}
		
	}

}
