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
			case Menu.OP_GERAR_MATRIZ:
				//gerarMatriz();
				break;
			case Menu.OP_SOMA_DIAGONAL_SECUNDARIA:
				//calculaDiagonalSecundaria();
				break;
			case Menu.OP_MULTIPLICACAO_COLUNA:
				//multiplicarColuna();
				break;
			case Menu.OP_IMPRIMIR_NUMEROS_PRIMOS:
				//numerosPrimos();
				break;
			case Menu.OP_ORDENAR_LINHAS_ORDEM_CRESCENTE:
				//ordenarLinhasOrdemCresc();
				break;
			case Menu.OP_IMPRIMIR_MATRIZ:
				//imprimir();
				break;
			case Menu.OP_SAIR:
				System.out.println("[Aplica��o finalizada!!!]");
				break;
			default: 
				System.out.println("Op��o inv�lida..");				
			}
		} while( (opcao != Menu.OP_SAIR) );
	
	}
}
