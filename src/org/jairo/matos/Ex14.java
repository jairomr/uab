package org.jairo.matos;

public class Ex14 {
	private int idAluno;
	private double nota;
	private int telefone;
	public Ex14(){
		idAluno=1;
		nota=10;
		telefone=66995511;
	}
	public Ex14(int i,double n, int t){
		idAluno=i;
		nota=n;
		telefone=t;
	}
	public int getIdAluno(){
		return idAluno;
	}
	public void setIdAluno(int i){
		idAluno=i;
	}
	public double getNota(){
		return nota;
	}
	public void setNota(double n){
		nota=n;
	}
	public int getTelefone(){
		return telefone;
	}
	public void setTelefone(int t){
		telefone=t;
	}
}
