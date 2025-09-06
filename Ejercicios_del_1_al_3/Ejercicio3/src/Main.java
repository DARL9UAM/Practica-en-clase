import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>();

        // Registrar productos dinámicamente
        System.out.print("¿Cuántos productos desea registrar? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            inventario.add(new Producto(nombre, codigo, cantidad));
        }

        // Buscar por código
        System.out.print("\nIngrese un código para buscar: ");
        String codigoBuscado = sc.nextLine();
        boolean encontrado = false;
        for (Producto p : inventario) {
            if (p.getCodigo().equalsIgnoreCase(codigoBuscado)) {
                System.out.println("Encontrado: " + p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Error: El producto no existe.");
        }

        // Mostrar productos con stock < 5
        System.out.println("\nProductos con stock menor a 5:");
        for (Producto p : inventario) {
            if (p.getCantidad() < 5) {
                System.out.println(p);
            }else {
                System.out.println("No hay productos encontrados.");
            }
        }

        sc.close();
    }
}

