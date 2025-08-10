package bloco08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//Framework de Testes Simulado com Anotações

// Anotação personalizada @Teste
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Teste {
}

// Classe de testes
class MinhaClasseDeTeste {
    @Teste
    public void testeSoma() {
        System.out.println("Executando testeSoma: SUCESSO");
    }

    public void metodoComum() {
        System.out.println("Este não é um teste.");
    }

    @Teste
    public void testeLogin() {
        System.out.println("Executando testeLogin: SUCESSO");
    }
}


public class exercicio33 {
    // Método que executa todos os métodos marcados com @Teste
    public static void executarTestes(Object obj) {
        Class<?> clazz = obj.getClass();
        Method[] metodos = clazz.getDeclaredMethods();

        System.out.println("Executando testes marcados com @Teste...\n");

        int testesExecutados = 0;
        for (Method metodo : metodos) {
            if (metodo.isAnnotationPresent(Teste.class)) {
                try {
                    metodo.invoke(obj);
                    testesExecutados++;
                } catch (Exception e) {
                    System.out.println("Erro ao executar " + metodo.getName() + ": " + e.getCause());
                }
            }
        }

        System.out.println("\n" + testesExecutados + " teste(s) executado(s).");
    }

    // Método principal
    public static void main(String[] args) {
        MinhaClasseDeTeste testes = new MinhaClasseDeTeste();
        executarTestes(testes);
    }
}
