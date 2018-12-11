package alejandrocoboyera;

import java.util.Scanner;

public class Rectangulo {
	public static void arearectangulo() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("inserte el valor del lado");
    	int lado = sc.nextInt();
    	System.out.println("inserte el valor de la base");
    	int  base = sc.nextInt();
    	
    	int arear = lado * base;
    	System.out.printf("el valor del area es %d%n",arear);
  
 }
}