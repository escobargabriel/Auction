import java.util.*;
    public class ProgramaPrincipal{
        public static void main(String args[]){

          Cadastro cadastro = new Cadastro();
          TelaProgramaPrincipal telaProgramaPrincipal = new TelaProgramaPrincipal();
           
          Cliente logado = null;
          
          logado = cadastro.login();
          telaProgramaPrincipal.Questionario(logado);
          
          logado = cadastro.login(); 
          telaProgramaPrincipal.Questionario(logado);
       }
                   
    }

    
    
