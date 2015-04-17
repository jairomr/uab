package org.jairo.matos;

public class Ex10 {
	private String placa;
	private int kmrodado;
	private int ano;
	public Ex10(){
		placa="Não Iformado";
		kmrodado=0;
		ano=2000;
	}
	public Ex10(String p,int k,int a){
		placa=p;
		kmrodado=k;
		ano=a;
	}
	public String getPacla(){
		return placa;
	}
	public void setPlaca(String p){
		placa=p;
	}
	public int getKmRodado(){
		return kmrodado;
	}
	public void setKmRodado(int k){
		kmrodado=k;
	}
	public int getAno(){
		return ano;
	}
	public void setAno(int a){
		ano=a;
	}
}
