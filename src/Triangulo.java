import java.util.Locale;
import java.util.Scanner;

/***
 * ZYWXVUTSRQPONMLKJIHGFEDCBA
 * YWXVUTSRQPONMLKJIHGFEDCBA
 * WXVUTSRQPONMLKJIHGFEDCBA
 * XVUTSRQPONMLKJIHGFEDCBA
 * VUTSRQPONMLKJIHGFEDCBA
 * UTSRQPONMLKJIHGFEDCBA
 * TSRQPONMLKJIHGFEDCBA
 * SRQPONMLKJIHGFEDCBA
 * RQPONMLKJIHGFEDCBA
 * QPONMLKJIHGFEDCBA
 * PONMLKJIHGFEDCBA
 * ONMLKJIHGFEDCBA
 * NMLKJIHGFEDCBA
 * MLKJIHGFEDCBA
 * LKJIHGFEDCBA
 * KJIHGFEDCBA
 * JIHGFEDCBA
 * IHGFEDCBA
 * HGFEDCBA
 * GFEDCBA
 * FEDCBA
 * EDCBA
 * DCBA
 * CBA
 * BA
 * A
 */


public class Triangulo {

    public static void main(String[] args){
        //metodoPocoElegante();
        metodoElegante();
        // elOtro();
    }

    public static void metodoPocoElegante(){
        String letras = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
        for (int i = 0; i < letras.length(); i++) {
            for (int j = i; j < letras.length() ; j++) {
                System.out.print(letras.charAt(j));
            }
            System.out.println();
        }
    }



    public static void metodoElegante(){
        for (int i = 90; i >=65 ; i--) {
            for (int j = i; j >= 65 ; j--) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }

    public static void elOtro(){
        String abecedario = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        for (int i = 0; i < abecedario.length(); i++) {
            System.out.println(abecedario.substring(i));
        }
    }
}
