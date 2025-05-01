package br.facens;

import java.util.Scanner;

import br.facens.dao.ClienteDAO;
import br.facens.model.Cliente;

public class Main {
    public static void main(String[] args) {
        // ClienteDAO.conectBD();

        // ClienteDAO.criarTabelaCliente();

        // Cliente c = new Cliente(3, "Amanda", "amanda@facens.br");

        // boolean inserido = ClienteDAO.inserir(c);

        // if(inserido) {
        // System.out.println("Cliente inserido com sucesso");
        // } else {
        // System.out.println("Erro na inserção");
        // }

        // Cliente cliente = ClienteDAO.buscar(1);
        // if(cliente == null) {
        // System.out.println("Cliente não encontrado");
        // } else {
        // System.out.println(cliente);
        // }

        Scanner scanner = new Scanner(System.in);
        int opcao;
        int id;
        String name, email;
        Cliente cliente;

        do {
            System.out.println("1. Inserir novo cliente");
            System.out.println("2. Buscar um cliente");
            System.out.println("3. Atualizar o cliente");
            System.out.println("4. Apagar um cliente");
            System.out.println("5. sair");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Informe o ID do cliente");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Informe o nome do cliente");
                    name = scanner.nextLine();
                    System.out.println("Informe o email do cliente");
                    email = scanner.nextLine();

                    cliente = new Cliente(id, name, email);
                    if(ClienteDAO.inserir(cliente)) {
                        System.out.println("Clienete inserido com sucesso");
                    } else {
                        System.out.println("Falha na inserção");
                    }

                    break;
                case 2:
                    System.out.println("Qual o id do cliente?");
                    id = Integer.parseInt(scanner.nextLine());

                    cliente = ClienteDAO.buscar(id);

                    if (cliente == null) {
                        System.out.println("Cliente não encontrado");
                    } else {
                        System.out.println(cliente);
                    }
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 5);
        
        scanner.close();
    }
}