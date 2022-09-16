public class Main {
    public static void main(String[] args) {
        saudacao("Jhon");
        int resultado = soma(2,3);
        System.out.println("O resultado da soma é: " + resultado);
    }
    public static void saudacao(String nome){
        System.out.println("hello " + nome);
    }
    public static int soma(int a, int b){
        return a + b;
    }
}
