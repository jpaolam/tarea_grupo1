/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareaprog_peliculas_grupo1;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Jessie Gaboriell
 */
public class Peliculas {

    /**
     * @return the nombre
     */
    public SimpleStringProperty getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(SimpleStringProperty nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the genero
     */
    public SimpleStringProperty getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(SimpleStringProperty genero) {
        this.genero = genero;
    }

    /**
     * @return the rating
     */
    public SimpleStringProperty getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(SimpleStringProperty rating) {
        this.rating = rating;
    }

    /**
     * @return the duracion
     */
    public SimpleStringProperty getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(SimpleStringProperty duracion) {
        this.duracion = duracion;
    }
    public Peliculas(){
        this.nombre = new SimpleStringProperty("");
        this.genero = new SimpleStringProperty("");
        this.rating = new SimpleStringProperty("");
        this.duracion = new SimpleStringProperty("");
    }
    private SimpleStringProperty nombre;
    private SimpleStringProperty genero;
    private SimpleStringProperty rating;
    private SimpleStringProperty duracion;
    
}
