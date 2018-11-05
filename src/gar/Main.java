package gar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Veicoli[] garage=new Veicoli[15];
		int n;
		Scanner s=new Scanner(System.in);
		
		do {
			do {
				System.out.println("1.Parcheggia"
						+ "\n2.Estrae"
						+ "\n3.Controlla la situazione del garage"
						+ "\n0.Esci");
		
				n=s.nextInt();
		
		
			}while(n<0||n>3);
		
			switch(n) {
			case 1:
				System.out.println("Dove vuoi parcheggiare?");
				int p=s.nextInt();
				System.out.println("Che tipo di veicolo è?");
				String tipo=s.nextLine();
				
			break;
			
			case 2:
				
			break;
			
			case 3:
				
			break;
			
			}
		
		}while (n!=0);
	}

}
