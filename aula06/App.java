public class App {

    public static void main(String[] args) {
        ContaBancaria conta;
        double valor;

        conta = new ContaBancaria();

        // conta.numero = 123;
        // conta.saldo = 10_000;

        System.out.println(conta.getNumero());
        System.out.println(conta.saldo);

        // System.out.println(valor);
    }
}
