/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Bruno
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private double hora;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double hora) {
        this.titulo = titulo;
        this.director = director;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo="
                + titulo + "/n" + ", director="
                + director + "/n" + ", hora="
                + hora + "/n" + '}';
    }
    
    
    
}
