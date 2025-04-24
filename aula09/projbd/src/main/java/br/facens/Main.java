package br.facens;

import br.facens.dao.ClienteDAO;
import br.facens.model.Cliente;

public class Main {
    public static void main(String[] args) {
        // ClienteDAO.conectBD();

        
        // ClienteDAO.criarTabelaCliente();
        
        
        Cliente c = new Cliente(3, "Amanda", "amanda@facens.br");

        boolean inserido = ClienteDAO.inserir(c);

        if(inserido) {
            System.out.println("Cliente inserido com sucesso");
        } else {
            System.out.println("Erro na inserção");
        }
    }
}