
package GerenciamentoViagem;

//import java.time.LocalDate;

import GerenciamentoAvião.Avião;


public class Viagem 
{
    private String origem;
    private String destino;
    private Avião avião;
    private String data;
    private String hora;
    
    
    
    
    

    public String getOrigem() 
    {
        return origem;
    }

    public void setOrigem(String origem) 
    {
        this.origem = origem;
    }

    public String getDestino() 
    {
        return destino;
    }

    public void setDestino(String destino) 
    {
        this.destino = destino;
    }

    public Avião getAvião() 
    {
        return avião;
    }

    public void setAvião(Avião avião) 
    {
        this.avião = avião;
    }

    public String getData() 
    {
        return data;
    }

    public void setData(String data) 
    {
        this.data = data;
    }

    public String getHora() 
    {
        return hora;
    }

    public void setHora(String hora) 
    {
        this.hora = hora;
    }

    
    
}
