import java.util.Random;
import java.util.Scanner;
public class reto8 { 
    public static void main(String[] args) { 
        int intentos = 10; 
        int numeroIntento; 
        Random rand = new Random(); 
        int numeroAdivinar = rand.nextInt(100) + 1; 
        Scanner lectura = new Scanner(System.in); 
        while (intentos > 0) { 
            System.out.print("Ingresa un número  (Tienes" +intentos+ "intentos)" ); 
            numeroIntento = lectura.nextInt();
            if (numeroIntento == numeroAdivinar) { 
                System.out.println("¡Adivinaste el número!"); 
                System.out.println("Te tomó" +  intentos + " intentos."); 
            } else if (numeroIntento < numeroAdivinar) { 
                System.out.println("El número a adivinar es mayor."); 
            } else { 
                System.out.println("El número a adivinar es menor."); 
            } 
            intentos--; 
        } 
        if (intentos == 0) { 
            System.out.println("Lo siento, no lograste adivinar el número."); 
            System.out.println("El número a adivinar era: " + numeroAdivinar); 
        } 
        lectura.close();

    } 

 

} 
