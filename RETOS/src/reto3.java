import java.util.Random;
import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        //DECLARA VARIABLES
        int n1;
        int n2;
        String nombre;      
        int apuesta;
        //INSTANCIAR CLASE
        Random r1 = new Random();
        n1=r1.nextInt(2);
        Scanner lectura = new Scanner(System.in); 
        //SOLICITAR DATOS
        System.out.println("Ingrese su nombre");
        nombre=lectura.nextLine();
        System.out.println("Ingrese el valor de apuesta");
        apuesta=lectura.nextInt();
        System.out.println("Seleccione 0  Cara   1 Sello");
        n2=lectura.nextInt();
       //CREAR LA CONDICION
       if (n1==n2) {
        apuesta=apuesta*2;
        System.out.println(nombre+"HAS GANADO!"+apuesta);
        
       } else {
        apuesta=apuesta-apuesta;
        System.out.println(nombre+"HAS PERDIDO"+apuesta);
       } 
       lectura.close();
       
        
    }
}
