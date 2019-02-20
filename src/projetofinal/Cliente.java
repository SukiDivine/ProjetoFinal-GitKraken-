/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author Kiko
 */
public class Cliente {
    private int testdrives=0;

    public int getTestdrives() {
        return testdrives;
    }

    public void setTestdrives(int testdrives) {
        this.testdrives = testdrives;
    }
    
    //To string
    @Override
    public String toString() {
        return "Cliente{" + "testdrives=" + testdrives + '}';
    }
    
    //equals

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Cliente other = (Cliente) obj;
        if (this.testdrives != other.testdrives) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
