public class Exemplo02 {
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5};

        int index = 0;
        while (index < vetor.length) {
            System.out.println(vetor[index]);
            index++;
        }

        for (int i = 0; i < vetor.length; i++) {
            // System.out.println(vetor[index]);
            System.out.printf("%d\n", vetor[index]);
        }
    }
}
