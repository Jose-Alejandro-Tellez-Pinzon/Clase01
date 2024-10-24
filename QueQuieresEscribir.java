import java.util.Scanner;

public class QueQuieresEscribir {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.print("Escriba su primera palabra: ");
        var palabra1 = entrada.nextLine();
        System.out.print("Escriba su segunda palabra: ");
        var palabra2 = entrada.nextLine();
        System.out.print("Escriba su tercera palabra: ");
        var palabra3= entrada.nextLine();
        System.out.print("Tu frase es: "+palabra1+ " " +palabra2+ " " +palabra3 );
        entrada.close();
        
    }
}
