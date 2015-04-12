package org.jairo.matos;

public class TestDriver {

	public static void main(String[] args) {

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
	System.out.println(Ex3Cal.soma(2,2));
	System.out.println(Ex3Cal.mult(2,2));
	System.out.println(Ex3Cal.sub(2,2));
	System.out.println(Ex3Cal.div(2,2));
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
	}

}
