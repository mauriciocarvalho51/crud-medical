package kaempf.model;

/**
*
* mauricio.victor.carvalho@gmail.com
*
*/
public class InterfaceUsuario {
	
	public void executar() {
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoes());
			opcao = Console.scanInt("Digite sua op��o:");
			switch(opcao)
			{
			case Menu.OP_PACIENTES:
				crudPaciente();
				break;
			case Menu.OP_MEDICAMENTOS:
				//calculaDiagonalSecundaria();
				break;
			case Menu.OP_CONSULTAS:
				//numerosPrimos();
				break;
			case Menu.OP_SAIR:
				System.out.println("\n[Aplica��o finalizada!!!]");
				break;
			default: 
				System.out.println("\nOp��o inv�lida..");				
			}
		} while( opcao != Menu.OP_SAIR );
	
	}
	
	public void crudPaciente()
	{
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoesCrudPaciente());
			opcao = Console.scanInt("Digite sua op��o:");
			switch(opcao)
			{
			case Menu.OP_PACIENTE_CADASTRAR:
				//
				break;
			case Menu.OP_PACIENTE_BUSCAR:
				//
				break;
			case Menu.OP_PACIENTE_ATUALIZAR:
				//
				break;
			case Menu.OP_PACIENTE_EXCLUIR:
				//
				break;
			case Menu.OP_VOLTAR:
				executar();
				break;
			default: 
				System.out.println("Op��o inv�lida..");				
			}
		} while(opcao != Menu.OP_VOLTAR);
	}
}
