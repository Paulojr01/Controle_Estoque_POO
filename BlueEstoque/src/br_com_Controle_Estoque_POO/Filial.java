
package br_com_Controle_Estoque_POO;

public class Filial {
    // atributos 
    private String nome_filial; // this.
    private double estoque_filial; // this
    private double qtqEntrada;
    private Textos texto  = new Textos();
    

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


    public void somarEntrada (Double qtd){
        this.setEstoque_filial(this.getEstoque_filial() + qtd );
        System.out.println("\nestoque atualizado  " + this.getNome_filial() + this.getEstoque_filial());

    }

    public void darBaixa(Double qtde){
        if (qtde <= this.getEstoque_filial()){
            this.setEstoque_filial(this.getEstoque_filial() - qtde);
            texto.mostrarConsultaEstoque(this.getNome_filial(), this.getEstoque_filial());
        }      
        else{
          System.out.println("Impossível dar baixa no estoque");
        }
    }



}

}
