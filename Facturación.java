import java.util.Scanner;

public class Facturación {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreProducto;
        double precioProducto;
        int cantidad;
        final double IMPUESTO = 0.21;
        double dineroCliente;

        System.out.print("Nombre del producto: ");
        nombreProducto = sc.nextLine();

        System.out.print("Precio del producto: ");
        precioProducto = sc.nextDouble();

        System.out.print("Cantidad a comprar: ");
        cantidad = sc.nextInt();

        System.out.print("Dinero que trae el cliente: ");
        dineroCliente = sc.nextDouble();

        double subtotal = precioProducto * cantidad;
        double totalAPagar = subtotal + (subtotal * IMPUESTO);

        int totalRedondeado = (int) totalAPagar;

        boolean puedeComprar = dineroCliente >= totalAPagar;

        System.out.println("\n----- TICKET DE COMPRA -----");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio unitario: " + precioProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total con impuesto: " + totalAPagar);
        System.out.println("Total redondeado: " + totalRedondeado);
        System.out.println("Dinero del cliente: " + dineroCliente);
        System.out.println("¿Compra aprobada?: " + puedeComprar);
    }
}

