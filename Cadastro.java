import java.util.*;
public class Cadastro {
   private ArrayList<Cliente> lista = new ArrayList<Cliente>();
   private Scanner sc;
   
   private Cliente c = new Cliente("Vendedor","9",0.0);
   private Cliente  c1 = new Cliente("Wagner Moura","1",1500.00);
   private Cliente  c2 = new Cliente("Débora Falabela","2",250.00);
   private Cliente  c3 = new Cliente("Fernanda Torres","3",500.00);
   private Cliente  c4 = new Cliente("Marco Nanini","4",1000.00);
   public Cadastro() {
            sc = new Scanner(System.in);
            lista = new ArrayList<Cliente>();
            lista.add(c);
            lista.add(c1);
            lista.add(c2);
            lista.add(c3);
            lista.add(c4);
        }
         public ArrayList<Cliente> getLista(){
            return lista;
        }
  // public void insereCliente(){
      public void adicionar(){
            int opcao;
            char resposta;
        
            do{
                Cliente cliente =  new Cliente("Inexitente","Inexitente",0.0);
                System.out.println("|                                                     |");
                System.out.println("|              Você escolheu cadastrar um cliente!    |");
                System.out.println("---->Digite o nome do cliente: ");
                cliente.setNome(sc.nextLine());
                System.out.println("----> Digite o código do cliente: ");
                cliente.setCodigo(sc.nextLine());
                System.out.println("----> Digite o Saldo: ");
                cliente.setSaldo(sc.nextDouble());
                lista.add(cliente);
                System.out.println();
                System.out.println("|        Cadastro de produto realizado com sucesso!   |");
                System.out.println("|                                                     |");
    
                sc.nextLine();
                do{
                    System.out.println("----> Deseja cadastrar mais um cliente? (S/N)");
                    resposta = sc.nextLine().charAt(0);
                }while(resposta!='s' && resposta!='n');
            }while(resposta=='s');
        }
      
        public Cliente login(){
            boolean logou = false;
            do{
                System.out.println("Digite o seu código para entrar no sistema: " );
                String cliente = sc.nextLine();
                for(int i=0;i<lista.size();i++) {
                Cliente c = lista.get(i);
                if(c.toString().contains(cliente)){
                    logou = true;
                    // armazena o cliente que logou no sistema
                    return c;
                }
            }
        }while(logou == false);
        
        return null;
    }
      public void consultarCliente() { //método para busca de cliente por nome
            char resposta='n';
            int opcao;
            
            do{
               
            System.out.println("|                                                     |");
            System.out.println("|         Você escolheu procurar um cliente!          |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.print  ("----> Digite o codigo do cliente que deseja procurar: ");
            String cliente = sc.nextLine();
            System.out.println();
            System.out.println("Nome codigo saldo");
            for(int i=0;i<lista.size();i++) {
                Cliente c = lista.get(i);
                if(c.toString().contains(cliente)){
                    System.out.println(c);
                }
            }
    do{
                    System.out.print("----> Deseja procurar mais um cliente? (S/N)");
                    String temp = sc.nextLine();
                    resposta = temp.charAt(0);
                }while(resposta!='s' & resposta!='n');
            
            }while(resposta=='s');
        }
       public void deletarCliente(){
             char resposta='n';
        do{
                 
            System.out.println("|                                                     |");
            System.out.println("|          Você escolheu deletar um cliente!          |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.println(" ---->Digite o nome do cliente que deseja remover: ");
            String nome = sc.nextLine();
            System.out.println();
            for(int i=0;i<lista.size();i++) {
                Cliente c = lista.get(i);
                if(c.getNome().equals(nome)){
                    lista.remove(c);
                    System.out.println(" ----> Cliente deletado com sucesso!               ");
                    
                }
            }
            do{
                System.out.print(" ----> Deseja remover mais um cliente? (S/N)");
                String temp = sc.nextLine();
                resposta = temp.charAt(0);
            }while(resposta!='s' & resposta!='n');
        }while(resposta=='s');
        
    }
    public String toString() {
                String msg = "                Os cliente cadastrados são:\n\n";
                for (Cliente cliente: lista) {
                    msg += "  ";
                    msg += cliente;
                    msg += '\n';
                }
                if(lista.size()==0){
                    return "Nenhum cliente cadastrado!";
                }
                return msg;
            }
        }

    
