/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ams.ejemplo.app.tvonline.modelo;

/**
 *
 * @author mdominguez
 */
public class Serie extends Contenido{

    private Integer capitulos;
    private Double costoPorCapitulo;

    @Override
    public Double precio() {
        return capitulos * costoPorCapitulo;
    }
    
    
}
