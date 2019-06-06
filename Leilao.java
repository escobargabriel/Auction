    import java.util.*;
public class Leilao {
   //private ArrayList<Lance> lista = new ArrayList<Lance>();
   private Scanner sc;
   private String descricao;
   private String vendedor;
   private double lanceMinimo;
   private double maiorLance;
   private Data dataFinal;      
   private ListaLance lista;// = new ListaLance( null);
   private int codigo = -1;
   
   // gerador de codigos
   private static int codGen = 0;
   
   public Leilao(String descricao,String vendedor,double lanceMinimo,int dia,int mes,int ano) {
       
            // gera um novo numero
           this.codigo = codGen++;
       
           maiorLance = lanceMinimo;
           
            setDescricao(descricao);
            setVendedor(vendedor);
            setLanceMinimo(lanceMinimo);
            
            dataFinal = new Data(dia, mes, ano);
            
            /*
            setDia(dia);
            setMes(mes);
            setAno(ano);
            */
            
            sc = new Scanner(System.in);
            
            lista = new ListaLance ( this );
        }
        /*
        public ArrayList<Lance> getList(){
            return lista;
        }
        */
       
        public void setMaiorLance ( double valor )
        {
            this.maiorLance = valor;
        }
        
        public double getMaiorLance ()
        {
            return maiorLance;
        }
        public void adicionaLance (Cliente cli )
        {
           lista.adicionarLance(cli);
        }
       
        public void setVendedor(String vendedor){
            if(vendedor != null)
            this.vendedor = vendedor;
        }
        
        /*
        public void setDia(int dia){
            if(dia > 0 && dia < 32)
            this.dia = dia;
        }
        public void setMes(int mes){
            if(mes > 0 && mes < 13)
            this.mes = mes;
        }
        public void setAno(int ano){
            if(ano > 2000)
            this.ano = ano;
        }
        */
 //       public void setDataFinal(Data dataFinal){
  //          if(dataFinal != null)
   //         this.dataFinal = dataFinal;
   //     }
        public void setDescricao(String descricao){ 
            if(descricao != null)
            this.descricao = descricao;
        }
        
        public int getCodigo()
        {   
            return codigo;
        }
        
        public void setLanceMinimo(double lanceMinimo){
            if(lanceMinimo > 0)
            this.lanceMinimo = lanceMinimo;
        }
        public String getVendedor(){
            return vendedor;
        }
        
        public int getDia(){
            return dataFinal.getDia();
        }
        public int getMes(){
            return dataFinal.getMes();
        }
        public int getAno(){
            return dataFinal.getAno();
        }
        
        public ListaLance getLista ()
        {
            return lista;
        }
        
        public String getDescricao(){
            return descricao;
        }
        public double getLanceMinimo(){
            return lanceMinimo;
        }
    //    public Data getDataFinal(){
        //    return dataFinal;
//        }
        public String toString(){
            return "Dados do Leilão: " + "\n" +
            "Descrição do produto: " + descricao + "\nLance Mínimo: " + lanceMinimo + "\n" +
            "Vendedor: " + vendedor + "\nData final: " + dataFinal.getDia() +"/"+ dataFinal.getMes() +"/"+ dataFinal.getAno();
            
        }
        
        public void simulaDia()
        {
            dataFinal.setDia(dataFinal.getDia ()+1);
        }
    }