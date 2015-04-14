package org.jairo.matos;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex2Data {
	private int  dia;
	private int  mes;
	private int ano;
	private boolean erro, m, d, a;
	/**
	 * Contrutor da Class
	 */
	public Ex2Data(){
		erro=false;
	}	
	/**
	 * Metodo de pergar a dia
	 * @return dia retorna o dia
	 */
	public int getDia(){
		return dia;
	}
	/**
	 * Metodo de selecionar o dia
	 * @param x recebe o dia para passar para variavel dia
	 */
	public void setDia(int x){
		if(x>=1&&x<=31){d=false;dia=x;}
		else{d=true;
		dia=x;}
		
	}
	/**
	 * Metodo de pergar a mes
	 * @return mes retorna o mes
	 */
	public int getMes(){
		return mes;
	}
	/**
	 * Metodo de selecionar o mes
	 * @param x recebe o dia para passar para variavel mes
	 */
	public void setMes(int x){
		if( x>=1 && x<=12){m=false;mes=x;}
		else{m=true;
		mes=x;}
		
	}
	/**
	 * Metodo de pergar a ano
	 * @return ano retorna o ano
	 */
	public int getAno(){
		return ano;
	}
	/**
	 * Metodo de selecionar o ano
	 * @param x recebe o dia para passar para variavel ano
	 */
	public void setAno(int x){
		if(x>0){a=false;ano=x;}
		else{a=true;
		ano=x;}
	}
	/**
	 * Metodo de mostra a data  completa
	 */
	public void dataCompleta(){
	
		String dataComp = ""+dia+"/"+mes+"/"+ano+"";//Garda a data completa
		Date dt = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");//Escolar o formato da data
		//Prepara a data para imprimir
		try {
			dt = sdf.parse(dataComp);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		//Impede dia mes e ano que nao se emcaixa seja emprimido
		if(a||d||m){erro=true;}else{
			if(mes==4||mes==6||mes==9||mes==11&&dia<=30){erro=false;}else{
				if(ano%4==0&&mes==2&&dia<=29){erro=false;}else{
					if(mes==2&&dia<=28){erro=false;}else{
						if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12&&dia<=31){erro=false;}
						else{erro=true;//Não precisa do ele mais ele ta aki para evitar um bug :)
						}}}}}//Chaves do else
		
			if(erro){
				System.out.println("Erro no sistema data informada invalida");
			}else{
				System.out.println(sdf.format(dt));//emprima a data no monitor
			}
		
	}
	}
