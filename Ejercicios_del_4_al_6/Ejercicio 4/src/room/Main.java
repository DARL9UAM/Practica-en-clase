package room;

import com.sun.source.doctree.EscapeTree;
import models.Contacto;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear arreglo de contactos
        Contacto[] listaContactos = {
                // Añadir contactos
                new Contacto("Kai Cenat", "+1 (555) 555-1234", "kaicenat@gmail.com"),
                new Contacto("Jack Sparrow", "+1 (555) 777-8754", "jacksparrow@outlook.com"),
                new Contacto("Oliver Francis", "+1 (555) 555-1234", "oliverfrancis@hotmail.com"),
                new Contacto("Oliver Medrano", "+1 (888) 666-7777", "oliverfrancis@hotmail.com")
        };

        // Inicializar Scanner
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Crear menú
            System.out.println("Bienvenido al programa!");
            System.out.println("¿Que acción desea realizar?");
            System.out.println("1. Buscar contacto");
            System.out.println("2. Añadir contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Salir");

            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entre 1 y 4.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("1. Por nombre");
                    System.out.println("2. Por dominio de correo electrónico");
                    int opcion2;
                    try {
                        opcion2 = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Entrada inválida. Por favor, ingrese 1 o 2.");
                        scanner.nextLine();
                        break;
                    }

                    if (opcion2 == 1) {
                        // Buscar contacto por nombre
                        System.out.println("Ingrese el nombre del contacto:");
                        String nombreBuscado = scanner.nextLine();

                        // Encontrar contactos con el mismo nombre
                        boolean nombreEncontrado = false;
                        for (Contacto ctc : listaContactos) {
                            if (ctc.getNombre().toLowerCase().startsWith(nombreBuscado.toLowerCase())) {
                                System.out.println("Nombre: " + ctc.getNombre() + ", Telefono: " + ctc.getTelefono() + ", Correo: " + ctc.getCorreo());
                                nombreEncontrado = true;
                            }
                        }
                        if (!nombreEncontrado) {
                            System.out.println("El nombre del contacto no existe");
                        }
                        break;

                    }    else if (opcion2 == 2) {
                            // Buscar dominio de correo electrónico
                            System.out.println("Ingrese el dominio de correo electrónico:");
                            String dominioBuscado = scanner.nextLine();

                            // Encontrar contactos con el mismo dominio de correo electrónico
                            boolean dominioEncontrado = false;
                            for (Contacto ctc : listaContactos) {
                                if (ctc.getCorreo().toLowerCase().endsWith(dominioBuscado.toLowerCase())) {
                                    System.out.println("Nombre: " + ctc.getNombre() + ", Telefono: " + ctc.getTelefono() + ", Correo: " + ctc.getCorreo());
                                    dominioEncontrado = true;
                                }
                            }
                            if (!dominioEncontrado) {
                                System.out.println("El nombre del contacto no existe");
                            }
                            break;
                    }
                case 2:
                    // Agregar datos del nuevo contacto
                    System.out.println("Ingrese el nombre del contacto:");
                    String nuevoNombre = scanner.nextLine();
                    System.out.println("Ingrese el número del contacto:");
                    String nuevoNumero = scanner.nextLine();
                    System.out.println("Ingrese el correo del contacto:");
                    String nuevoCorreo = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nuevoNombre, nuevoNumero, nuevoCorreo);
                    // Redimensionar el arreglo y añadir el nuevo contacto
                    listaContactos = Arrays.copyOf(listaContactos, listaContactos.length + 1);
                    listaContactos[listaContactos.length - 1] = nuevoContacto;
                    System.out.println("Contacto añadido existosamente.");
                    break;

                case 3:
                    // Mostrar todos los contactos
                    for (Contacto ctc : listaContactos) {
                        System.out.println("Nombre: " + ctc.getNombre() + ", Telefono: " + ctc.getTelefono() + ", Correo: " + ctc.getCorreo());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa... ¡Adiós!");
                    continuar = false;
                    break;
            }
        }


    }
}
