package ar.edu.icsw.wms.service;

import ar.edu.icsw.wms.model.Producto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class InventarioServiceTest {
    
    @Test
    void calculaElStockTotalDeLosProductos() {
        InventarioService service = new InventarioService();
        List<Producto> productos = List.of(
                new Producto("SKU-001", "Mouse", 10),
                new Producto("SKU-002", "Teclado", 5)
        );

        assertEquals(15, service.calcularStockTotal(productos));
    }
    
    @Test
    void productoConStockDevuelveTrue() {
        InventarioService service = new InventarioService();
        Producto producto = new Producto("SKU-003", "Monitor", 5);
        
        assertTrue(service.hayStock(producto));
    }

    @Test
    void productoConStockCeroDevuelveFalse() {
        InventarioService service = new InventarioService();
        Producto producto = new Producto("SKU-004", "Auriculares", 0);
        
        assertFalse(service.hayStock(producto));
    }
}