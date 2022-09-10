
package br_com_Controle_Estoque_POO;

public class Filial {
    // atributos 
    private String nome_filial; // this.
    private double estoque_filial; // this

    public String getNome_filial() {
        return nome_filial;
    }

    public void setNome_filial(String nome_filial) {
        this.nome_filial = nome_filial; 
    }


    public double getEstoque_filial() {
        return estoque_filial;
    }

    public void setEstoque_filial(double estoque_filial) {
        this.estoque_filial = estoque_filial;
    }

    public Filial (String nome_filial, double estoque_filial) {
        this.nome_filial = nome_filial;
        this.estoque_filial = estoque_filial;
    }


}