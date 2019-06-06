public class Cliente{
    private String nome,codigo;
     
    private double saldo;
    public Cliente(String nome,String codigo,double saldo){
        setNome(nome);
        setCodigo(codigo);
        setSaldo(saldo);
    }
    public void setNome(String nome){
        if(nome != null)
        this.nome = nome;
    }
    
    public void setCodigo(String codigo){
     this.codigo = codigo;
    }
    public void setSaldo(double saldo){
        if(saldo > 0)
        this.saldo = saldo;
    }
    public String getNome(){
        return nome;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public String toString(){
        return "nome: " + nome +"\nCódigo: " + codigo + "\nSaldo: " + saldo;
    }
}
        
    