/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.Objects;

/**
 *
 * @author Kiko
 */
public class Carro {
    private String marca=null;
    private String matricula=null;
    private String concessionario=null;
    private int potencia=0;
    private double preco =0.0;
    private String cor=null;
    private int numPortas=0;
    
    
    public Carro() {
        
       this.marca=null;
       this.matricula=null;
       this.concessionario=null;
       this.potencia=0;
       this.preco=0.0;
       this.cor=null;
       this.numPortas=0;
   
    }

    public Carro(String marca, String matricula, String concessionario, int potencia, double preco, String cor, int numPortas ) {
        this.marca = marca;
        this.matricula = matricula;
        this.concessionario = concessionario;
        this.potencia = potencia;
        this.preco=preco;
        this.cor = cor;
        this.numPortas = numPortas;
    }
    
    //getters e setters
    
    public String getMarca()
    {
        return marca;
        
    }
    
    public String getMatricula()
    {
        return matricula;
        
    }
    
    public String getConcessionario()
    {
        return concessionario;
    }
    
    public int getPotencia()
    {
        return potencia;
    }
    
     public double getPreco()
    {
        return preco;
    }
    
    public String getCor()
    {
        return cor;
    }
    
    public int getnumPortas()
    {
        return numPortas;
    }
    
   
    
     public void setMarca(String marca)
    {
        this.marca=marca;
    }
    
    public void setMatricula(String matricula)
    {
        this.matricula=matricula;
    }
    
    public void setConcessionario(String concessionario)
    {
        this.concessionario=concessionario;
    }
    
    public void setPotencia(int potencia)
    {
        this.potencia=potencia;
    }
    
    public void setPreco(double preco)
    {
        this.preco=preco;
    }
    
    public void setCor(String cor)
    {
        this.cor=cor;
    }
    
     public void setnumPortas(int numPortas)
    {
        this.numPortas=numPortas;
    }
     
     //tostring
    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", matricula=" + matricula + ", concessionario=" + concessionario + ", potencia=" + potencia + ", preco=" + preco + ", cor=" + cor + ", numPortas=" + numPortas + '}';
    }
     
    //equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.marca);
        hash = 97 * hash + Objects.hashCode(this.matricula);
        hash = 97 * hash + Objects.hashCode(this.cor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        return true;
    }
    
}
