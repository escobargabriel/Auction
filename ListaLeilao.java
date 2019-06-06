import java.util.*;    
    public class ListaLeilao{
        private ArrayList<Leilao> lista = new ArrayList<Leilao>();
        private Scanner sc;
        
        private Leilao l1 = new Leilao("Perfume","Fernanda Torres",100.00,29,11,2007);
        private Leilao l2 = new Leilao("Notebook","Marco Nanini",3000.00,30,11,2007);
        private Leilao l3 = new Leilao("Hd Sata 250gb","Marco Nanini",100.00,30,11,2007);
        private Leilao l4 = new Leilao("Vestido","Débora Falabella",500.00,01,12,2007);
        private Leilao l5 = new Leilao("Roupa preta","Wagner Moura",5000.00,05,12,2007);
        
        public ListaLeilao(){
            lista = new ArrayList<Leilao>();
            sc = new Scanner(System.in);
            lista.add(l1);
            lista.add(l2);
            lista.add(l3);
            lista.add(l4);
            lista.add(l5);
         }
        public ArrayList<Leilao> getLista(){
            return lista;
        }
        public void leilaoAndamento(Data atual)
        {
            for(Leilao l : lista)
            {
                boolean encerrou = false;
                
                if ( l.getMes() < atual.getMes () )
                    encerrou = true; 
                else if ( l.getMes() ==  atual.getMes () )
                {
                     if ( l.getDia() < atual.getDia () )
                     encerrou = true;
                }
                     
                if ( ! encerrou )
                  System.out.println("Leilao em andamento:"+l.getDescricao());
            }
        }
        public void leilaoEncerrado(Data atual)
        {
            for(Leilao l : lista)
            {
                boolean encerrou = false;
                
                if ( l.getMes() < atual.getMes () )
                    encerrou = true; 
                else if ( l.getMes() ==  atual.getMes () )
                {
                     if ( l.getDia() < atual.getDia () )
                     encerrou = true;
                }
                     
                if ( encerrou )
                {
                   System.out.println("Leilao encerrado:"+l.toString());
                   listaLance(l);
                }
            }
        }
            
       public void listaLance(Leilao leilao)
       {
           //for(Leilao leilao : lista)
           {
               ListaLance lista = leilao.getLista(); 
               for(Lance lance : lista.getLista() )
               {
                   System.out.println("\tLance dado:"+lance.getValorLance());
               }
           }
      }
      
        public void adicionar(){
            int opcao;
            char resposta;
            
            Leilao leilao;
        
            do{
                //leilao =  new Leilao("Inexitente","Inexistente",0.0,0,0,0);
                System.out.println("|                                                     |");
                System.out.println("|              Você escolheu cadastrar um cliente!    |");
                System.out.println("---->Digite a descrição do produto: ");
                String descricao = sc.nextLine();
                System.out.println("----> Digite o nome do vendedor: ");
                String nomeVendedor = sc.nextLine();
                System.out.println("----> Digite o valor do lance mínimo: ");
                double lanceMinimo = sc.nextDouble();
                System.out.println("Digite o dia da data final: ");
                int dia = sc.nextInt();
                System.out.println("Digite o mes da data final: ");
                int mes = sc.nextInt();
                System.out.println("Digite o ano da data final: ");
                int ano = sc.nextInt();
                
                leilao =  new Leilao (descricao, nomeVendedor, lanceMinimo, dia, mes, ano);
                
                lista.add(leilao);
                System.out.println();
                System.out.println("|        Cadastro de leilão realizado com sucesso!    |");
                System.out.println("|                                                     |");
    
                sc.nextLine();
                do{
                    System.out.println("----> Deseja cadastrar mais um leilão? (S/N)");
                    resposta = sc.nextLine().charAt(0);
                }while(resposta!='s' && resposta!='n');
            }while(resposta=='s');
        }
        
        public Leilao listaLeilao()
        {
            for ( Leilao l : lista )
            {
                System.out.println("[ " + l.getCodigo() + " ] " + l.getDescricao());
            }
            
            System.out.println("Escolha um leilão:");
            
            int opcao = sc.nextInt();
            Leilao leilaoSelecionado = null;
            for ( Leilao l : lista )
                if (l.getCodigo()==opcao)
                    leilaoSelecionado = l;
                
            return leilaoSelecionado;
        }
        
        public boolean leilaoTerminado ()
        {
            
            
            return false;
        }
        
        public void consultarLeilao() { //método para busca de leilão por nome
            char resposta='n';
            int opcao;
            
            do{
               
            System.out.println("|                                                     |");
            System.out.println("|         Você escolheu procurar um Leilão !          |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.print  ("----> Digite o nome do vendedor que deseja procurar: ");
            String leilao = sc.nextLine();
            System.out.println();
            System.out.println("Nome codigo saldo");
            for(int i=0;i<lista.size();i++) {
                Leilao l = lista.get(i);
                if(l.toString().contains(leilao)){
                    
                    System.out.println(l);
                }
            }
            do{
                    System.out.print("----> Deseja procurar mais um leilão? (S/N)");
                    String temp = sc.nextLine();
                    resposta = temp.charAt(0);
                }while(resposta!='s' & resposta!='n');
            
            }while(resposta=='s');
        }
    public void deletarLeilao(){
             char resposta='n';
        do{
                 
            System.out.println("|                                                     |");
            System.out.println("|          Você escolheu deletar um Leilão!           |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.println(" ---->Digite o nome do vendedor do leilão que deseja remover: ");
            String nome = sc.nextLine();
            System.out.println();
            for(int i=0;i<lista.size();i++) {
                Leilao l = lista.get(i);
                if(l.getVendedor().equals(nome)){
                    lista.remove(l);
                    System.out.println(" ----> Leilão deletado com sucesso!               ");
                }
            }
            do{
                System.out.print(" ----> Deseja remover mais um Leilão? (S/N)");
                String temp = sc.nextLine();
                resposta = temp.charAt(0);
            }while(resposta!='s' & resposta!='n');
        }while(resposta=='s');

    }
    public String toString() {
                String msg = "                Os Leilões cadastrados são:\n\n";
                for (Leilao leilao: lista) {
                    msg += "  ";
                    msg += leilao;
                    msg += '\n';
                }
                if(lista.size()==0){
                    return "Nenhum Leilão cadastrado!";
                }
                return msg;
            }
        }
