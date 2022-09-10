import java.util.Scanner;

import br_com_Controle_Estoque_POO.Filial;
import br_com_Controle_Estoque_POO.Textos;

public class Main {
    public static void main(String[] args)  {

        String opcao = "";
        double qtdMovimentacao = 0d;
        Textos texto = new Textos();
        Scanner ler = new Scanner(System.in);

        Filial empresa1 = new Filial("Jatiboca", 100, 32);
        Filial empresa2 = new Filial("Pontal", 50, 32);



        do {
            
            texto.mostrarMenuPrincipal();
    
            opcao = ler.next();
    
            switch (opcao) {
                case "1":  //Entrada de Estoque
                    texto.mostrarQualEmpresa();
                    opcao = ler.next();

                    switch (opcao){
                        case "1":
                            System.out.println("Qual é a quantidade  que deseja da entrada "+empresa1.getNome_filial()+"->" );
                            qtdMovimentacao = ler.nextDouble();
                            empresa1.somarEntrada(qtdMovimentacao);
                        break;

                        case "2":
                            System.out.println("Qual é a quantidade  que deseja da entrada "+empresa2.getNome_filial()+" ->" );
                            qtdMovimentacao = ler.nextDouble();
                            empresa2.somarEntrada(qtdMovimentacao);       
                        break;  

                        default:
                            texto.mostrarInvalida();
                        break;  
                     }
                    break;

                    
                case "2":// Saída de Estoque
                    texto.mostrarQualEmpresa();
                    opcao = ler.next();

                    switch (opcao){
                        case "1":
                            System.out.println("quantidade atual->" + empresa1.getEstoque_filial());
                            System.out.print("qual é quantidade a ser retirada ? -> ");
                            qtdMovimentacao = ler.nextDouble();
                            empresa1.darBaixa(qtdMovimentacao);
                            break;

                        case "2":
                            System.out.println("quantidade atual->" + empresa2.getEstoque_filial());
                            System.out.print("qual é quantidade a ser retirada ? -> ");
                            qtdMovimentacao = ler.nextDouble();
                            empresa2.darBaixa(qtdMovimentacao);
                         break;   
                         
                         default:
                         texto.mostrarInvalida();
                         break; 
                        
                    }
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
                    break; 
            
                default:
                    texto.mostrarInvalida();
                    break;
            }
        
        } while (  ! opcao.equals("5") ); // diferente com String


        ler.close();
        
}

}