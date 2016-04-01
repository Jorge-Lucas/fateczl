package br.sceweb.servico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import org.apache.log4j.Logger;

public class FabricaDeConexoes {

	Logger logger = Logger.getLogger(FabricaDeConexoes.class);

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost/sceweb";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, "root", "aluno");
		} catch (SQLException | ClassNotFoundException e) {
			logger.info("SQLException na classe FabricaDeConexoes causa: " + e.getMessage());
			throw new RuntimeException(e);
		}

	}

}