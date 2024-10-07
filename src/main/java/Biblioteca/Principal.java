package Biblioteca;

public class Principal {

    public static void main(String[] args) {
        Principal principal= new Principal();
        principal.inicializar();
    }

    public void inicializar(){
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "Fantasía", "12345", 5,true);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Realismo Mágico", "67890", 3,true);

        Biblioteca biblioteca = new Biblioteca("Biblioteca bakan");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibrosDisponibles();
        System.out.println("--------");
        biblioteca.prestarLibros("El Señor de los Anillos");
        biblioteca.mostrarLibrosDisponibles();
        System.out.println("--------");
        biblioteca.devolverLibro("El Señor de los Anillos");
        biblioteca.mostrarLibrosDisponibles();
        System.out.println("--------");
        biblioteca.mostrarLibroPorTitulo("El Señor de los Anillos");
        System.out.println("--------");
        biblioteca.mostrarLibroPorAutor("J.R.R. Tolkien");
        System.out.println("--------");
        biblioteca.eliminarLibros("El Señor de los Anillos");
        biblioteca.mostrarLibrosDisponibles();



    }
}
