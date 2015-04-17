package org.jairo.matos;

public class Ex1Pessoas {

	//Atributos
	private String nome;
	private String sobrenome;
	private int diaNas;
	private int mesNas;
	private int anoNas;
	 /**
	  * Contrutor da class
	  */
	public Ex1Pessoas(){
		nome="Sem nomer";
		sobrenome="Sem nome";
	}
	/**
	 * 
	 * @return
	 */
	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		nome=n;
	}
	
	public String getSobrenome(){
		return sobrenome;
	}
	public void setSobrenome(String s){
		sobrenome=s;
	}
	
	public int getDiaNas(){
		return diaNas;
	}
	public void setDiaNas(int x){
		diaNas=x;
	}
	
	public int getMesNas(){
		return mesNas;
	}
	public void setMesNas(int x){
		mesNas=x;
	}
	
	public int getAnoNas(){
		return anoNas;
	}
	public void setAnoNas(int x){
		anoNas=x;
	}
	public void info(){
		System.out.println(nome+" "+sobrenome+" "+diaNas+"/"+mesNas+"/"+anoNas);
	}
	
	
}

