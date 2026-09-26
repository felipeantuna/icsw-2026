package ar.edu.icsw.wms.service;

import ar.edu.icsw.wms.model.Producto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
