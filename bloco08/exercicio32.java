package bloco08;

import java.lang.reflect.Field;

//Modificador de Atributos Privados

class Configuracao {
    private String urlConexao = "localhost:5432";

    @Override
    public String toString() {
        return "Configuracao{urlConexao='" + urlConexao + "'}";
    }
}

public class exercicio32 {
     public static void main(String[] args) {
        try {
            Configuracao config = new Configuracao();

            // Obter a classe e o campo privado
            Class<?> clazz = config.getClass();
            Field campo = clazz.getDeclaredField("urlConexao");

            // Tornar acessível (quebrando encapsulamento)
            campo.setAccessible(true);

            // Exibir valor original
            System.out.println("Antes: " + campo.get(config));

            // Alterar valor do campo privado
            campo.set(config, "db.producao.com:5432");

            // Exibir valor modificado
            System.out.println("Depois: " + campo.get(config));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
