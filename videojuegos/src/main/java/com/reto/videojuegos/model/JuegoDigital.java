package com.reto.videojuegos.model;

public class JuegoDigital extends ContenidoDigital {
    private double tamanioGB;

    public JuegoDigital() {
        super();
    }

    public JuegoDigital(Long id, String titulo, int anioLanzamiento, double precioBase, boolean disponible, double tamanioGB) {
        super(id, titulo, anioLanzamiento, precioBase, disponible);
        this.tamanioGB = tamanioGB;
    }

    @Override
    public double calcularPrecioRenta(int dias) {
        double total = getPrecioBase() * dias;
        if (this.tamanioGB > 50) {
            total = total * 0.90;  
        }
        return total;
    }

    public double getTamanioGB() { return tamanioGB; }
    public void setTamanioGB(double tamanioGB) { this.tamanioGB = tamanioGB; }
}