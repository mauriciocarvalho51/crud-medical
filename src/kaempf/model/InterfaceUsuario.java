package kaempf.model;

import java.util.InputMismatchException;

/**
*
* mauricio.victor.carvalho@gmail.com
*
*/
public class InterfaceUsuario {
	
	public void executar() {
		int opcao = 0;
		do{
			
			try {
				System.out.println(Menu.getOpcoes());
				opcao = Console.scanInt("Digite sua opção:");
				switch(opcao)
				{
				case Menu.OP_PACIENTES:
					crudPaciente();
					break;
				case Menu.OP_MEDICAMENTOS:
					crudMedicamento();
					break;
				case Menu.OP_CONSULTAS:
					crudConsulta();
					break;
				case Menu.OP_SAIR:
					System.out.println("\n[Aplicação finalizada!!!]");
					break;
				default: 
					System.out.println("\nOpção inválida..");				
				}
			} catch(InputMismatchException e) {
				System.out.println("\nVALOR INCORRETO..");
			}
			
		} while( opcao != Menu.OP_SAIR );
	
	}
	
	public void crudPaciente()
	{
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoesCrudPaciente());
			opcao = Console.scanInt("Digite sua opção:");
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
				System.out.println("Opção inválida..");				
			}
		} while(opcao != Menu.OP_VOLTAR);
	}
	
	public void crudMedicamento()
	{
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoesCrudMedicamento());
			opcao = Console.scanInt("Digite sua opção:");
			switch(opcao)
			{
			case Menu.OP_MEDICAMENTO_CADASTRAR:
				//
				break;
			case Menu.OP_MEDICAMENTO_BUSCAR:
				//
				break;
			case Menu.OP_MEDICAMENTO_ATUALIZAR:
				//
				break;
			case Menu.OP_MEDICAMENTO_EXCLUIR:
				//
				break;
			case Menu.OP_VOLTAR:
				executar();
				break;
			default: 
				System.out.println("Opção inválida..");				
			}
		} while(opcao != Menu.OP_VOLTAR);
	}
	
	public void crudConsulta()
	{
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoesCrudConsulta());
			opcao = Console.scanInt("Digite sua opção:");
			switch(opcao)
			{
			case Menu.OP_CONSULTA_CADASTRAR:
				//
				break;
			case Menu.OP_CONSULTA_BUSCAR:
				//
				break;
			case Menu.OP_CONSULTA_ATUALIZAR:
				//
				break;
			case Menu.OP_CONSULTA_EXCLUIR:
				//
				break;
			case Menu.OP_CONSULTA_PRONTUARIO:
				//
				break;
			case Menu.OP_VOLTARR:
				executar();
				break;
			default: 
				System.out.println("Opção inválida..");				
			}
		} while(opcao != Menu.OP_VOLTAR);
	}
}
