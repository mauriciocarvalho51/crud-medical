package kaempf.model;

public class Menu {

	public static final int OP_GERAR_MATRIZ=1;
	public static final int OP_SOMA_DIAGONAL_SECUNDARIA=2;
	public static final int OP_MULTIPLICACAO_COLUNA=3;
	public static final int OP_IMPRIMIR_NUMEROS_PRIMOS=4;
	public static final int OP_ORDENAR_LINHAS_ORDEM_CRESCENTE=5;
	public static final int OP_IMPRIMIR_MATRIZ=6;
	public static final int OP_SAIR=7;	
	
	public static final int OP_COL1=1;
	public static final int OP_COL2=2;
	public static final int OP_COL3=3;
	public static final int OP_COL4=4;
	public static final int OP_VOLTAR=5;
	
	public static String getOpcoes()
	{
		return(	"\n--------------------------------------\n" +
				"1- Gerar Matriz 4x4\n" +
				"2- Calcular a soma da diagonal secundária\n" +
				"3- Calcular a multiplicação de uma coluna\n" +
				"4- Mostrar os números primos da matriz\n" +
				"5- Ordenar cada linha da matriz em ordem crescente\n" +
				"6- imprimir matriz\n" +
				"7- Sair" +
				"\n--------------------------------------");
	}
	
	public static String getOpcoesDeColunas()
	{
		return(	"\n--------------------------------------\n" +
				"1- Coluna 1\n" +
				"2- Coluna 2\n" +
				"3- Coluna 3\n" +
				"4- Coluna 4\n" +
				"5- voltar" +
				"\n--------------------------------------");
	}
		
}
