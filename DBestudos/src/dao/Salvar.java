package dao;

import domain.Usuario;

public class Salvar {
	
	
		public static void main(String[] args) {
			
			
			Usuario usuario = new Usuario();
			
			
			usuario.setNome("Jaka");
			usuario.setEmail("jean@gmail.com");
			usuario.setCpf(1234568910);
			
			UsuarioDao userDao = new UsuarioDao();
			
			try {
				userDao.salvar(usuario);
				System.out.println("Salvo com sucesso!");
			} catch (Exception e) {
				System.out.println("Erro ao salvar!");
			}
			
			
			
			
			
			
			
		}

}
