package org.example;

import java.util.Scanner;

public class EntradaDeDados {
    private String cpf;

    Scanner sc = new Scanner(System.in);
    Verificador verificador = new Verificador();

    public void entradaDeDados() {
        Boolean valido = false;
        try {
            System.out.print("Digite o cpf: ");
            this.cpf = sc.nextLine().replaceAll("[^0-9]+", "");
            if (this.cpf.length() == 11) {
                valido = verificador.VerificadorCpf(this.cpf);
                if (valido == true) {
                    System.out.println("O CPF digitado é Valido: ");
                } else {
                    System.out.println("O CPF digitado não é valido: ");
                }
            } else {
                System.out.println("O cpf digitado deve ter 11 numeros: ");
                entradaDeDados();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("\n FIM DO PROGRAMA");
        }
    }
}
