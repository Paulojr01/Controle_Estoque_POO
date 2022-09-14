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
                           texto.mostrarPerguntaQuantidadeEntrada(empresa1.getNome_filial());
                            qtdMovimentacao = ler.nextDouble();
                            empresa1.somarEntrada(qtdMovimentacao);
                        break;

                        case "2":
                            texto.mostrarPerguntaQuantidadeEntrada(empresa2.getNome_filial());
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
                        texto.mostrarConsultaEstoque(empresa1.getNome_filial(), empresa1.getEstoque_filial());
                        texto.mostrarPerguntaQuantidadeRetirar( empresa1.getNome_filial() );
                            qtdMovimentacao = ler.nextDouble();
                            empresa1.darBaixa(qtdMovimentacao);
                            break;

                        case "2":
                            texto.mostrarConsultaEstoque(empresa2.getNome_filial(), empresa2.getEstoque_filial());
                            texto.mostrarPerguntaQuantidadeRetirar( empresa2.getNome_filial() );
                            qtdMovimentacao = ler.nextDouble();
                            empresa2.darBaixa(qtdMovimentacao);
                         break;   
                         
                         default:
                         texto.mostrarInvalida();
                         break; 
                        
                    }
                    break;
    
                case "3":  // Transferência de Estoque
                    ler = new Scanner(System.in);
                    texto.QualEmpresaTransferencia();
                    opcao = ler.nextLine();

                    switch (opcao){
                        case "1":
                            texto.transferenciaEmpresa(empresa1.getNome_filial(), empresa2.getNome_filial());
                            qtdMovimentacao = ler.nextDouble();
                            if (qtdMovimentacao > empresa1.getEstoque_filial()){

                                System.out.println("Impossível transferir de" + empresa1.getNome_filial() + " para " + empresa2.getNome_filial() + "estoque insuficiente!");
                            }
                            else{
                                empresa1.setEstoque_filial(empresa1.getEstoque_filial() - qtdMovimentacao);
                                empresa2.setEstoque_filial(empresa2.getEstoque_filial() + qtdMovimentacao);
                                System.out.println("Estoque atualizado");
                                texto.mostrarConsultaEstoque(empresa1.getNome_filial(),empresa1.getEstoque_filial());
                                texto.mostrarConsultaEstoque(empresa2.getNome_filial(),empresa2.getEstoque_filial());
                            }

                        break;

                        case "2":
                            texto.transferenciaEmpresa(empresa2.getNome_filial(), empresa1.getNome_filial());
                            qtdMovimentacao = ler.nextDouble();
                            if (qtdMovimentacao > empresa2.getEstoque_filial()){

                            System.out.println("Impossível transferir de" + empresa2.getNome_filial() + " para " + empresa1.getNome_filial() + "estoque insuficiente!");
                        }
                        else{
                            empresa2.setEstoque_filial(empresa2.getEstoque_filial() - qtdMovimentacao);
                            empresa1.setEstoque_filial(empresa1.getEstoque_filial() + qtdMovimentacao);
                            System.out.println("Estoque atualizado");
                            texto.mostrarConsultaEstoque(empresa1.getNome_filial(),empresa1.getEstoque_filial());
                            texto.mostrarConsultaEstoque(empresa2.getNome_filial(),empresa2.getEstoque_filial());
                        }

                        break;

                        default :
                            System.out.println("opção invalida");
                        break;

                    }
                           
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

