package org.jairo.matos;

public class TestDriver {

	public static void main(String[] args) {
	System.out.println("Ativdade 1 ");
	Ex1Pessoas jairo = new Ex1Pessoas();
	jairo.setNome("Jairo");
	jairo.setSobrenome("Maots");
	jairo.setDiaNas(8);
	jairo.setMesNas(4);
	jairo.setAnoNas(1994);
	jairo.info();
	System.out.println("Ativdade 2 ");	
	Ex2Data d =new Ex2Data();
	d.setAno(2004);
	d.setDia(12);
	d.setMes(05);
	d.dataCompleta();//ok
	d.setMes(13);
	d.dataCompleta();//Erro mez
	d.setMes(2);
	d.setDia(29);
	d.dataCompleta();//Ano bixeto
	d.setMes(4);
	d.dataCompleta();//ok
	d.setAno(2005);
	d.setMes(2);
	d.dataCompleta();//Erro nao é bixeto
	d.setDia(28);
	d.dataCompleta();//ok
	System.out.println(" ");
	//Ativdade 3
	System.out.println("Ativdade 3 ");
	System.out.println(Ex3Cal.soma(1,2));
	System.out.println(Ex3Cal.mult(2,2));
	System.out.println(Ex3Cal.sub(2,2));
	System.out.println(Ex3Cal.div(2,2));
	System.out.println(Ex3Cal.pot(2, 3));
	System.out.println(" ");
	//Atividade 4
	System.out.println("Ativdade 4 ");
	Ex4Moeda.conv(3, 50, 2, 3.5);
	System.out.println(" ");
	//Atividade 5
	System.out.println("Ativdade 5 ");
	Ex5DataStatc.dataNow();
	System.out.println(" ");
	//Atividade 6
	System.out.println("Ativdade 6 ");
	Ex6Pessoas p = new Ex6Pessoas("Jairo", "Matos", 29029029, 34382420);
	System.out.println(p.getNome()+" "+p.getSobrenome()+" | "+p.getCpf()+" | "+p.getRg());
	System.out.println(" ");
	//Atividade 7
	System.out.println("Ativdade 7 ");
	Ex7 e7 = new Ex7();
	e7.fator(10);
	System.out.println(e7.resutFator()+" resutado em M "+e7.getLado()+"o lado em cm "+e7.area()+" area em m "+e7.perimetro()+" o perimeto em metro");	
	System.out.println(" ");
	//Atividade 8
	System.out.println("Ativdade 8 ");
	System.out.println("Soma int "+Ex8.soma(2,2));
	System.out.println("Soma double "+Ex8.soma(2.2,2.2));
	System.out.println(" ");
	//Atividade 9
	System.out.println("Ativdade 9 ");
	Ex9 e9 = new Ex9();
	e9.info();
	Ex9 w9 = new Ex9("Jairo","Matos", 34382420);
	w9.info();
	}
}
