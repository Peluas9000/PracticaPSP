package procesos;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Ayoub
 * @since 2025
 * @version 1.0
 */
public class LanzadorSuma {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            // Lanzamos el proceso hijo (asegúrate de estar en la raíz del paquete "procesos")
            /**
             * 
             *
             */
        	Process p = new ProcessBuilder("java", "-cp", ".", "procesos.HijoSuma").start();

            try (PrintWriter pw = new PrintWriter(p.getOutputStream(), true)) {

     
                System.out.print("Dime el número 1: ");
                int n1 = entrada.nextInt();
                pw.println(n1);

                System.out.print("Dime el número 2: ");
                int n2 = entrada.nextInt();
                pw.println(n2);

           
                pw.flush();
                pw.close();


                InputStream is = p.getInputStream();
                int c;
                System.out.print("Hijo: ");
                while ((c = is.read()) != -1) {
                    System.out.print((char) c);
                }

                
                int exitCode = p.waitFor();
                System.out.println("\nProceso hijo finalizado con código: " + exitCode);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
