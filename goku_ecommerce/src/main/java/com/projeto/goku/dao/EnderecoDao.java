package com.projeto.goku.dao;

import com.projeto.goku.beans.Endereco;

public interface EnderecoDao {
	
	public Endereco getEndereco(Endereco endereco);
	
	public void createEndereco(Endereco endereco);
	
	public void updateEndereco(Endereco endereco);

}
