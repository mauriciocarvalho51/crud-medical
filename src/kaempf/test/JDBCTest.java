package kaempf.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTest {

	public static void main(String[] args) throws SQLException,	FileNotFoundException, IOException {
			
		Properties props = new Properties();
		props.load(new FileInputStream("kaempf.properties"));
		String url = props.getProperty("url");
		Connection db = DriverManager.getConnection(url, props);
		System.out.println("Conectado!");
	}

}
