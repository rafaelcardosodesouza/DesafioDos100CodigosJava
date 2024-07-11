package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Verificador {
    private static final Logger LOGGER = Logger.getLogger(Verificador.class.getName());

    public boolean VerificadorCpf(String cpf) {
        char[] cpfString = cpf.toCharArray();
        int[] cpfArray = new int[11];

        for (int i = 0; i < cpfArray.length; i++) {
            cpfArray[i] = Integer.parseInt(String.valueOf(cpfString[i]));
        }

        int somaPrimeiroDigito = 0;
        int somaSegundoDigito = 0;

        /*
         * VERIFICAÇÃO DO PRIMEIRO DIGITO
         * */

        for (int i = 0; i < 9; i++) {
            somaPrimeiroDigito += cpfArray[i] * (10 - i);
        }

        LOGGER.log(Level.INFO, "Soma do primeiro Digito: {0}", somaPrimeiroDigito);

        somaPrimeiroDigito = 11 - (somaPrimeiroDigito % 11);
        if (somaPrimeiroDigito % 11 < 2) {
            somaPrimeiroDigito = 0;
        }
        LOGGER.log(Level.INFO, "Primeirdo digito verificado: {0}", somaPrimeiroDigito);

        /*
         * VERIFICAÇÃO DO SEGUNDO DIGITO
         * */

        for (int i = 0; i < 10; i++) {
            somaSegundoDigito += cpfArray[i] * (11 - i);
        }
        LOGGER.log(Level.INFO, "Soma do segundo digito: {0}", somaSegundoDigito);

        somaSegundoDigito = 11 - (somaSegundoDigito % 11);
        /*if (somaSegundoDigito % 11 < 2) {
            somaSegundoDigito = 0;
        }*/
        LOGGER.log(Level.INFO, "Segundo digito verificado: {0}", somaSegundoDigito);

        return cpfArray[9] == somaPrimeiroDigito && cpfArray[10] == somaSegundoDigito;

    }
}
