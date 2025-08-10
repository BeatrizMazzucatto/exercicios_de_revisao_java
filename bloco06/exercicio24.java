package bloco06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Fila de Impressão (Queue)
// Fila de Impressao

public class exercicio24 {
    public static void main(String[] args) {
        // Criando a fila de impressão
        Queue<String> filaImpressao = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Fila de Impressão ===");
        
        // Adicionando 5 documentos
        String[] documentos = {
            "Documento1.pdf",
            "Foto.png",
            "Planilha.xlsx",
            "Apresentacao.ppt",
            "Relatorio.doc"
        };

        for (String doc : documentos) {
            filaImpressao.offer(doc); // ou add()
            System.out.println("Adicionado à fila: " + doc);
        }

        System.out.println("\nProcessando impressões...");
        
        // Processar a fila (imprimir e remover)
        while (!filaImpressao.isEmpty()) {
            String documento = filaImpressao.poll(); // remove o primeiro da fila
            System.out.println("🖨️  Imprimindo: " + documento);
        }

        System.out.println("Todos os documentos foram impressos.");
        
        sc.close();
    }
}
