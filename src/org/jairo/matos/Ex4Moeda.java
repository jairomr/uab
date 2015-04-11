package org.jairo.matos;

public class Ex4Moeda {
	/**
	 * Metodo de converte a moeda
	 * informe o id da moeda 1 para DolarAmericano 2 para Euro 3 para Real
	 * informe o valor da moeda para converte
	 * @param idMoeda1 id da moeda que deseja converte
	 * @param valor1 quantidade de moeda que deseja conter
	 * @param idMoeda2 id da moeda para qual irei converte
	 * @param valor2 valor de converçao do mercado
	 */
	public static void conv(int idMoeda1, double valor1, int idMoeda2, double valor2){
		String[] Moeda={"DolarAmericanos","Euro","Real"};
		String[] s={"$","€","R$"};
		double conv;
		conv=valor1*valor2;
		idMoeda1--;//Corrige o bug pois vetor nao comessa em 1 comessa em 0
		idMoeda2--;//Corrige o bug pois vetor nao comessa em 1 comessa em 0
		System.out.println(s[idMoeda1]+valor1+" "+Moeda[idMoeda1]+" para "+Moeda[idMoeda2]+" é igual a "+s[idMoeda2]+conv+" "+Moeda[idMoeda2]);
		
		
	}



}
