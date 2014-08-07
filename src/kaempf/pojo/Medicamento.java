package kaempf.pojo;

/**
*
* mauricio.victor.carvalho@gmail.com
*
*/
public class Medicamento {
	
	private int idmedicamento;
	private String nome;
	private int dose;
	private int dias;
	
	
	/**
	*
	* @param idmedicamento
	* @param nome
	* @param dose
	* @param dias
	*/
	public Medicamento(int idmedicamento, String nome, int dose, int dias) {
		this.idmedicamento=idmedicamento;
		this.nome=nome;
		this.dose=dose;
		this.dias=dias;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getDose() {
		return dose;
	}


	public void setDose(int dose) {
		this.dose = dose;
	}


	public int getDias() {
		return dias;
	}


	public void setDias(int dias) {
		this.dias = dias;
	}


	public int getIdmedicamento() {
		return idmedicamento;
	}


	@Override
	public String toString() {
		return "Medicamento [idmedicamento=" + idmedicamento + ", nome=" + nome
				+ ", dose=" + dose + ", dias=" + dias + "]";
	}
	

}
