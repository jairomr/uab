package org.jairo.matos;

public class Ex9 {
	private String nome;
	private String sobre;
	private int cpf;
	public Ex9(){
		nome="SemNome";
		sobre="SemSobrenome";
		cpf=123456789;
	}
	public Ex9(String n,String s,int c){
		nome=n;
		sobre=s;
		cpf=c;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		nome=n;
	}
	public String getSobre(){
		return sobre;
	}
	public void setSobre(String s){
		sobre=s;
	}
	public int getCpf(){
		return cpf;
	}
	public void setCpf(int c){
		cpf=c;
	}
	public void info(){
		System.out.println("Nome "+nome+" "+sobre+" | cpf "+cpf);
		
	}

}