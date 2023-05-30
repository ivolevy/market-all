public class Venta {
    private Producto producto;
    private String medioPago;

    public Venta(Producto producto, String medioPago) {
        this.producto = producto;
        this.medioPago = medioPago;
    }

    public void procesarVenta() {
        if (producto.getCantidadEnStock() > 0) {
            double montoTotal = producto.getPrecioUnitario();

            if (medioPago.equals("tarjeta debito")) {
                // No hay descuento, se cobra el valor total de la venta
            } else if (medioPago.equals("efectivo")) {
                montoTotal -= (montoTotal * 0.1);
            } else if (medioPago.equals("tarjeta credito")) {
                int cuotas = 2;

                if (cuotas == 2) {
                    montoTotal += (montoTotal * 0.06);
                } else if (cuotas == 3) {
                    montoTotal += (montoTotal * 0.12);
                } else if (cuotas == 6) {
                    montoTotal += (montoTotal * 0.20);
                }
            }

            producto.setCantidadEnStock(producto.getCantidadEnStock() - 1);
            // Realizar el registro de la venta y otros procesamientos necesarios
            System.out.println("Venta procesada exitosamente.");
            System.out.println("Monto total: " + montoTotal);
        } else {
            System.out.println("No hay stock suficiente del producto.");
        }
    }
}
