import java.util.Scanner;

import br_com_Controle_Estoque_POO.Filial;
import br_com_Controle_Estoque_POO.Textos;

public class Main {
    public static void main(String[] args)  {

        String opcao = "";
        Textos texto = new Textos();
        Scanner ler = new Scanner(System.in);

        Filial empresa1 = new Filial("Jatiboca", 100);
        Filial empresa2 = new Filial("Pontal", 50);


        do {
            
            texto.mostrarMenuPrincipal();
    
            opcao = ler.next();
    
            switch (opcao) {

                case "1":  //Entrada de Estoque
                           texto.mostrarQualEmpresa();

                case "2":
                // Saída de Estoque
                    break;
    
                case "3":
                // Transferência de Estoque
                    break;  
                

                case "4":// Consulta Estoque
                        texto.mostrarConsultaEstoque(empresa1.getNome_filial(), empresa1.getEstoque_filial());
                        texto.mostrarConsultaEstoque(empresa2.getNome_filial(), empresa2.getEstoque_filial());
                
                    break;
    
                case "5":
                    texto.mostrarDespedida();      

                case "4":
                // Consulta Estoque
                    break;
    
                case "5":
                        texto.mostrarDespedida();
                  break; 
            
                default:
                    texto.mostrarInvalida();
                    break;
            }
        
        } while (  ! opcao.equals("5") ); // diferente com String



        

    }

    
}

}

