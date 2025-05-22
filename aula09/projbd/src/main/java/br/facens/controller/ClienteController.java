package br.facens.controller;

import br.facens.dao.ClienteDAO;
import br.facens.model.Cliente;

public class ClienteController {
    
    public static boolean inserirCliente(String name, String email) {
        Cliente cliente = new Cliente(0, name, email);
        return ClienteDAO.inserir(cliente);
    }

    public static Cliente buscarPorId(int id) {
        if(id <= 0) return null;
        return ClienteDAO.buscar(id);
    }

    public static boolean atualizarEmail(int id, String email) {
        if(id <= 0 || email.isEmpty()) return false;

        return ClienteDAO.atualizarEmail(id, email);
    }

    public static boolean apagarCliente(int id) {
        if(id <= 0) return false;
        return ClienteDAO.apagar(id);
    }
}
