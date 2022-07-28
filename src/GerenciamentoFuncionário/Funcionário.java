
package GerenciamentoFuncionário;

public class Funcionário 
{
    private String nome;
    private String cpf;
    private String função;
    private Double salário;
    private Double comissão;
    private int nvoos;

    
    
    
    
    
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public String getFunção() 
    {
        return função;
    }

    public void setFunção(String função) 
    {
        this.função = função;
    }

    public Double getSalário() 
    {
        return salário;
    }

    public void setSalário(Double salário)
    {
        this.salário = salário;
    }

    public Double getComissão()
    {
        return comissão;
    }

    public void setComissão(Double comissão) 
    {
        this.comissão = comissão;
    }

    public int getNvoos() 
    {
        return nvoos;
    }

    public void setNvoos(int nvoos) 
    {
        this.nvoos = nvoos;
    }
    
}
