package br.facens.controller;

import br.facens.dao.ClienteDAO;
import br.facens.model.Cliente;

public class ClienteController {
    
    public static boolean inserirCliente(String name, String email) {
        Cliente cliente = new Cliente(0, name, email);
        return ClienteDAO.inserir(cliente);
    }

}
