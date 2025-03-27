
public class ContaBancaria {
    private int numero;
    double saldo;

    public ContaBancaria() {
        numero = (int) (Math.random() * 1000);
    }

    public int getNumero() {
        return numero;
    }
}