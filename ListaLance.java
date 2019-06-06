    import java.util.*;
    public class ListaLance{
    
    // lista de lances 
    private ArrayList<Lance> lista  = new ArrayList<Lance>();
    private Scanner sc;
    
    private Leilao leilao;
    
    public ListaLance(Leilao leilao){
        
        this.leilao = leilao;
        //leilao = new Leilao("Inexistente","Inexistente",0.0,0,0,0);
        lista = new ArrayList<Lance>();
        sc = new Scanner(System.in);
    }
    
    public ArrayList<Lance> getLista()
    {
        return lista;
    }
    
    public void adicionarLance( Cliente cli ){
            int opcao;
            
            String continuar = "";
            
            do{
                System.out.println("|                                                     |");
                System.out.println("|              Você escolheu dar um lance!            |");
                //String nome = sc.nextLine(); 
                //for(int i=0;i<lista.size();i++);
                //if(cliente.ToString().countains(nome);
                
                System.out.println("----> Digite o valor do lance : ");
                double valorLance = sc.nextDouble();
                
                Data dataAtual = new Data ();
                
                if (  valorLance  >= leilao.getLanceMinimo () )
                {
                    if ( valorLance > leilao.getMaiorLance () )
                        leilao.setMaiorLance ( valorLance );
                        
                    // isntancia um lance
                    Lance lance = new Lance (valorLance, cli, leilao);
                    lista.add(lance);
                    System.out.println();
                    System.out.println("|        Cadastro de lance realizado com sucesso!    |");
                    System.out.println("|                                                    |");
                }
                else
                {
                    System.out.println("Valor do lance abaixo do mínimo [ R$:"+leilao.getLanceMinimo ()+" ] !");
                }
                
                sc.nextLine();
                
                System.out.println("----> Deseja cadastrar mais um lance? (S/N)");

                continuar = sc.nextLine();
                
            }while(continuar.equalsIgnoreCase("s"));
        }
}