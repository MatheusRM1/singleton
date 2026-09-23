package org.example;

public class Configuracoes {

    private Configuracoes() {};
    private static Configuracoes instance = new Configuracoes();

    public static Configuracoes getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String endereco;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
