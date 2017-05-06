package br.com.arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class ReadFile {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("C:/Users/Kredley/Desktop/Configurações do Roteador.txt");
		
		try {
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			JOptionPane.showConfirmDialog(null, leitura);
			System.out.println(leitura);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
