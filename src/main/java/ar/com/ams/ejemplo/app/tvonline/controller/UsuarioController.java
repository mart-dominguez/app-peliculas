/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ams.ejemplo.app.tvonline.controller;

import ar.com.ams.ejemplo.app.tvonline.logica.UsuarioService;
import ar.com.ams.ejemplo.app.tvonline.modelo.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author mdominguez
 */
@Named("usrCtrl")
@ViewScoped
public class UsuarioController implements Serializable{
    private List<Usuario> usuarios;
    private Usuario seleccionado;
    
    @Inject
    UsuarioService usrSrv;
    
    @PostConstruct
    public void init(){
        this.seleccionado = new Usuario();
        this.usuarios = usrSrv.listar();
    }

    public String crear(){
        usrSrv.add(seleccionado);
        this.recargarLista();        
        return null;
    }
    
    public void recargarLista(){
        this.usuarios = usrSrv.listar();
    }
 
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Usuario seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
    
}
