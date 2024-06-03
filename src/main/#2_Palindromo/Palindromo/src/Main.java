import resources.Verificador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Verificador verificador = new Verificador();
        System.out.println("Para sair digite 0");

        while (true) {
            System.out.printf("Digita a palavra que deseja verificar se é um Palíndromo: ");
            String palavra = sc.nextLine().toLowerCase();

            if (palavra.equals("0")) {
                System.out.println("Saindo");
                break;
            }

            System.out.println(verificador.verificador(palavra) ? "é um palindrome" : "não é um palindrome");
        }
    }
}