/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author peeet
 */
public class Biblioteca {
    private int codigol;
    private String titulo, autor, tematica;
    private String disponibilidad, localizacion;

    public Biblioteca() {
    }

    public Biblioteca(int codigol, String titulo, String autor, String tematica, String disponibilidad, String localizacion) {
        this.codigol = codigol;
        this.titulo = titulo;
        this.autor = autor;
        this.tematica = tematica;
        this.disponibilidad = disponibilidad;
        this.localizacion = localizacion;
    }

    public int getCodigol() {
        return codigol;
    }

    public void setCodigol(int codigol) {
        this.codigol = codigol;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
