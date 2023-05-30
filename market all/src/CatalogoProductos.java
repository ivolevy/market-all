import java.util.ArrayList;
import java.util.List;

public class CatalogoProductos {
    private List<Producto> productos;

    public CatalogoProductos() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void modificarProducto(int codigo, Producto nuevoProducto) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.getCodigo() == codigo) {
                productos.set(i, nuevoProducto);
                break;
            }
        }
    }

    public void eliminarProducto(int codigo) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.getCodigo() == codigo) {
                productos.remove(i);
                break;
            }
        }
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }
}
