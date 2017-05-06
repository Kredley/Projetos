package br.com.arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFile {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("C:/Users/Kredley/Desktop/Configurações do Roteador.txt");
		
		try {
			
			String texto = "Escrevendo aqui no arquivo";
			byte[] textoEmBytes = texto.getBytes();
			Files.write(caminho, textoEmBytes);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
