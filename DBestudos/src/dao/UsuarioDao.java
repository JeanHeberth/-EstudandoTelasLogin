package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import domain.Usuario;
import factory.Conexao;

public class UsuarioDao {

	/* Método para salvar no DB */

	public void salvar(Usuario user) throws SQLException {

		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO USUARIO (email) VALUES (? ) ");

		Connection conexao = Conexao.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		// comando.setString(1, user.getNome());
		comando.setString(1, user.getEmail());
		// comando.setLong(3, user.getCpf());
		comando.executeUpdate();

	}

	/* Método para listar usuários no DB */

	public ArrayList<Usuario> listar() throws SQLException {

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT codigo, nome, email, cpf FOM usuario ORDER BY nome DESC");

		Connection conexao = Conexao.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		ResultSet resultado = comando.executeQuery();

		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		while (resultado.next()) {
			Usuario user = new Usuario();

			user.setCodigo(resultado.getLong("Codigo"));
			user.setNome(resultado.getString("Nome"));
			user.setEmail(resultado.getString("E-mail"));
			user.setCpf(resultado.getInt("CPF"));

			lista.add(user);

		}
		return lista;
	}

}
