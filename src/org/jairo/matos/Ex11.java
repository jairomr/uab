package org.jairo.matos;

public class Ex11 {
	private int idCliente;
	private int telefone;
	private int desconto;
	public Ex11(){
		idCliente=1;
		telefone=99887766;
		desconto=10;
	}
	public Ex11(int i,int t,int d){
		idCliente=i;
		telefone=t;
		desconto=d;
	}
	public int getIdCliente(){
		return idCliente;
	}
	public void setIdCliente(int i){
		idCliente=i;
	}
	public int getTelefone(){
		return telefone;
	}
	public void setTelefone(int t){
		telefone=t;
	}
	public int getDesconto(){
		return desconto;
	}
	public void setDesconto(int d){
		desconto=d;
	}
}

