package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorPelicula gestor = new GestorPelicula();

        // Crear películas
        Pelicula p1 = new Pelicula(1, "Matrix", true);
        Pelicula p2 = new Pelicula(2, "Titanic", false);
        Pelicula p3 = new Pelicula(3, "Inception", false);

        // Agregar películas
        gestor.agregarPelicula(p1);
        gestor.agregarPelicula(p2);
        gestor.agregarPelicula(p3);

        // Eliminar una película
        gestor.eliminarPelicula(1); // Elimina "Matrix"

        // Marcar "Titanic" como disponible
        gestor.marcarPeliculaComoDisponible(2);

        // Mostrar películas no disponibles
        System.out.println("Películas NO disponibles:");
        List<Pelicula> noDisponibles = gestor.obtenerPeliculasNoDisponibles();
        for (Pelicula p : noDisponibles) {
            System.out.println(p);
        }

        // Mostrar todas las películas
        System.out.println("\nTodas las películas:");
        for (Pelicula p : gestor.obtenerPeliculas()) {
            System.out.println(p);
        }
    }
}
