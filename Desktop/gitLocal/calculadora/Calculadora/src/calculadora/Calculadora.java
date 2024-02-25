package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = 0;
        int n1 = 0;
        int n2 = 0;
        int solucion =0;
        
        System.out.println("buenas, gracias por usar la calculadora");
        
        while (n != 5) {
            System.out.println("elige lo que quieres hacer");
            System.out.println("1 sumar");
            System.out.println("2 restar");
            System.out.println("3 multiplicar");
            System.out.println("4 dividir");
            System.out.println("5 salir");
            n = sc1.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Introduce el primer numero a sumar");
                    n1 = sc1.nextInt();
                    System.out.println("Introduce el segundo numero a sumar");
                    n2 = sc1.nextInt();
                    solucion =n1+n2;
                    System.out.println("la solucion es : "+solucion);
                    System.out.println(" ");
                    break;
                case 2:
                     System.out.println("Introduce el primer numero a restar");
                    n1 = sc1.nextInt();
                    System.out.println("Introduce el segundo numero a restar");
                    n2 = sc1.nextInt();
                    solucion =n1-n2;
                    System.out.println("la solucion es : "+solucion);
                    System.out.println(" ");
                    break;
                case 3:    System.out.println("Introduce el primer numero a multiplicar");
                    n1 = sc1.nextInt();
                    System.out.println("Introduce el segundo numero a multiplicar");
                    n2 = sc1.nextInt();
                    solucion =n1*n2;
                    System.out.println("la solucion es : "+solucion);
                    System.out.println(" ");
                     break;
                case 4:
                        System.out.println("Introduce el primer numero a dividir");
                    n1 = sc1.nextInt();
                    System.out.println("Introduce el segundo numero a sdividir");
                    n2 = sc1.nextInt();
                    solucion =n1/n2;
                    System.out.println("la solucion es : "+solucion);
                    System.out.println(" ");
                     break;

            }
        }
    }
}
