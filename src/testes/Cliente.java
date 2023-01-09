package testes;

import java.util.Collection;

public class Cliente {

    private int id;

    private int numero;

    private String nome;

    private String cnpj;

    private String cpf;

    private Collection<Pedido> pedidos;

    private Collection<Endereco> endereco;

    public Cliente() {
    }

    public Cliente(int id, int numero, String nome, String cnpj, String cpf, Collection<Pedido> pedidos, Collection<Endereco> endereco) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.pedidos = pedidos;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Collection<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Collection<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Collection<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(Collection<Endereco> endereco) {
        this.endereco = endereco;
    }

}
