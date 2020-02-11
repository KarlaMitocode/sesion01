package sesion01;

import java.util.Scanner;

public class hola {

	public static void main(String[] args) {
		//imprimir mensajes
            System.out.println("Bienvenido al curso");
        //capturar valores de la consola    
            Scanner sc = new Scanner(System.in);
           System.out.println("Cual es tu nombre");
           
           String nombre = sc.nextLine();
           System.out.println("Bienvenido "+ nombre);
           
           sc.close();
           
            
	}

}
