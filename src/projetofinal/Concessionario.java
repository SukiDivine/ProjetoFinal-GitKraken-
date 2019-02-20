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
public class Concessionario {
    private String marca=null;
    private String distrito=null;
    private String vendedores= null;
    private String compradores= null;
    private String carrosexistentes= null; 
    
    
    public Concessionario() {
        
       this.marca=null;
       this.distrito=null;
       this.vendedores=null;
       this.compradores=null;
       this.carrosexistentes=null;
   
    }

    public Concessionario(String marca, String distrito, String vendedores, String compradores, String carrosexistentes) {
        this.marca = marca;
        this.distrito = distrito;
        this.vendedores = vendedores;
        this.compradores = compradores;
        this.carrosexistentes = carrosexistentes;
    }
    
    //getters e setters
    
    public String getMarca()
    {
        return marca;
        
    }
    
    public String getDistrito()
    {
        return distrito;
        
    }
    
    public String getVendedores()
    {
        return vendedores;
    }
    
    public String getCompradores()
    {
        return compradores;
    }
    
    public String getCarros()
    {
        return carrosexistentes;
    }
    
     public void setMarca(String marca)
    {
        this.marca=marca;
    }
    
    public void setDistrito(String distrito)
    {
        this.distrito=distrito;
    }
    
    public void setVendedores(String vendedores)
    {
        this.vendedores=vendedores;
    }
    
    public void setCompradores(String compradores)
    {
        this.compradores=compradores;
    }
    
    public void setCarrosexistentes(String carrosexistentes)
    {
        this.carrosexistentes=carrosexistentes;
    }
    
    
    //tostring
    @Override
    public String toString() {
        return "concessionario{" + "marca=" + marca + ", distrito=" + distrito + ", vendedores=" + vendedores + ", compradores=" + compradores + ", carrosexistentes=" + carrosexistentes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.marca);
        hash = 59 * hash + Objects.hashCode(this.distrito);
        return hash;
    }
    
    //equals

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Concessionario other = (Concessionario) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.distrito, other.distrito)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
