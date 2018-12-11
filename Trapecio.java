package alejandrocoboyera;

import java.util.Scanner;

public class Trapecio {
    public static void trapecio() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("base menor");
    	int a = sc.nextInt();
    	System.out.println("base mayor");
    	int b = sc.nextInt();
    	System.out.println("altura");
    	int h = sc.nextInt();
    	
    	int areatr = ((a + b)/2)*h;
    	System.out.printf("el area del trapecio es igual a %d%n",areatr);;
    }
}
