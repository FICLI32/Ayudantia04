package Biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private String ISBN;
    private int cantidadDisponible;
    private boolean disponible;

    public Libro (String titulo, String autor, String genero, String ISBN, int cantidadDisponible, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ISBN = ISBN;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = disponible;
    }

    //geters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getGenero(){
        return genero;
    }

    public String getISBN(){
        return ISBN;
    }

    public int getCantidadDisponible(){
        return cantidadDisponible;
    }

    public boolean isDisponible(){
        return disponible;
    }

    //seters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //metodos
    public void prestar(){
        if (cantidadDisponible > 0){
            cantidadDisponible --;
            if (cantidadDisponible == 0){
                disponible = false;
            }
        }else{
            System.out.println("libro no disponible");
        }
    }

    public void devolver(){
        cantidadDisponible++;
        if (cantidadDisponible >0) {
            disponible = true;
        }
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Género: " + genero + ", ISBN: " + ISBN + ", Cantidad disponible: " + cantidadDisponible + ", Disponible: " + disponible);
    }
}

