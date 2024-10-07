package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        for (Libro l : libros) {
            if (l.getISBN().equals(libro.getISBN())) {
                l.setCantidadDisponible(l.getCantidadDisponible() + libro.getCantidadDisponible());
                l.setDisponible(true);
            }
        }
        libros.add(libro);
    }

    public void mostrarLibrosDisponibles(){
        for(Libro l : libros){
            if (l.isDisponible()){
                l.mostrarInfo();
            }else{
                System.out.println("no hay libros disponibles");
            }
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibros(String titulo){
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null && libro.getCantidadDisponible() > 0) {
            libros.remove(libro);
            System.out.println(titulo + " " + "eliminado");
        }else{
            System.out.println("libro no encontrado");
        }
    }

    public void prestarLibros(String titulo){
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null && libro.isDisponible()){
            libro.prestar();
            System.out.println(titulo + " " + "prestado");
        }
    }

    public void devolverLibro(String titulo){
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null){
            libro.devolver();
            System.out.println(titulo + " " + "devuelto");
        }
    }

    public void mostrarLibroPorTitulo(String titulo){
        Libro encontrado = buscarLibroPorTitulo(titulo);
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
    public void mostrarLibroPorAutor(String autor){
        Libro encontrado = buscarLibroPorAutor(autor);
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }


}

