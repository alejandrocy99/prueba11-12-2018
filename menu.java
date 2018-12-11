package alejandrocoboyera;

import java.util.Scanner;

public class menu {
	public static void menu1() {
   Scanner sc = new Scanner(System.in);
   //declaramos la variable op
   int op;
    
 
        System.out.println("1.-calcular el area de un triangulo");
		System.out.println("2.-calcular el area de un trapecio");
		System.out.println("3.-calcular el area de un rectangulo");
		System.out.println("salir");
	   
   
   op = sc.nextInt();
  //aqui utilizando un switch y pidiendo desde teclado la variable op segun el caso//   
   switch(op) {
            
     case 1:
		  Triangulo.triangulo();
		  break;
     case 2:
    	  Rectangulo.arearectangulo();
    	 break;
     case 3:
    	   Trapecio.trapecio();
    	 break;
    	 
     case 4:
    	 
    	 break;
     default:
    	 
    	 System.out.println("opcion no valido");;
	  }
    	 		
  }
}
