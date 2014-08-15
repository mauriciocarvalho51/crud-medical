package kaempf.model;

public class Menu {

	public static final int OP_PACIENTES=1;
	public static final int OP_MEDICAMENTOS=2;
	public static final int OP_CONSULTAS=3;
	public static final int OP_SAIR=4;	
	
	public static final int OP_PACIENTE_CADASTRAR=1;
	public static final int OP_PACIENTE_BUSCAR=2;
	public static final int OP_PACIENTE_ATUALIZAR=3;
	public static final int OP_PACIENTE_EXCLUIR=4;
	public static final int OP_VOLTAR=5;
	
	
	
	public static String getOpcoes()
	{
		return(	"\n-- BEM VINDO Dr. GUSTAVO KAEMPF --\n"+
				"\n--------------------------------------\n" +
				"1- PACIENTES\n" +
				"2- MEDICAMENTOS\n" +
				"3- CONSULTAS\n" +
				"4- Sair" +
				"\n--------------------------------------");
	}
		
	public static String getOpcoesCrudPaciente()
	{
		return(	"\n-- CRUD PACIENTES --\n"+
				"\n--------------------------------------\n" +
				"1- Cadastrar paciente\n" +
				"2- Buscar paciente\n" +
				"3- Atualizar paciente\n" +
				"4- Excluir paciente\n" +
				"5- Voltar" +
				"\n--------------------------------------");
	}
	
	public static String getOpcoesCrudMedicamento()
	{
		return(	"\n--------------------------------------\n" +
				"1- Cadastrar medicamento\n" +
				"2- Buscar medicamento\n" +
				"3- Atualizar medicamento\n" +
				"4- Excluir medicamento\n" +
				"5- Voltar" +
				"\n--------------------------------------");
	}
	
	public static String getOpcoesCrudConsulta()
	{
		return(	"\n--------------------------------------\n" +
				"1- Criar nova consulta\n" +
				"2- Mostrar consulta\n" +
				"3- Atualizar consulta\n" +
				"4- Excluir consulta\n" +
				"5- Exibir Protuário\n" +
				"6- Voltar" +
				"\n--------------------------------------");
	}
	
}
