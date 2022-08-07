import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {


    /*
     * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
     * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
     */
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);
        String text;
        char option;
        
        List<String> listas = new ArrayList<>();
        
        do {
            System.out.println("Ingrese el texto a concatenar:");
            text = sn.next();
            listas.add(text);
            String store = "";
            for (String texto : listas) {
                store += texto;
            }
            System.out.println("Mostrando texto concatenado: " + store);
            System.out.println("-----------------------------------");
            System.out.println("¿Quiere seguir concatenando?. Escriba Y/N");
            option = sn.next().charAt(0);

        } while (option == 'y' || option == 'Y');
    }
}
