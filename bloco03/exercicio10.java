package bloco03;
import java.util.*;

//Ordenando Números
//Ordena Numeros

public class exercicio10 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 1, 9, 3, 7, 2, 8, 4, 6, 10));
        Collections.sort(numeros);
        System.out.println("Ordenado: " + numeros);
    }
}
