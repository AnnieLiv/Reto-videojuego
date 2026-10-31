package com.reto.videojuegos.model;

public class JuegoFisico extends ContenidoDigital {
    private double pesoGramos;

    public JuegoFisico() {
        super();
    }

    public JuegoFisico(Long id, String titulo, int anioLanzamiento, double precioBase, boolean disponible, double pesoGramos) {
        super(id, titulo, anioLanzamiento, precioBase, disponible);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularPrecioRenta(int dias) {
        return (getPrecioBase() * dias) + 2.00;
    }

    public double getPesoGramos() { return pesoGramos; }
    public void setPesoGramos(double pesoGramos) { this.pesoGramos = pesoGramos; }
}