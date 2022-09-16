import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // Estrutura vetor com Numeros
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        for (int i=0; i< numeros.length; i++){
            System.out.printf("%s ",numeros[i]);
        }
        System.out.println();

        // Estrutura vetor com letras
        String[] letras = new String[5];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "X";

        // 1ª Forma Exibir o resultado
        for (int i=0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        // 2ª Forma de atribuir
        String[] letras2 = { "A","B","C","D","E"};
        System.out.println("");

        // 2ª Forma Exibir o resultado
        for (int i=0; i < letras2.length; i++){
            System.out.printf("%s ",letras2[i]);
        }
        System.out.println("");

        // Exibir o resultado em formato de Array
        System.out.printf("%s ", Arrays.toString(letras2));

        // Encontre o menor valor, maior valor e a media
        int[] vetorNumeros = { 9, 10, 12, 25, 2};
        int maior = vetorNumeros[0];
        int menor = vetorNumeros[0];
        int media = 0;

        for(int i = 0; i < vetorNumeros.length; i++){
            if(vetorNumeros[i] > maior){
                maior = vetorNumeros[i];
            }
            if(vetorNumeros[i] < menor){
                menor = vetorNumeros[i];
            }
            media = media + vetorNumeros[i];
        }
        System.out.println();
        System.out.printf("Maior = %s, Menor = %s, Media = %s", maior,menor,media/vetorNumeros.length);
    }
}
