package bloco04;
import java.util.*;

//Removendo Duplicatas

public class exercicio13 {
    public static void main(String[] args) {
        ArrayList<Integer> comDuplicatas = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4));
        Set<Integer> semDuplicatas = new HashSet<>(comDuplicatas);
        System.out.println("Sem duplicatas: " + semDuplicatas);
    }
}
