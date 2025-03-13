public class ComandoSwitch {
    public static void main(String[] args) {
        int cmd = 2;

        switch (cmd) {
            case 1:
                System.out.println("Item do menu 1");
                break;
            case 2:
                System.out.println("Item do menu 2");
                break;
            case 3:
                System.out.println("Item do menu 3");
                break;
            default:
                System.out.println("Comando inválido!");
        }
        System.out.println("Final");

        String nome = "Emerson";

        switch (nome) {
            case "Emerson":
                System.out.println("Item do menu 1");
                break;
            case "Paduan":
                System.out.println("Item do menu 2");
                break;
            case "Outro":
                System.out.println("Item do menu 3");
                break;
            default:
                System.out.println("Comando inválido!");
        }
    }
}
