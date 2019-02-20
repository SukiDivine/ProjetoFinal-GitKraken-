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
public class Pessoa {
    private String nome=null;
    private String morada=null;
    private int numero=0;
    
    public Pessoa() {
        
       this.nome=null;
       this.morada=null;
       this.numero=0;   
    }

    public Pessoa(String nome, String morada, int numero) {
        this.nome = nome;
        this.morada = morada;
        this.numero = numero;
    }
    
    
//getters e setters
    
    public String getNome()
    {
        return nome;
        
    }
    
    public String getMorada()
    {
        return morada;
        
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    
    public void setMorada(String morada)
    {
        this.morada=morada;
    }
    
    public void setNumero(int numero)
    {
        this.numero=numero;
    }
    
    //To string

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", morada=" + morada + ", numero=" + numero + '}';
    }
    
    //Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.morada);
        hash = 23 * hash + this.numero;
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.morada, other.morada)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    
    
    
}
