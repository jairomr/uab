package org.jairo.matos;

public class Ex6Pessoas {
	private String nome;
	private String sobrenome;
	private int    cpf;
	private int    rg;
	/**
	 * Contrutor da class
	 * @param n recebe o nome
	 * @param s recebe o sobrenome
	 * @param c recebe o cpf
	 * @param r recebe o rg
	 */ 
	public Ex6Pessoas(String n, String s, int c, int r){
		nome=n;
		sobrenome=s;
		cpf=c;
		rg=r;
	}
	/**
	 * Obtem o nome
	 * @return o nome
	 */
	public String getNome(){
		return nome;
	}
	/**
	 * Cadrata um nome
	 * @param n para o nome para a variavel nome
	 */
	public void setNome(String n){
		nome=n;
	}
	/**
	 * Obtem o sobrenome
	 * @return o sobrenome
	 */
	public String getSobrenome(){
		return sobrenome;
	}
	/**
	 * Cadrata um sobrenome
	 * @param s para o sobrenome para a variavel sobrenome
	 */
	public void setSobrenome(String s){
		sobrenome=s;
	}
	/**
	 * Obtem o cpf
	 * @return o cpf
	 */
	public int getCpf(){
		return cpf;
	}
	/**
	 * Cadrata um cpf
	 * @param c para o cpf para a variavel cpf
	 */
	public void setCpf(int c){
		cpf=c;
	}
	/**
	 * Obtem o rg
	 * @return o rg
	 */
	public int getRg(){
		return rg;
	}
	/**
	 * Cadrata um rg
	 * @param r para o rg para a variavel rg
	 */
	public void setRg(int r){
		rg=r;
	}
}
