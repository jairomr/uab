package org.jairo.matos;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex2Data {
	private String  dia;
	private String  mes;
	private String ano;
	
	/**
	 * Metodo de pergar a dia
	 * @return dia retorna o dia
	 */
	public String getDia(){
		return dia;
	}
	/**
	 * Metodo de selecionar o dia
	 * @param x recebe o dia para passar para variavel dia
	 */
	public void setDia(String x){
		dia=x;
	}
	/**
	 * Metodo de pergar a mes
	 * @return mes retorna o mes
	 */
	public String getMes(){
		return mes;
	}
	/**
	 * Metodo de selecionar o mes
	 * @param x recebe o dia para passar para variavel mes
	 */
	public void setMes(String x){
		mes=x;
	}
	/**
	 * Metodo de pergar a ano
	 * @return ano retorna o ano
	 */
	public String getAno(){
		return ano;
	}
	/**
	 * Metodo de selecionar o ano
	 * @param x recebe o dia para passar para variavel ano
	 */
	public void setAno(String x){
		ano=x;
	}
	/**
	 * Metodo de mostra a data  completa
	 */
	public void dataCompleta(){
		String dataComp = dia+"/"+mes+"/"+ano;//Garda a data completa
		Date d = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");//Escolar o formato da data
		//Checa se a data é valida
		try {
			d = sdf.parse(dataComp);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		System.out.println(sdf.format(d));//emprima a data no monitor
	}
}
