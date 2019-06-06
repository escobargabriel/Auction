import java.util.*; 
    public class TelaListaLeilao{
    private ListaLeilao listaLeilao = new ListaLeilao();
    //private ListaLance listaLance;// = new ListaLance();
    //private Leilao leilao;
    private Lance lance;
    
    Data dataAtual = new Data ();
    
    public void Questionario(Cliente cli){
        int opcao;
        int opcao2;
        char resposta;
        char resposa2 = 's';
        Scanner sc = new Scanner(System.in);
        
        do{
            
            System.out.println("|                                                     |");
            System.out.println("|                   SISTEMA DE LEILÕES                |");
            System.out.println("|                                                     |");
            System.out.println("|   Digite:                                           |");              
            System.out.println("|           [1] para visualizar leilões cadastrados   |");
            System.out.println("|           [2] para cadastrar um leilão              |");
            System.out.println("|           [3] para procurar um leilão               |");
            System.out.println("|           [4] para deletar um leilão                |");
            System.out.println("|           [5] para dar lance em um leilão           |");
            System.out.println("|           [6] [**] Simular passagem do dia          |");
            System.out.println("|           [7] Listar leiloes encerrados             |");
            System.out.println("|           [8] Lista leilões em andamento.           |");
            System.out.println("|           [9] para sair.                            |");
            System.out.println("|                                                     |");
         
            opcao = sc.nextInt();
            sc.nextLine();   
         
         if(opcao == 1){
          System.out.println(listaLeilao);
         }
         if(opcao == 2){
             listaLeilao.adicionar();
         }
         if(opcao == 6) // simular dia
         {
             System.out.print(dataAtual);
             dataAtual.setDia(dataAtual.getDia ()+1);
             System.out.print(" " + dataAtual);
             
            //for ( Leilao l : listaLeilao.getLista () )
            //    l.simulaDia();
          }
         if(opcao == 7) // simular dia
         {
             listaLeilao.leilaoEncerrado(dataAtual);
         }
         if(opcao == 8) // simular dia
         {
             listaLeilao.leilaoAndamento(dataAtual);
         }
         if(opcao == 3)
         {
             do
             {
                    System.out.println("Você escolheu procurar um leilão!");
                    System.out.println("");
                    System.out.println("[1] para procurar leilão ");
                    System.out.println("[2] para sair.");
                    opcao2 = sc.nextInt();
                    if(opcao2==1)
                    listaLeilao.consultarLeilao();
                    else
                        System.out.println("Função desabilitada!");
             }
             while(opcao2<2||opcao2>2);
         }
         if(opcao == 4){
                   listaLeilao.deletarLeilao();
                } 
                if(opcao == 5){
                   //listaLance.adicionar();
                   Leilao leilaoSelecionado = listaLeilao.listaLeilao();
                   if ( leilaoSelecionado != null ) 
                   {
                       // agora adiciono o lance
                       leilaoSelecionado.adicionaLance ( cli );
                   }
                }
                }while(opcao != 9);
         }
         
          
    }