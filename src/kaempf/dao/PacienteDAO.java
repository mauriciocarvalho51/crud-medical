package kaempf.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import kaempf.pojo.Paciente;

/**
*
* mauricio.victor.carvalho@gmail.com
*
*/
public class PacienteDAO {
	
	/**
	 * método que cadastra novo pacinete no banco.
	 * @param paciente
	 */
	public void insertPaciente(Paciente paciente) {
		
		String cmd = "insert into paciente(nome, idade) values (?, ?)";
		Connection db = null;
		PreparedStatement st = null;
		
		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("kaempf.properties"));
			String url = props.getProperty("url");
			db = DriverManager.getConnection(url, props);
			st = db.prepareStatement(cmd);
			st.setString(1, paciente.getNome());
			st.setInt(2, paciente.getIdade());
			int r = st.executeUpdate();
			
			if (r != 1) {
				throw new RuntimeException("Erro ao inserir paciente!");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	//
	
}
