package org.jairo.matos;

public class Ex7 {
	private int lado;
	private int ladoFator;
	public Ex7(){
		lado= 100;
	}
	/**
	 * Retorne o lado
	 * @return retorne o lado sem o fator
	 */
	public int getLado(){
		return lado;
	}
	/**
	 * Inform o lado do quatrado
	 * @param l iforme o lado
	 */
	public void setLado(int l){
		lado=l;
	}
	/**
	 * Multiplique o lado pelo fator
	 * @param f inform o fator
	 */
	public void fator(int f){
		ladoFator=lado*f;
	}
	/**
	 * Retorna o resutado do fator
	 * @return retornao resutado do fator vezes o lado em metros
	 */
	public double resutFator(){
		return ladoFator/100;
	}
	/**
	 * Retorna area do quadrado em metro
	 * @return Retorna area do quadrado em metro
	 */
	public double area(){
		return (ladoFator*ladoFator)/100;
	}
	/**
	 * Retorna perimetro do quadrado em metro
	 * @return Retorna perimeto do quadrado em metro
	 */
	public double perimetro(){
		return (ladoFator*4)/100;
	}
}
