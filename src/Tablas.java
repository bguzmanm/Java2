import java.util.Scanner;

public class Tablas {

    public static void main(String[] args){
        int op = 1000;

   /*   op = op + 1;
        op += 1;
        op++;

        op = op - 1;
        op -= 1;
        op--;

        op = op * 10;
        op*=10;

        op = op / 10;
        op/=10; */


        Scanner entrada = new Scanner(System.in);
        while (op != 0){
            System.out.println("Ingresa el número de la tabla (0 para salir)");
            op = entrada.nextInt();
            if (op != 0){
                muestraTabla(op);
            } else {
                todasLasTablas();
            }
        }
    }

    public static void muestraTabla(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + " = " + (num * i));
        }
    }

    public static void todasLasTablas(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            System.out.println("-------------");
            muestraTabla(i);
            System.out.println("-------------");
        }

    }
}
