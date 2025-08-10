package bloco01;
import java.util.Random;
import java.util.Scanner;

//Adivinhe Numero 
public class exercicio03 {
     public static void main(String[] args) {
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Adivinhe o número entre 1 e 100!");

        while (palpite != numeroSecreto) {
            System.out.print("Seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            }
        }

        System.out.println("Acertou! Número de tentativas: " + tentativas);
        sc.close();
    }
}
