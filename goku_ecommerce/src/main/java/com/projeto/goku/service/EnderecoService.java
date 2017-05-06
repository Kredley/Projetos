package com.projeto.goku.service;

import com.projeto.goku.beans.Endereco;

public interface EnderecoService {
	
	public Endereco getEndereco(Endereco user);
	
	public void createEndereco(Endereco user);
	
	public void updateEndereco(Endereco user);

}
