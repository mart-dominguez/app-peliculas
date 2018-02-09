/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ams.ejemplo.app.tvonline.logica;

import ar.com.ams.ejemplo.app.tvonline.modelo.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mdominguez
 */
@Stateless
@Named
public class UsuarioServiceDefault implements UsuarioService{

    @PersistenceContext(unitName = "APP_TV_PU")
    private EntityManager em;
    
    
    @Override
    public void add(Usuario usr) {
        em.persist(usr);
    }

    @Override
    public List<Usuario> listar() {
        return em.createQuery("SELECT u FROM Usuario u").getResultList();
    }
    
}
