package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import domain.Usuario;
import factory.Conexao;

public class UsuarioDao {

	
	/* Método para salvar no DB */
	
	public void salvar(Usuario user) throws SQLException {
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO USUARIO (email) VALUES (? ) ");
		
		Connection conexao = Conexao.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		//comando.setString(1, user.getNome());
		comando.setString(1, user.getEmail());
		//comando.setLong(3,  user.getCpf());
		comando.executeUpdate();
				
	}

}
