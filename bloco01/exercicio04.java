package bloco01;

//Soma de Ímpares em um Array

public class exercicio04 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;

        for (int num : numeros) {
            if (num % 2 != 0) {
                soma += num;
            }
        }

        System.out.println("Soma dos ímpares: " + soma);
    }
}
