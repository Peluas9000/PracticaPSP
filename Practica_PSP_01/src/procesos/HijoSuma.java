package procesos;

import java.util.Scanner;

public class HijoSuma {
	
	public static void main(String[] args) {
		try(Scanner entrada=new Scanner(System.in)){
			
			int n1=entrada.nextInt();
			int n2=entrada.nextInt();
			
			System.out.println("La suma de "+ n1+"+"+n2+" es de "+(n1+n2));
			
		}
	}

}
