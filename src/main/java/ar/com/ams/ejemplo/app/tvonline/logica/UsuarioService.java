/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ams.ejemplo.app.tvonline.logica;

import ar.com.ams.ejemplo.app.tvonline.modelo.Usuario;
import java.util.List;

/**
 *
 * @author mdominguez
 */
public interface UsuarioService {
    public void add(Usuario usr);
    public List<Usuario> listar();
}
