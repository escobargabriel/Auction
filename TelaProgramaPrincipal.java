import java.util.*;
    public class TelaProgramaPrincipal{
       
        TelaCadastro telaCadastro = new TelaCadastro(); 
        TelaListaLeilao telaListaLeilao = new TelaListaLeilao();
      
        // cliente logado
       Cliente cliente;
        
       
       public void Questionario( Cliente cli ){
           
         this.cliente = cli;
           
        int opcao;
        int opcao2;
        char resposta;
        char resposa2 = 's';
        Scanner sc = new Scanner(System.in);
          
          do{
            
            System.out.println("|                                                     |");
            System.out.println("|   Escolha uma das opções abaixo:                    |");            
            System.out.println("|             [1] para sistema de Leilões.            |");
            System.out.println("|             [2] para cadastro.                      |");
            System.out.println("|             [3] para sair.                          |");
            System.out.println("|                                                     |");
    
        opcao = sc.nextInt();
          if(opcao == 1)
            telaListaLeilao.Questionario(this.cliente);
          if(opcao == 2)
             telaCadastro.Questionario();
            
            }while(opcao<3||opcao>3);
        }
    }
    
