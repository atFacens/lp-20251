public class EstruturaIf {

    public static void main(String[] args) {
        int idade = 18;
        String resposta;

        // if (idade >= 18) {
        //     resposta = "Maior de idade";
        // } else {
        //     resposta = "Menor de idade";
        // }

        resposta = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        // resposta = (idade >= 18) ? "Maior de idade" : (idade < 12) ? "criança": "jovem";

        System.out.println(resposta);
    }
}