package alejandrocoboyera;
import java.util.Scanner;
public class Triangulo {
	
	public static void triangulo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("inserte el valor del primer cateto/n");
		int c = sc.nextInt();
		System.out.print("inserte el valor del segundo cateto/n");
		int c1 = sc.nextInt();
		System.out.print("inserte el valor de la hipotenusa/n");
		int h = sc.nextInt();
		
		if (c<=0){
			System.out.println("valor no valido");
			
		}if(c1<=0) {
			System.out.println("valor no valido");
		}if(h<=0) {
			System.out.println("valor no valido");
		}
	   
       int area = c * c1;
       System.out.printf("el valor del area del triangulo es igual %d%n",area);
		
	}

}
