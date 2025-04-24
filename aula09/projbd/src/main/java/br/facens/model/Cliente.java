package br.facens.model;

public class Cliente {
    private int id;
    private String name;
    private String email;

    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.name = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

}
