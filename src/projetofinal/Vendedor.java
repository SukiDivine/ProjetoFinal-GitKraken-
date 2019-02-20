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
public class Vendedor extends Pessoa {
    
    private int testdrives=0;
    private String marca=null;
    private double salario= 0.0;
    private String concessionario= null;
    
    public Vendedor() {
        
       this.testdrives=0;
       this.marca=null;
       this.salario=0.0;
       this.concessionario=null;
       
    }
    
    
    public int getTestdrives()
    {
        return testdrives;
        
    }
    
     public String getMarca()
    {
        return marca;
        
    }
     
     public double getSalario()
    {
        return salario;
        
    }
     
    public String getConcessionario()
    {
        return concessionario;
        
    }
    
     public void setTestdrives(int testdrives)
    {
        this.testdrives=testdrives;
    }
     
      public void setMarca(String marca)
    {
        this.marca=marca;
    }
      
       public void setSalario(double salario)
    {
        this.salario=salario;
    }
      
       public void setConcessionario(String concessionario)
    {
        this.concessionario=concessionario;
    }
    
       
    //To string

    @Override
    public String toString() {
        return "Vendedor{" + "testdrives=" + testdrives + ", marca=" + marca + ", salario=" + salario + ", concessionario=" + concessionario + '}';
    }
    
    //equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.testdrives;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.concessionario);
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
        final Vendedor other = (Vendedor) obj;
        if (this.testdrives != other.testdrives) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.concessionario, other.concessionario)) {
            return false;
        }
        return true;
    }
    
    
    
}
