package ar.edu.icsw.wms.service;

import ar.edu.icsw.wms.model.Producto;

import java.util.List;

public class InventarioService {
    public int calcularStockTotal(List<Producto> productos) {
        return productos.stream()
                .mapToInt(Producto::stock)
                .sum();
    }
    
    public boolean hayStock(Producto producto) {
        return producto.stock() > 0;
}

}
