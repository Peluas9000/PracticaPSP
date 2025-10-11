package procesos;

import java.util.Scanner;

public class HijoSuma {
	
	public static void main(String[] args) {
		/**
		 * <h1>Proceso Hijo </h1>
		 * <b>Recibimos los dos numeros por el Scanner del Proceso Lanzador</b>
		 * <b>Y por ultimo mostramos el calculo de la suma para que se muestre finalmente 
		 * en el Proceso padre que recibimos los dos numeros</b>
		 * 
		 */
		try(Scanner entrada=new Scanner(System.in)){
			
			int n1=entrada.nextInt();
			int n2=entrada.nextInt();
			
			System.out.println("La suma de "+ n1+"+"+n2+" es de "+(n1+n2));
			
		}
	}

}
