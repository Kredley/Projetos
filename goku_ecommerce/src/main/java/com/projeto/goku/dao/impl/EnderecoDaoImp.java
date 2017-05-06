package com.projeto.goku.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.projeto.goku.beans.Endereco;
import com.projeto.goku.dao.EnderecoDao;

@Repository("enderecoDao")
public class EnderecoDaoImp implements EnderecoDao {
	
	@Autowired
	JdbcTemplate template;  

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public Endereco getEndereco(Endereco endereco) {
		
		try {
			Endereco resultQuery = new Endereco();
			 String sql= "select * from endereco where cep=?";  
			 resultQuery = template.queryForObject(sql, new Object[]{endereco.getCep()},new BeanPropertyRowMapper<Endereco>(Endereco.class));
			 return resultQuery;
		} catch (EmptyResultDataAccessException  e) {
			return null;
		}
	}
	
	
	

	@Override
	public void createEndereco(Endereco endereco) {
		
	    String sql="insert into endereco(cep,endereco,estado,cidade) values('"+endereco.getCep()+"','"+endereco.getEndereco()+"','"+endereco.getEstado()+"','"+endereco.getCidade()+"')";  
	    template.update(sql);  	
	}
	

	@Override
	public void updateEndereco(Endereco endereco) {
		String sql="update endereco set endereco ='" +endereco.getEndereco() + "', estado ='" +endereco.getEstado()+ "', cidade ='" +endereco.getCidade()+
				"' where cep='"+endereco.getCep()+"'";  
	    template.update(sql); 
		
	}


}
