public class Lance{

    private double valorLance;
    private Cliente c;
    private Leilao l;
    
    public Lance(double valorLance,Cliente c,Leilao l){
         setValorLance(valorLance);
         
         this.c = c;
         this.l = l;
         
         //c = new Cliente("Inexistente","0",0.0);
         //l = new Leilao("Inexistente","Inexistente",0.0,0,0,0);
   }
   
    public void setValorLance(double valorLance)
    {
        this.valorLance = valorLance;
    }
    public String getC(){
        return c.toString();
    }
    public double getValorLance(){
        return valorLance;
    }
    public String toString(){
        return "Cliente: " + c + "\nLeilão: " + l + "\nValor do Lance: " + valorLance;
    }
}
        