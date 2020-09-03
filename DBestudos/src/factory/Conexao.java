package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static final String URL = "jdbc:mysql://localhost:3306/estudodb?useTimezone=true&serverTimezone=UTC";

	public static Connection conectar() throws SQLException {

		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;

	}

	public static void main(String[] args) {
		try {
			Connection conexao = Conexao.conectar();
			System.out.println("Conexão realizado com sucesso!");
		} catch (Exception e) {
			System.err.println("Falha ao conectar com o banco!");
		}
	}
}
