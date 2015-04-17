package org.jairo.matos;

public class EX13 {
	private int idFornecedor;
	private int cnpj;
	private int telefone;
	public EX13(){
		idFornecedor=1;
		cnpj=1122334455;
		telefone=66995511;
	}
	public EX13(int i,int c, int t){
		idFornecedor=i;
		cnpj=c;
		telefone=t;
	}
	public int getIdFornecedor(){
		return idFornecedor;
	}
	public void setIdFornecedor(int i){
		idFornecedor=i;
	}
	public int getCnpj(){
		return cnpj;
	}
	public void setcnpj(int c){
		cnpj=c;
	}
	public int getTelefone(){
		return telefone;
	}
	public void setTelefone(int t){
		telefone=t;
	}
}