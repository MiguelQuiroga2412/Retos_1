import java.util.Random;
import java.util.Scanner;

public class reto6 {
  public static void main(String[] args) {
         
    //DECLARA VARIABLES
    int n1,n2,vida=3,valorApuesta,acumulado=0;
    Scanner lectura = new Scanner(System.in);
    Random r1 = new Random();
   while (vida>=1 && vida<=3) {
     n1=r1.nextInt(2);
     //SOLICITAR DATOS
     System.out.println("Seleccione 0  Cara   1 Sello");
     n2=lectura.nextInt();
     System.out.println("Ingrese el Valor De su Apuesta");
     valorApuesta=lectura.nextInt();
    //CREAR LA CONDICION
    if (n1==n2) {
     System.out.println("HAS GANADO!");
     acumulado= acumulado+valorApuesta;
    } else {
      vida=vida-1;
     System.out.println("HAS PERDIDO");
     acumulado=acumulado-valorApuesta;

    } 
    System.out.println("Su dinero acumulado es: "+acumulado);
    lectura.close();
   }
  
}
}
