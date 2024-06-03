package resources;

public class Verificador {
    public boolean verificador(String palavra){
        StringBuilder palavraOrginial = new StringBuilder(palavra);
        String palavraInvertida = palavraOrginial.reverse().toString();
        return palavraInvertida.equals(palavra);
    }
}
