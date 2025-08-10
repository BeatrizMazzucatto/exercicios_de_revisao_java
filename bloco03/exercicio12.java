package bloco03;
import java.util.*;
import java.util.Scanner;

//Busca por Elemento
//Busca Cidade

public class exercicio12 {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>(Arrays.asList("São Paulo", "Rio de Janeiro", "Belo Horizonte", "Curitiba"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        if (cidades.contains(cidade)) {
            System.out.println("Encontrada no índice: " + cidades.indexOf(cidade));
        } else {
            System.out.println("Não encontrada.");
        }

        sc.close();
    }
}
