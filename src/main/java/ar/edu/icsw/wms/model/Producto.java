package ar.edu.icsw.wms.model;

public record Producto(String codigo, String nombre, int stock) {
    public Producto {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El codigo del producto es obligatorio");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del producto es obligatorio");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
    }
}
