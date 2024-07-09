package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Verificador verificador = new Verificador();
        Scanner sc = new Scanner(System.in);

        String cpf = sc.nextLine();
        System.out.println(verificador.VerificadorCpf(cpf));

         cpf = sc.nextLine();
        System.out.println(verificador.VerificadorCpf(cpf));

    }
}