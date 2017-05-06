package br.com.restful.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.restful.factory.ConnectionFactory;
import br.com.restful.model.Cliente;

/**
 * Classe responsável por conter métodos de consulta, inserção, alteração e remoção
 * @author Kredley
 *
 */
public class ClienteDAO extends ConnectionFactory{
	
	private static ClienteDAO instance;
	
	/**
	 * Método responsávle por criar a instancia da classe Cliente
	 * @return
	 */
	public static ClienteDAO getInstance(){
		if(instance == null){
			instance = new ClienteDAO();
		}
		return instance;
		
	}
	
	
	/**
	 *  ArrayList<Clente> clientes
	 * @return
	 */
	public ArrayList<Cliente> listarTodos(){
		
		Connection conexao = null;
		PreparedStatement pstmt = null;
		conexao = criarConexao();
		ResultSet rs = null;
		
		ArrayList<Cliente> clientes = null;
		clientes = new ArrayList<>();
		
		
		
		try {
			pstmt = conexao.prepareStatement("select * from cliente order by nome");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Cliente cliente = new Cliente();
				
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEndereco(rs.getString("endereco"));
				
				clientes.add(cliente);
			}
		} catch (Exception e) {
			System.out.println("Erro ao listar todos os Clientes");
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		
		return clientes;
	}

	
	/**
	 *  ArrayList<Clente> clientes
	 * @return
	 */
	public ArrayList<Cliente> buscarClienteByNome(Cliente cliente){
		
		Connection conexao = null;
		PreparedStatement pstmt = null;
		conexao = criarConexao();
		ResultSet rs = null;
		
		ArrayList<Cliente> clientes = null;
		clientes = new ArrayList<>();
		
		
		
		try {
			pstmt = conexao.prepareStatement("select * from cliente where nome = '" + cliente.getNome() + "' order by nome");
			rs = pstmt.executeQuery();
			
			
			while(rs.next()){
				Cliente retornoCliente = new Cliente();
				
				retornoCliente.setId(rs.getInt("id"));
				retornoCliente.setNome(rs.getString("nome"));
				retornoCliente.setCpf(rs.getString("cpf"));
				retornoCliente.setEndereco(rs.getString("endereco"));
				
				clientes.add(retornoCliente);
			}
				
				
			
		} catch (Exception e) {
			System.out.println("Erro ao listar todos os Clientes");
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		
		return clientes;
	}

}
