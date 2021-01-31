/**
 * 
 */
package projEstagio;

import java.util.Scanner;

/**
 * @author bryan
 *
 */
public class CalculoHotel {
	
	static Hotel Lakewood = new Hotel(3, 110, 80, 90, 80);
	static Hotel Bridgewood =  new Hotel(4, 160, 110, 60, 50);
	static Hotel Ridgewood = new Hotel(5, 220, 100, 150, 40);
	
	public static void main(String[] args) {
		
		Scanner In = new Scanner(System.in);
		String entrada = In.nextLine();		
		
		String[] infos = entrada.split(":|,");
		System.out.println(buscaMenorCusto(infos));
	}
	
	public static String buscaMenorCusto(String[] infos) {
		
		int numDS = 0; 
		int numFS = 0;
		String[] aux;
		String[] dias = new String[3];
		int cont = 0;
		for (int i = 1; i<infos.length; i++) {
			aux = infos[i].replaceAll("\\)", "").split("\\(");
			dias[cont] = aux[1];
			cont++;
		}		
		for(int i = 0; i<dias.length; i++) {
			if(dias[i].equals("sat") || dias[i].equals("sun")) numFS++;	
			else numDS++;
		}
		Lakewood.calculaCusto(infos[0], numDS, numFS);
		Bridgewood.calculaCusto(infos[0], numDS, numFS);
		Ridgewood.calculaCusto(infos[0], numDS, numFS);
		if(Lakewood.getCusto() < Bridgewood.getCusto()) {
			if(Lakewood.getCusto() < Ridgewood.getCusto()) return "Lakewood";
			else return "Ridgewood";
		}
		else if(Bridgewood.getCusto() < Ridgewood.getCusto()) {
			return "Bridgewood";			
		}
		return "Ridgewood";		
	}
	
}
