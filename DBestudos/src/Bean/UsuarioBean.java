package Bean;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.UsuarioDao;
import domain.Usuario;

@ManagedBean(name = "MBUsuario")
@ViewScoped
public class UsuarioBean {

	private Usuario usuario;
	private ArrayList<Usuario> itens;

	public ArrayList<Usuario> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Usuario> itens) {
		this.itens = itens;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public void preprarListagem() {
		try {
			UsuarioDao userDao = new UsuarioDao();
			itens = userDao.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void novo() throws SQLException {
		UsuarioDao userDao = new UsuarioDao();
		userDao.salvar(usuario);
	}

}
