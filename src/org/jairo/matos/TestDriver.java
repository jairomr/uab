package org.jairo.matos;

public class TestDriver {

	public static void main(String[] args) {

	System.out.println("Ativdade 2 ");	
	Ex2Data d =new Ex2Data();
	d.setAno(2000);
	d.setDia(12);
	d.setMes(05);
	d.dataCompleta();
	d.setMes(13);//Testar Erro
	d.dataCompleta();
	System.out.println(" ");
	//Ativdade 3
	System.out.println("Ativdade 3 ");
	System.out.println(Ex3Cal.soma(2,2));
	System.out.println(Ex3Cal.mult(2,2));
	System.out.println(Ex3Cal.sub(2,2));
	System.out.println(Ex3Cal.div(2,2));
	System.out.println(" ");
	//Atividade 4
	System.out.println("Ativdade 4 ");
	Ex4Moeda.conv(3, 50, 2, 3.5);
	System.out.println(" ");
	}

}
