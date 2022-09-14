package br_com_Controle_Estoque_POO;

public class Textos {

    
    public Textos() {} // construtor 


    public void mostrarMenuPrincipal()
    {
        System.out.print("O que deseja fazer:\n  1 - Entrada de Estoque\n  2 - Saída de Estoque\n  3 - Transferência de Estoque\n  4 - Consulta Estoque\n  5 - Finalizar\n     Opção -> ");
    }

    public void mostrarInvalida()
    {
        System.out.println("Entrada Inválida");
    }

    public void mostrarQualEmpresa()
    {
           System.out.print(" 1 - Jatiboca\n    2 - Pontal\n   Opção -> ");

    }

    public void mostrarConsultaEstoque(String nomeFilial, Double estoque) 
    {
        System.out.println("Estoque em "+ nomeFilial + " -> " + estoque + " kg "); 
    }

    public void mostrarDespedida()
    {
        System.out.println("Bom dia e um bom trabalho !!! ");
    }

    public void mostrarPerguntaQuantidadeEntrada(String localidade)
    {
        System.out.println("Qual é a quantidade  que deseja da entrada " + localidade + "->" );
    }

    public void mostrarPerguntaQuantidadeRetirar(String localidade)
    {
        System.out.println("Qual a quantidade a ser retirada em  " + localidade + " ? ->");
    }

    public void Transferência (String remetente, String destinatario){
        System.out.println("quantidade transferencia" + remetente + "para" + destinatario);

    }

    public void QualEmpresaTransferencia()
    {
           System.out.print("Qual empresa:\n 1 – Jatiboca -> Pontal \n 2 – Pontal -> Jatiboca\n Opção -> ");
    }
    
    public void transferenciaEmpresa (String localidade1, String localidade2 ){
        System.out.println("Quantidade de transferência de açúcar - " + localidade1 + " para " + localidade2 + " -> ");
    }
}