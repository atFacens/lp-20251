import java.util.ArrayList;

public class Exemplo03 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        for (Integer numero : lista) {
            System.out.println(numero);
        }
    }
}
