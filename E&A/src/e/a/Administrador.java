/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

/**
 *
 * @author ale
 */
public class Administrador {
    protected String contrasennya;
    protected String nomUsuario;
    
    public Administrador(){
        contrasennya="1234";
        nomUsuario="admin";
    }

    public String getContrasennya() {
        return contrasennya;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }
    
    public boolean login(String usuario, String pass){
        boolean bool=false;
        if(nomUsuario.equalsIgnoreCase(usuario) && contrasennya.equalsIgnoreCase(pass))
            bool=true;
        return bool;
    }
    
}
