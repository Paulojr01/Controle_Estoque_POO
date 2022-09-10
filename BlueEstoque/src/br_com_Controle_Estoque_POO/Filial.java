
package br_com_Controle_Estoque_POO;

public class Filial {
    // atributos 
    private String nome_filial; // this.
    private double estoque_filial; // this
    private double qtqEntrada;
    private double soma;

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

    public double getQtqEntrada() {
        return qtqEntrada;
    }

    public void setQtqEntrada(double qtqEntrada) {
        this.qtqEntrada = qtqEntrada + estoque_filial;
    }

    

    public Filial (String nome_filial, double estoque_filial, double qtqEntrada) {
        this.nome_filial = nome_filial;
        this.estoque_filial = estoque_filial;
        this.qtqEntrada = qtqEntrada;
    }


    public Double calcular (){
        return soma =  qtqEntrada + estoque_filial;

    }

    public void darBaixa(int qtde){
        if (qtde <= this.estoque_filial)
            this.estoque_filial -= qtde;
        else
          System.out.println("Impossível dar baixa no estoque");
































}
}