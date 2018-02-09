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
public class Pelicula extends Contenido{
    private Integer duracion;
    private Double precioPorMinuto;

    @Override
    public Double precio() {
        return duracion * precioPorMinuto;
    }
}
