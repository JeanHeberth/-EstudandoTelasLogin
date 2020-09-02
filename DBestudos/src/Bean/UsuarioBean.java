package Bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;	

@ManagedBean(name = "MBusuario")
@ViewScoped
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String usuario;
	private String senha;
	private String resultado;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public void logar() {

		this.resultado = "Não logado!";
		if (usuario.equalsIgnoreCase("Jean") && (senha.equals("123456"))) {
			this.resultado = " Logado! ";
		}
	}

}
