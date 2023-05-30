import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear el catálogo de productos
        CatalogoProductos catalogo = new CatalogoProductos();

        // Agregar algunos productos de ejemplo
        Producto producto1 = new Producto(1, "Producto 1", 10.0, 5, 2);
        Producto producto2 = new Producto(2, "Producto 2", 15.0, 3, 1);
        catalogo.agregarProducto(producto1);
        catalogo.agregarProducto(producto2);

        // Obtener la lista de productos
        List<Producto> productos = catalogo.obtenerProductos();
        for (Producto producto : productos) {
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Descripción: " + producto.getDescripcion());
            System.out.println("Precio Unitario: " + producto.getPrecioUnitario());
            System.out.println("Cantidad en Stock: " + producto.getCantidadEnStock());
            System.out.println("Stock Mínimo: " + producto.getStockMinimo());
            System.out.println();
        }

        // Realizar una venta
        Venta venta = new Venta(producto1, "efectivo");
        venta.procesarVenta();

        // Verificar la cantidad en stock después de la venta
        System.out.println("Cantidad en Stock de Producto 1: " + producto1.getCantidadEnStock());

        // Modificar un producto existente
        Producto nuevoProducto2 = new Producto(2, "Producto 2 Modificado", 18.0, 5, 2);
        catalogo.modificarProducto(2, nuevoProducto2);

        // Eliminar un producto
        catalogo.eliminarProducto(1);
    }
}
