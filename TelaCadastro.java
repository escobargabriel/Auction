import java.util.*; 
    public class TelaCadastro{
    private Cadastro lista = new Cadastro();
    private Cliente Cliente;
    
    public void Questionario(){
        int opcao;
        int opcao2;
        char resposta;
        char resposa2 = 's';
        Scanner sc = new Scanner(System.in);
        do{
            
            System.out.println("|                                                     |");
            System.out.println("|                   SISTEMA DE CADASTRO               |");
            System.out.println("|                                                     |");
            System.out.println("|   Digite:                                           |");              
            System.out.println("|           [1] para visualizar clientes cadastrados  |");
            System.out.println("|           [2] adicionar um novo cliente             |");
            System.out.println("|           [3] para procurar um cliente               |");
            System.out.println("|           [4] deletar um cliente                    |");
            System.out.println("|           [5] para sair.                            |");
            System.out.println("|                                                     |");
         
            opcao = sc.nextInt();
            sc.nextLine();   
         
         if(opcao == 1){
          System.out.println(lista);
         }
         if (opcao == 2){
                lista.adicionar();
         }
         if(opcao == 3){
             do{
                    System.out.println("Você escolheu procurar um cliente!");
                    System.out.println("");
                    System.out.println("[1] para procurar cliente ");
                    System.out.println("[2] para sair.");
                    opcao2 = sc.nextInt();
                    if(opcao2==1)
                    lista.consultarCliente();
                    else
                        System.out.println("Função desabilitada!");
                    }while(opcao2<2||opcao2>2);
                }
               if(opcao == 4){
                   lista.deletarCliente();
                }   
                }while(opcao<5|opcao>5);
         }
    }