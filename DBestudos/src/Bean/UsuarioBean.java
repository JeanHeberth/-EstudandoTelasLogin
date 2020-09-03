package Bean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.UsuarioDao;
import domain.Usuario;

@ManagedBean (name = "MBUsuario")
@ViewScoped
public class UsuarioBean {

	private Usuario usuario;

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void novo() throws SQLException {
		UsuarioDao userDao = new UsuarioDao();
		userDao.salvar(usuario);
	}

}
