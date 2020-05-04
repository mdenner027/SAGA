package br.edu.ufersa.saga.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufersa.saga.modelo.Usuario;
import br.edu.ufersa.saga.repository.UsuarioRepository;

@Controller
public class LoginController {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping(value = "/")
	public String telaInicial() {
		return "redirect:efetuar-login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String efetuarLogin(Usuario usuario, HttpSession session) {
		if (autenticarUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "redirect:dashboard";
		} else {
			return "login-erro";
		}
	}

	@RequestMapping(value = "efetuar-login")
	public String inicio() {
		return "login";
	}

	@RequestMapping(value = "efetuar-logout")
	public String efetuaLogout(Usuario usuario, HttpSession session) {
		session.invalidate();
		return "redirect:efetuar-login";
	}
	
	private boolean autenticarUsuario(Usuario user) {
		user = usuarioRepository.findByLoginUsuarioAndSenhaUsuario(user.getLoginUsuario(), user.getSenhaUsuario());
		if(user == null) {
			return false;
		}else {
			return true;
		}
	}
}
