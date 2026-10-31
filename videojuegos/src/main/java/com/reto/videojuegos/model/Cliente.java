package com.reto.videojuegos.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Long id;
    private String nombre;
    private String email;
    private List<ContenidoDigital> juegosPrestados;

    public Cliente() {
        this.juegosPrestados = new ArrayList<>();
    }

    public Cliente(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.juegosPrestados = new ArrayList<>();
    }

    public boolean puedeAlquilar() {
        return this.juegosPrestados.size() < 3;
    }

    public void agregarJuego(ContenidoDigital juego) {
        if (puedeAlquilar()) {
            this.juegosPrestados.add(juego);
        }
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<ContenidoDigital> getJuegosPrestados() { return juegosPrestados; }
    public void setJuegosPrestados(List<ContenidoDigital> juegosPrestados) { this.juegosPrestados = juegosPrestados; }
}