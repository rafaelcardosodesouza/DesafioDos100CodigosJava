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

        LOGGER.log(Level.INFO, "Iniciando a verificação do CPF: {0}", cpfArray);

        int tempPeso = 9;
        int somaPrimeiroDigito =0;
        int somaSegundoDigito =0;
        for (int i = 0; i < 9; i++) {
            somaPrimeiroDigito += cpfArray[tempPeso] * tempPeso;
            tempPeso--;
        }
        LOGGER.log(Level.INFO, "Primeiro verificador calculado sem tratamento: {0}", somaPrimeiroDigito);

        somaPrimeiroDigito = 11 - (somaPrimeiroDigito % 11);
        if (somaPrimeiroDigito % 11 < 2) {
            somaPrimeiroDigito = 0;
        }

        tempPeso = 10;
        for (int i = 0; i < 10; i++) {
            somaSegundoDigito += tempPeso * cpfArray[tempPeso];
            tempPeso--;
        }
        LOGGER.log(Level.INFO, "Primeiro dígito verificador calculado: {0}", somaSegundoDigito);

        somaSegundoDigito = 11 - (somaSegundoDigito % 11);
        LOGGER.log(Level.INFO, "Segundo verificador calculado sem tratamento: {0}", somaSegundoDigito);

        if (somaSegundoDigito % 11 < 2) {
            somaSegundoDigito = 0;
        }
        LOGGER.log(Level.INFO, "Primeiro segundo verificador calculado: {0}", somaSegundoDigito);

        return cpfArray[9] == somaPrimeiroDigito && cpfArray[10] == somaSegundoDigito;

    }
}
