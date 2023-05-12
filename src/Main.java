import java.util.Scanner;

public class Main {

    public static void mostrarMenu(){
        System.out.println("================");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
        System.out.println("================");
    }

    public static int leeEntero(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static float leeFloat(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }

    public static void sumar(){
        float n1 = leeFloat("Ingresa un número:");
        float n2 = leeFloat("Ingresa otro número:");
        System.out.println("El resultado es : " + (n1 + n2));
    }
    public static void restar(){
        float n1 = leeFloat("Ingresa un número:");
        float n2 = leeFloat("Ingresa otro número:");
        System.out.println("El resultado es : " + (n1 - n2));
    }
    public static void multiplicar(){
        float n1 = leeFloat("Ingresa un número:");
        float n2 = leeFloat("Ingresa otro número:");
        System.out.println("El resultado es : " + (n1 * n2));
    }
    public static void dividir(){
        float n1 = leeFloat("Ingresa un número:");
        float n2 = leeFloat("Ingresa otro número:");
        System.out.println("El resultado es : " + (n1 / n2));
    }

    public static void main(String[] args) {
        int op;
        do {
            mostrarMenu();
            op = leeEntero("Selecciona una opción del menú:");
            switch (op){
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 0:
                    System.out.println("salir!");
                    break;
                default:
                    System.out.println("¡No ha ingresado una opción válida!");
            }
        } while (op != 0);
    }
}

/***
 * Repetir
 * Hasta Que -> sale cuando variable de control sea verdadero
 *
 * Do -> Hacer
 * While -> Mientras -> sale cuando la variable de control es falsa
 *
 *
 */