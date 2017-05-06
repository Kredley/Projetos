package com.projeto.goku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.goku.beans.Endereco;
import com.projeto.goku.beans.User;
import com.projeto.goku.service.EnderecoService;
import com.projeto.goku.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
@ComponentScan("com.projeto.goku")
public class MainController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	EnderecoService enderecoService;

	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Olá eu sou o Goku!");
	  model.setViewName("hello");
	  return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Tela de Administração - Goku Ecommerce");
	  model.setViewName("admin");
	  return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

	  ModelAndView model = new ModelAndView();
	  if (error != null) {
		model.addObject("error", "Usuário ou Senha Inválida!");
	  }

	  if (logout != null) {
		model.addObject("msg", "Você foi deslogado com Sucesso.");
	  }
	  model.setViewName("login");

	  return model;

	}
	
//	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.POST)
//	public ModelAndView cadastrarUsuario() {
//
//	  ModelAndView model = new ModelAndView();	  
//	  model.setViewName("cadastrarUsuario");
//	  return model;
//
//	}
	

	
	
	//Primeiro busca o usuario se encontrar ele atualiza caso contrário será criado
	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.POST)
	public ModelAndView cadastrarUsuario(@RequestParam(value = "usuario",required = false) String username,
			@RequestParam(value = "senha", required = false) String password){
		ModelAndView model = new ModelAndView();
		try {
			if(username != null && password !=null){
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				user.setEnabled((byte) 1);
				user.setRole("ROLE_ADMIN");
				User findUser = new User();
				findUser = userService.getUser(user);
				
				if(findUser != null){
					userService.updateUser(user);
					model.addObject("sucesso", "Usuário atualizado com sucesso");
				}else{
					userService.createUser(user);
					model.addObject("sucesso", "Usuário inserido com sucesso");
				}  	  
			}
			
			
			model.setViewName("cadastrarUsuario");
			return model;
			
		} catch (Exception e) {
			model.addObject("sucesso", "Erro: Por favor procure o suporte para resolver o problema");
			model.setViewName("cadastrarUsuario");
			return model;
		}

		

	}

	
	@RequestMapping(value = "/buscarEndereco", method = RequestMethod.POST)
	public ModelAndView buscarEndereco(
			@RequestParam(value = "cep", required = false) String cep,
			@RequestParam(value = "buscaCep", required = false) String buscaCep,
			@RequestParam(value = "endereco", required = false) String endereco,
			@RequestParam(value = "estado", required = false) String estado,
			@RequestParam(value = "cidade", required = false) String cidade) {
	
		ModelAndView model = new ModelAndView();
		try {
			//Quando a tela é acessada no inicio
			if(buscaCep ==null && cep ==null){
				model.setViewName("buscarEndereco");
				return model;
			}else{
				
				
				Endereco enderecoObj = new Endereco();
				
				//BUSCA CEP PARA ENCONTRAR O ENDERECO
				if(buscaCep !=null){
					enderecoObj.setCep(buscaCep);
					//faz a busca
					Endereco findEndereco = enderecoService.getEndereco(enderecoObj);
					
					if(findEndereco != null){		
						model.addObject("cep", findEndereco.getCep());
						model.addObject("endereco", findEndereco.getEndereco());
						model.addObject("estado", findEndereco.getEstado());
						model.addObject("cidade", findEndereco.getCidade());
						model.addObject("sucesso", "Endereço encontrado!");
					}else{
						model.addObject("sucesso", "Endereço não cadastrado!");
					}
					model.setViewName("buscarEndereco");
					return model;
				}else{
					//OBJETIVO DE ENCONTRAR OU ATUALIZAR O CEP
					enderecoObj.setCep(cep);
					enderecoObj.setCidade(cidade);
					enderecoObj.setEndereco(endereco);
					enderecoObj.setEstado(estado);
					//faz a busca
					Endereco findEndereco = enderecoService.getEndereco(enderecoObj);
					
					if(findEndereco != null){
						//atualiza
						enderecoService.updateEndereco(enderecoObj);
						model.addObject("sucesso", "Endereço atualizado com sucesso");
					}else{
						//cadastra
						enderecoService.createEndereco(enderecoObj);
						model.addObject("sucesso", "Endereço inserido com sucesso");
					}
					
					model.setViewName("buscarEndereco");
					return model;
				}
				
			}
		} catch (Exception e) {
			model.addObject("sucesso", "Erro: Por favor procure o suporte para resolver o problema");
			model.setViewName("buscarEndereco");
			return model;
		}
	}
	
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

	  ModelAndView model = new ModelAndView();

	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		UserDetails userDetail = (UserDetails) auth.getPrincipal();
		model.addObject("username", userDetail.getUsername());
	  }

	  model.setViewName("403");
	  return model;

	}

}
