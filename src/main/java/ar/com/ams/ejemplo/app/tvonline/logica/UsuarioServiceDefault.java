/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ams.ejemplo.app.tvonline.logica;

import ar.com.ams.ejemplo.app.tvonline.modelo.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author mdominguez
 */
@Stateless
public class UsuarioServiceDefault implements UsuarioService{

    private EntityManager em;
    
    
    @Override
    public void add(Usuario usr) {
        em.persist(usr);
    }
    
}
