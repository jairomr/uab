package org.jairo.matos;

public class Ex12 {
	private int idProduto;
	private int qt;
	private double valor;
	public Ex12(){
		idProduto=1;
		qt=1;
		valor=9.99;
	}
	public Ex12(int i,int q, double v){
		idProduto=i;
		qt=q;
		valor=v;
	}
	public int getIdProduto(){
		return idProduto;
	}
	public void setIdProduto(int i){
		idProduto=i;
	}
	public int getQt(){
		return qt;
	}
	public void setQt(int q){
		qt=q;
	}
	public double getValor(){
		return valor;
	}
	public void setValor(double v){
		valor=v;
	}
}
