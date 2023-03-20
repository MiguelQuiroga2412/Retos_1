import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int p1,p2,p3,p4,p5;
        int ValorCompra;
        int iva;
        String nombre1,nombre2,nombre3,nombre4,nombre5;
        //INSTANCIAR CLASE
        Scanner lectura =new Scanner (System.in);
        //SOLICITAR DATOS
        System.out.println("Ingrese el nombre de su primer producto");
        nombre1=lectura.nextLine();
        System.out.println("Ingrese el valor de su primer producto a llevar");
        p1=lectura.nextInt();
        System.out.println("Ingrese el nombre de su segundo producto");
        nombre2=lectura.nextLine();
        System.out.println("Ingrese el valor de su segundo producto a llevar");
        p2=lectura.nextInt();
        System.out.println("Ingrese el nombre de su tercer producto");
        nombre3=lectura.nextLine();
        System.out.println("Ingrese el valor de su tercer producto a llevar");
        p3=lectura.nextInt();
        System.out.println("Ingrese el nombre de su cuarto producto");
        nombre4=lectura.nextLine();
        System.out.println("Ingrese el valor de su cuarto producto a llevar");
        p4=lectura.nextInt();
        System.out.println("Ingrese el nombre de su quinto producto");
        nombre5=lectura.nextLine();
        System.out.println("Ingrese el valor de su quinto producto a llevar");
        p5=lectura.nextInt();

        ValorCompra=p1+p2+p3+p4+p5;
        iva=(ValorCompra*19)/100;   
        ValorCompra=ValorCompra+iva;
        System.out.println("Su compra fue de "+nombre1+p1+"   "+nombre2+p2+"   "+nombre3+p3+"  "+nombre4+p4+"   "+nombre5+p5);
        lectura.close();
    }
}


