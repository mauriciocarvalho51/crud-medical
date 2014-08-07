package kaempf.pojo;

/**
*
* mauricio.victor.carvalho@gmail.com
*
*/
public class Paciente {	
	
	private int idpaciente;
	private String nome;
	private int idade;
	private String descri;
	
	
	/**
	*
	* @param idpaciente
	* @param nome
	* @param idade
	* @param descri
	*/
	public Paciente(int idpaciente, String nome, int idade, String descri) {
		this.idpaciente=idpaciente;
		this.nome=nome;
		this.idade=idade;
		this.descri=descri;
	}
	
	/**
	*
	* @param idpaciente
	* @param nome
	*/
	public Paciente(int idpaciente, String nome) {
		this.idpaciente=idpaciente;
		this.nome=nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDescri() {
		return descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	public int getIdpaciente() {
		return idpaciente;
	}

	@Override
	public String toString() {
		return "Paciente [idpaciente=" + idpaciente + ", nome=" + nome
				+ ", idade=" + idade + ", descri=" + descri + "]";
	}
	

}
