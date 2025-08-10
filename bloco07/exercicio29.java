package bloco07;

import java.util.LinkedList;
import java.util.Scanner;

//Historico de Navegacao

public class exercicio29 {
    private LinkedList<String> historico = new LinkedList<>();
    private int indiceAtual = -1; // posição atual no histórico

    public void visitar(String url) {
        // Remove as páginas à frente se estiver no meio (como em navegadores reais)
        while (indiceAtual + 1 < historico.size()) {
            historico.removeLast();
        }

        historico.add(url);
        indiceAtual++;
        System.out.println("Visitando: " + url);
    }

    public void voltar() {
        if (indiceAtual > 0) {
            indiceAtual--;
            System.out.println("Voltando para: " + historico.get(indiceAtual));
        } else {
            System.out.println("Não há páginas anteriores.");
        }
    }

    public void avancar() {
        if (indiceAtual < historico.size() - 1 && indiceAtual + 1 < historico.size()) {
            indiceAtual++;
            System.out.println("Avançando para: " + historico.get(indiceAtual));
        } else {
            System.out.println("Não há páginas seguintes.");
        }
    }

    public static void main(String[] args) {
        exercicio29 navegador = new exercicio29();
        Scanner sc = new Scanner(System.in);
        String comando;

        System.out.println("Comandos: visitar <url>, voltar, avancar, sair");

        while (true) {
            System.out.print("> ");
            comando = sc.nextLine().trim();

            if (comando.equals("sair")) {
                break;
            } else if (comando.startsWith("visitar ")) {
                String url = comando.substring(8);
                navegador.visitar(url);
            } else if (comando.equals("voltar")) {
                navegador.voltar();
            } else if (comando.equals("avancar")) {
                navegador.avancar();
            } else {
                System.out.println("Comando inválido.");
            }
        }

        sc.close();
    }
}
