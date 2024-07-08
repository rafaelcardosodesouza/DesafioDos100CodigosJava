package org.example;


public class Verificador {
    public boolean VerificadorCpf(String cpf){
        char[] cpfString = cpf.toCharArray();
        int[] cpfArray = new int[11];
        int[] tempcpfArray = new int[11];
        int somaPrimeiroDigito = 0, somaSegundoDigito = 0;
        int tempPeso = 9;
        for(int i = 0;i< cpfArray.length; i++){
            cpfArray[i] = Integer.parseInt(String.valueOf(cpfString[i]));
        }
        tempcpfArray = cpfArray; // deixa o cpf temporariamente

        while (tempPeso  > 2){
            somaPrimeiroDigito += tempPeso*cpfArray[tempPeso];
            tempPeso--;
        }

        if(somaPrimeiroDigito % 11 == 0 || somaPrimeiroDigito % 11 == 1){
            cpfArray[cpfArray.length-2] = 0;
        } else{
            cpfArray[cpfArray.length-2] = 11 -(somaPrimeiroDigito % 11);
        }

        tempPeso = 10;
        while (tempPeso > 1){
            somaSegundoDigito += tempPeso*cpfArray[tempPeso];
            tempPeso--;
        }

        if(somaSegundoDigito%11 == 0 || somaSegundoDigito%11 == 1){
            cpfArray[cpfArray.length-1] = 0;
        } else{
            cpfArray[cpfArray.length-1] = 11 -(somaSegundoDigito % 11);
        }
         return cpfArray[cpfArray.length - 1] == tempcpfArray[cpfArray.length - 1] && cpfArray[cpfArray.length - 2] == tempcpfArray[cpfArray.length - 2];

    }
}
