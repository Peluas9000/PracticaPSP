

**Proyecto:** Actividad 1.3 – Comunicación entre procesos en Java
**Autor:** Ayoub
**Fecha:** 2025
**Versión:** 1.0

---

 Descripción general

Este proyecto implementa una aplicación Java basada en **procesos padre e hijo**, donde ambos programas se comunican entre sí mediante flujos de entrada y salida estándar(`System.in` y `System.out`).

El proceso padre LanzadorSuma solicita dos números enteros al usuario y los envía al proceso hijo (HijoSuma), el cual calcula la suma de ambos y devuelve el resultado.
La respuesta del hijo se captura y muestra en el proceso padre.

---



### 1️ Clase HijoSuma

 Paquete: procesos
 Función:Recibe dos números enteros por la entrada estándar (Scanner(System.in)), calcula su suma y la muestra por pantalla.
 Método principal:

  * `main(String[] args)`: lee los dos números enviados por el padre y muestra la suma.
* **Documentación:** Contiene un bloque de **JavaDoc** que describe el propósito del proceso hijo y su comportamiento general.

---

### 2️ Clase LanzadorSuma

* Paquete: procesos
* Función: Actúa como proceso padre.

  * Solicita al usuario dos números.
  * Crea un proceso hijo con ProcessBuilder.
  * Envía los dos números al hijo a través de un `PrintWriter` conectado al `OutputStream` del proceso.
  * Lee la respuesta del hijo carácter a carácter mediante un `InputStream`.
* **Control de errores:**

  * Maneja `InputMismatchException` si el usuario introduce texto no numérico.
  * Captura `IOException` y `InterruptedException` para errores de ejecución del proceso.
  *JavaDoc incluido:** Describe autor, versión, fecha y funcionamiento general.



 Comunicación entre procesos

1. El padre lanza el proceso hijo:

	java
   Process p = new ProcessBuilder("java", "-cp", ".", "procesos.HijoSuma").start();
  

2. El padre envía datos (los dos números) mediante un PrintWriter:

   java
   pw.println(n1);
   pw.println(n2);
   pw.close();
   

3. El hijo **lee los datos** con un `Scanner(System.in)`:

   java
   int n1 = entrada.nextInt();
   int n2 = entrada.nextInt();
  

4. El hijo **devuelve la suma** con:

   ```java
   System.out.println("La suma de " + n1 + "+" + n2 + " es de " + (n1 + n2));
   ```

5. El padre **lee la respuesta carácter a carácter**:

   java
   int c;
   while ((c = is.read()) != -1) {
       System.out.print((char) c);
   }
   

6. Finalmente, el padre espera la finalización del hijo:

   java
   int exitCode = p.waitFor();
  




7. Generación del Javadoc

 El Javadoc se ha generado desde Eclipse con:

  Project → Generate Javadoc
 


Ayoub_Actividad1_3/
│
├─ src/
│   └─ procesos/
│       ├─ LanzadorSuma.java
│       └─ HijoSuma.java
│
├─ doc/         ← Javadoc generado
│
└─ README.txt   ← Este documento
