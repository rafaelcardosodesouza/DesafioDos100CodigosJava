package org.example;
import java.util.Random;

public class Fibonacci {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();

        for(int i = 1; i < 10 ; i++) {
            int numeroSorteado = numeroAleatorio.nextInt(20);
            System.out.println(i + "º Posição com o valor aleatorio de " + numeroSorteado + " é " + fibonnac(numeroSorteado));
        }
    }
    public static int fibonnac(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        int n1 = 0;
        int n2 = 1;

        for(int i = 1; i < n; i++){
            int soma  = n1 + n2;
            n1 = n2;
            n2 = soma;
        }
        return n1;
    }

}