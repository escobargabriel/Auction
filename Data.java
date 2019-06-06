import java.util.*;
import static java.lang.Math.*;
public class Data
{
    private GregorianCalendar gc;

    public Data()
    {
        gc = new GregorianCalendar();
    }
    
    public Data(int dia, int mes, int ano)
    {
        gc = new GregorianCalendar(ano, mes - 1, dia);
    }
    public void incData()
    {
        gc.add(Calendar.DAY_OF_MONTH, 1);
    }
    public int getDia()
    {
        return gc.get(Calendar.DAY_OF_MONTH);
    }
    public int getMes()
    {
        return gc.get(Calendar.MONTH) + 1;
    }
    public int getAno()
    {
        return gc.get(Calendar.YEAR);
    }
    public void setDia(int dia)
    {
        int mes = gc.get(GregorianCalendar.MONTH);
		int ano = gc.get(GregorianCalendar.YEAR);
		gc = new GregorianCalendar(ano, mes, dia);
		//gc.setTime(new Date(ano, mes, dia));
    }
    public void setMes(int mes){
        int dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
		int ano = gc.get(GregorianCalendar.YEAR);
		gc = new GregorianCalendar(ano, mes, dia);
    }
    public String toString()
    {
        return String.format("%2d/%2d/%4d", getDia(), getMes(), getAno());
    }
}