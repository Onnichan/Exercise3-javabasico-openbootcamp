import java.util.Scanner;

public class App {

    // public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);
        String text;
        String store = "";
        char option;

        do {
            System.out.println("Ingrese el texto a concatenar:");
            text = sn.next();
            store += text;
            System.out.println("Mostrando texto concatenado: " + store);
            System.out.println("-----------------------------------");
            System.out.println("¿Quiere seguir concatenando?. Escriba Y/N");
            option = sn.next().charAt(0);

        } while (option == 'y' || option == 'Y');
    }
}
