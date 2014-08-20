package kaempf.test;

import kaempf.pojo.Paciente;

public class Teste {

	//http://javafree.uol.com.br/artigo/874102/Acessando-dados-com-Java-1%C2%BA-parte-Simples-Dao.html
	
	public static void main(String[] args) {
		
		Paciente paciente = new Paciente(0001, "Gedeão Kaipper", 72, "visão");
		DaoPaciente daopacinete = new DaoPaciente();
		
		daopacinete.insere(paciente);
		/*
		Vector<Pessoa> resultado = daoPessoa.buscar("12345678X");  
		  
	      for (Iterator<Pessoa> iterator = resultado.iterator(); iterator  
	            .hasNext();) {  
	         Pessoa p = iterator.next();  
	         System.out.println("Pessoa Encontrada: " + p.getNome());  
	      }  
	      pessoa.setNome("José da Silva Sauro");  
	  
	      daoPessoa.atualizar(pessoa);  
	  
	      resultado = daoPessoa.buscar("12345678X");  
	  
	      for (Iterator<Pessoa> iterator = resultado.iterator(); iterator  
	            .hasNext();) {  
	         Pessoa p = iterator.next();  
	         System.out.println("Pessoa Encontrada: " + p.getNome());  
	      }  
	  
	      daoPessoa.apagar("12345678X");  
	  
	      resultado = daoPessoa.buscar("12345678X");  
	  
	      if (resultado.size() == 0) {  
	         System.out.println("Pessoa foi apagada com sucesso");  
	      } else {  
	         System.out.println("A pessoa permanece no banco de dados");  
	      } 

*/

	}

}
