import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        double celcius,kelvin,fahrenheit;

        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        fahrenheit = lectura.nextDouble();

        celcius = (fahrenheit - 32) * 5 / 9;
        kelvin = celcius + 273.15;

        System.out.println("La temperatura en grados Kelvin es: " + kelvin + " K");
        lectura.close();
    }
}

