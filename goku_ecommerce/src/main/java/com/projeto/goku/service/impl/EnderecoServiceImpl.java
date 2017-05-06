package com.projeto.goku.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.goku.beans.Endereco;
import com.projeto.goku.dao.EnderecoDao;
import com.projeto.goku.service.EnderecoService;


@Service
public class EnderecoServiceImpl implements EnderecoService {
	
	@Autowired
	EnderecoDao enderecoDao;

	@Override
	public Endereco getEndereco(Endereco endereco) {
		return enderecoDao.getEndereco(endereco);
		
	}

	@Override
	public void createEndereco(Endereco endereco) {
		
		enderecoDao.createEndereco(endereco);
		
		
	}

	@Override
	public void updateEndereco(Endereco endereco) {
		
		enderecoDao.updateEndereco(endereco);
		
	}

}
