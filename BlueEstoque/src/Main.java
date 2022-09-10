import java.util.Scanner;

import br_com_Controle_Estoque_POO.Textos;

public class Main {
    public static void main(String[] args)  {
        String opcao = "";
        Textos texto = new Textos();
        Scanner ler = new Scanner(System.in);

        do {
            
        
            texto.mostrarMenuPrincipal();
    
            opcao = ler.next();
    
            switch (opcao) {
                case "1":
                    //Entrada de Estoque
                    break;
    
                case "2":
                // Saída de Estoque
                    break;
    
                case "3":
                // Transferência de Estoque
                    break;
                
                case "4":
                // Consulta Estoque
                    break;
    
                case "5":
                // Finalizar
                    break;
            
                default:
                    texto.mostrarInvalida();
                    break;
            }
        
        } while (  ! opcao.equals("5") ); // diferente com String

        

    }
}
