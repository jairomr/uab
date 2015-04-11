package org.jairo.matos;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex2Data {
	private int  dia;
	private int  mes;
	private int ano;
	private boolean erro;
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
		if(x>=1&&x<=31){dia=x;}
		else{erro=true;}
		
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
		if( x>=1 && x<=12){mes=x;}
		else{erro=true;}
		
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
		if(x>0){ano=x;}
		else{erro=true;}
	}
	/**
	 * Metodo de mostra a data  completa
	 */
	public void dataCompleta(){
	
		String dataComp = ""+dia+"/"+mes+"/"+ano+"";//Garda a data completa
		Date dt = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");//Escolar o formato da data
		//Checa se a data é valida
		try {
			dt = sdf.parse(dataComp);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		if(erro){
			System.out.println("Erro no sistema data informada invalida");
		}else{
			System.out.println(sdf.format(dt));//emprima a data no monitor
		}
	}
}
