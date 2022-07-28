
package GerenciamentoAvião;

import GerenciamentoCliente.Cliente;
import GerenciamentoFuncionário.Funcionário;
import java.util.ArrayList;

public class Avião 
{
    private String marca;
    private String empresa; 
    private String nserie;
    private Funcionário piloto;
    private Funcionário copiloto;
    ArrayList<Funcionário> comissários = new ArrayList();
    ArrayList<Cliente> clientes = new ArrayList();
    private int aclasse;
    private int exclasse;
    private int ecclasse;
    private int capacidade;
    
    
    
    
    
    
    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getEmpresa() 
    {
        return empresa;
    }

    public void setEmpresa(String empresa) 
    {
        this.empresa = empresa;
    }

    public String getNserie() 
    {
        return nserie;
    }

    public void setNserie(String nserie) 
    {
        this.nserie = nserie;
    }

    public Funcionário getPiloto() 
    {
        return piloto;
    }

    public void setPiloto(Funcionário piloto) 
    {
        this.piloto = piloto;
    }

    public Funcionário getCopiloto() 
    {
        return copiloto;
    }

    public void setCopiloto(Funcionário copiloto) 
    {
        this.copiloto = copiloto;
    }

    public ArrayList<Funcionário> getComissários() 
    {
        return comissários;
    }

    public void setComissários(ArrayList<Funcionário> comissários) 
    {
        this.comissários = comissários;
    }

    public ArrayList<Cliente> getClientes() 
    {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) 
    {
        this.clientes = clientes;
    }

    public int getAclasse() 
    {
        return aclasse;
    }

    public void setAclasse(int aclasse) 
    {
        this.aclasse = aclasse;
    }

    public int getExclasse() 
    {
        return exclasse;
    }

    public void setExclasse(int exclasse) 
    {
        this.exclasse = exclasse;
    }

    public int getEcclasse() 
    {
        return ecclasse;
    }

    public void setEcclasse(int ecclasse) 
    {
        this.ecclasse = ecclasse;
    }

    public int getCapacidade() 
    {
        return capacidade;
    }

    public void setCapacidade(int capacidade) 
    {
        this.capacidade = capacidade;
    }
    
}
