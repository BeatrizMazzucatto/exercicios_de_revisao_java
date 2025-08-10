package bloco08;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Inspetor de Classe com Reflection

// Classe para teste
class Produto {
    @SuppressWarnings("unused")
    private int codigo;
    public String nome;
    protected double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    @SuppressWarnings("unused")
    private double calcularImposto() {
        return preco * 0.1;
    }
}

// Classe responsável por inspecionar qualquer objeto
class AnalisadorDeClasse {
    public static void inspecionar(Object obj) {
        Class<?> clazz = obj.getClass();

        // Nome completo da classe
        System.out.println("=== INSPEÇÃO DE CLASSE ===");
        System.out.println("Classe: " + clazz.getName());
        System.out.println("Pacote: " + clazz.getPackage());

        // Atributos (campos), incluindo privados
        System.out.println("\n--- Atributos (incluindo privados) ---");
        Field[] campos = clazz.getDeclaredFields();
        for (Field campo : campos) {
            System.out.println("  " + campo.getName() + " (" + campo.getType().getSimpleName() + ")");
        }

        // Métodos, incluindo privados
        System.out.println("\n--- Métodos (incluindo privados) ---");
        Method[] metodos = clazz.getDeclaredMethods();
        for (Method metodo : metodos) {
            System.out.println("  " + metodo.getName() + "()");
        }
    }
}

public class exercicio31 {
    public static void main(String[] args) {
        Produto p = new Produto(101, "Notebook Gamer", 8500.0);
        AnalisadorDeClasse.inspecionar(p);
    }
}
