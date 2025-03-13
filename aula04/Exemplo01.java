public class Exemplo01 {

    public static void main(String[] args) {

        // 1. inicialização
        // 2. ponto de parada
        // 3. passo ou incremento

        int cont = 0;

        while (cont < 5) { // enquanto
            System.out.println(cont);
            cont++;
        }

        for (int cont2 = 0; cont2 < 5; cont2++) {
            System.out.println(cont2);
        }

        String entrada = "";
        while (!entrada.equals("sair") ) {
            
        }

        for (; !entrada.equals("sair"); ) {
            
        }

        System.out.println("Digite seu nome:");
        entrada = "";
        while (entrada.length() == 0) {
            System.out.println("Digite seu nome:");
            entrada = "";
            
        }

        do {
            System.out.println("Digite seu nome:");
            entrada = "";
        } while (entrada.length() == 0);

    }
}