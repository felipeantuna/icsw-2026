package ar.edu.icsw.wms;

import ar.edu.icsw.wms.model.Producto;
import ar.edu.icsw.wms.service.InventarioService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = List.of(
                new Producto("SKU-001", "Mouse inalambrico", 12),
                new Producto("SKU-002", "Teclado inalambrico", 3),
                new Producto("SKU-003", "Monitor 24 pulgadas", 5)
        );

        InventarioService inventarioService = new InventarioService();

        System.out.println("Sistema WMS/TMS e-Commerce");
        System.out.println("--------------------------");
        productos.forEach(producto ->
                System.out.println(producto.codigo() + " - " + producto.nombre() + " - Stock: " + producto.stock())
        );
        System.out.println("Stock total: " + inventarioService.calcularStockTotal(productos));
    }
}
