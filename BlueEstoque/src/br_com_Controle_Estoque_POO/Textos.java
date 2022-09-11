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

    public void mostrarConsultaEstoque(String nomeFilial, Double estoque) {
        System.out.println("Estoque em "+ nomeFilial + " -> " + estoque + " kg "); 
    }

    public void mostrarDespedida(){
        System.out.println("Bom dia e um bom trabalho !!! ");
    }

}

