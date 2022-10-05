/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author ailen
 */
public class Libro {

    private String Usuario;
    private String Contra;
    private String ISBN;
    private String Título;
    private String Autor;
    private int NúmeroDePáginas;

    public Libro() {

    }

    public Libro(String Usuario, String Contra, String ISBN, String Título, String Autor, int NúmeroDePáginas) {
        this.Usuario = Usuario;
        this.Contra = Contra;
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NúmeroDePáginas = NúmeroDePáginas;
    }

    public void setUsario(String Usario) {
        this.Usuario = Usario;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Título = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNúmeroDePáginas(int NúmeroDePáginas) {
        this.NúmeroDePáginas = NúmeroDePáginas;
    }

    public String getUsario() {
        return Usuario;
    }

    public String getContra() {
        return Contra;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Título;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNúmeroDePáginas() {
        return NúmeroDePáginas;
    }

}
