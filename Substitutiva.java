public class Substitutiva {
    public static void main(String[] args) {
        int numero = 5;
        int inicio = 10;
        int tamanho = 6;

        for (int indice = inicio;indice < tamanho+inicio;indice++){
            System.out.println(numero + " * " + indice + " = " + (numero * indice));
        }
    }
}