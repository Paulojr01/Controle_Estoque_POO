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


}
