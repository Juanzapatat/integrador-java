package com.example;

import java.util.Scanner;
import java.util.ArrayList;
  

public class Main {

    public static void main(String[] args) {
        // Llamada al método de control de gastos
       login();
        controlDeGastos();
        registroDeFactura();
        reporteDeFinanzas();
    }

// Metodo de login
    static void login() {
        Scanner sc = new Scanner(System.in); // Creo un scanner para capturar datos

        while (true) {
            System.out.print("Ingrese su nombre de Usuario: ");
            String nombreUsuario = sc.next();

            System.out.print("Ingrese su contraseña: ");
            String contrasena = sc.next();

            if (nombreUsuario.equals("ADMIN") && contrasena.equals("CESDE")) {
                // Inicio de sesión correcto
                System.out.println("Bienvenido, administrador!");
                break;
            } else {
                System.out.println("Nombre de Usuario o Contraseña incorrectos.");
            }
        }
    }

    // Método para controlar gastos
    static void controlDeGastos() {
        Scanner sc = new Scanner(System.in); // Creo un scanner para capturar datos

        ArrayList<String> controlGastos = new ArrayList<>(); // Para almacenar la información

        while (true) {
            // Crear el menú de Control de Gastos
            System.out.println("--------------------------------------------------");
            System.out.println("1. Registre control de gastos");
            System.out.println("2. Eliminar");
            System.out.println("3. Consultar Registro");
            System.out.println("4. Cerrar Sesión");
            System.out.print("Seleccione una de las opciones disponibles: ");

            int opcion = sc.nextInt(); // Lee la opción del menú

            if (opcion == 1) {
                // Registro de un nuevo gasto
                System.out.print("Nombre del Gasto: ");
                String ng = sc.next();
                controlGastos.add("Nombre del Gasto: " + ng);

                System.out.print("Fecha (separado por '/'): ");
                String fh = sc.next();
                controlGastos.add("Fecha: " + fh);

                System.out.print("Monto del Gasto: ");
                String mg = sc.next();
                controlGastos.add("Monto: " + mg);

                System.out.print("Receptor: ");
                String rt = sc.next();
                controlGastos.add("Receptor: " + rt);

                System.out.print("Categoría: ");
                String cg = sc.next();
                controlGastos.add("Categoría: " + cg);

                System.out.println("Gasto registrado exitosamente.");

            } else if (opcion == 2) {
                // Eliminar un gasto
                System.out.print("Ingrese el nombre del gasto que desea eliminar: ");
                String eliminar = sc.next();

                boolean encontrado = false;
                for (int i = 0; i < controlGastos.size(); i++) {
                    if (controlGastos.get(i).contains(eliminar)) {
                        controlGastos.remove(i);
                        System.out.println("Gasto eliminado exitosamente.");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Gasto no encontrado.");
                }

            } else if (opcion == 3) {
                // Consultar los registros de gastos
                System.out.println("Tus registros son:");
                for (String gasto : controlGastos) {
                    System.out.println(gasto);
                }

            } else if (opcion == 4) {
                // Cerrar sesión
                System.out.println("Su sesión se ha cerrado correctamente.");
                break; // Salir del bucle
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        }
    }

    // Método para registrar facturas
    static void registroDeFactura() {
        ArrayList<String> factura = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("Bienvenido al sistema de registro de facturas. Complete el formulario para procesar su registro.");
            System.out.println("Opciones:");
            System.out.println("1. Ingresar nombre");
            System.out.println("2. Ingresar monto");
            System.out.println("3. Ingresar proveedor");
            System.out.println("4. Ingresar empresa");
            System.out.println("5. Revisar factura");
            System.out.println("6. Finalizar registro");
            System.out.print("Seleccione una opción: ");
            
            int opciones = scanner.nextInt();
            scanner.nextLine(); // Para consumir el salto de línea después del número

            switch (opciones) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    factura.add("Nombre: " + nombre);
                    break;
                case 2:
                    System.out.print("Ingrese el monto: ");
                    String monto = scanner.nextLine();
                    factura.add("Monto: " + monto);
                    break;
                case 3:
                    System.out.print("Ingrese el proveedor: ");
                    String proveedor = scanner.nextLine();
                    factura.add("Proveedor: " + proveedor);
                    break;
                case 4:
                    System.out.print("Ingrese la empresa: ");
                    String empresa = scanner.nextLine();
                    factura.add("Empresa: " + empresa);
                    break;
                case 5:
                    System.out.println("Revisión de factura:");
                    for (String revision : factura) {
                        System.out.println(revision);
                    }
                    break;
                case 6:
                    System.out.println("Registro de factura finalizado. ¡Gracias por su registro!");
                    return; // Finalizar el método
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
    static void reporteDeFinanzas() {
        ArrayList<String> reporte = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al sistema de reporte de finanzas. Complete el formulario para generar su reporte.");
            System.out.println("--------------------------------------------------");
            System.out.println("Opciones:");
            System.out.println("1. Registrar reporte");
            System.out.println("2. Eliminar reporte");
            System.out.println("3. Consultar reportes");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de la entrada

            if (opcion == 1) {
                // Registrar un nuevo reporte
                System.out.print("Nombre del reporte: ");
                String nombreReporte = scanner.nextLine();
                reporte.add("Nombre de reporte: " + nombreReporte);

                System.out.print("Fecha de expedición: ");
                String fechaExpidicion = scanner.nextLine();
                reporte.add("Fecha de expedición: " + fechaExpidicion);

                System.out.print("Fecha de vencimiento: ");
                String fechaVencimiento = scanner.nextLine();
                reporte.add("Fecha de vencimiento: " + fechaVencimiento);

                System.out.print("Monto del reporte: ");
                String montoReporte = scanner.nextLine();
                reporte.add("Monto de reporte: " + montoReporte);

                System.out.print("Categoría del reporte: ");
                String categoriaReporte = scanner.nextLine();
                reporte.add("Categoría de reporte: " + categoriaReporte);

                System.out.println("Reporte registrado exitosamente.");

            } else if (opcion == 2) {
                // Eliminar un reporte
                System.out.print("Ingrese el nombre del reporte que desea eliminar: ");
                String eliminar = scanner.nextLine();

                boolean encontrado = false;
                for (int i = 0; i < reporte.size(); i++) {
                    if (reporte.get(i).contains(eliminar)) {
                        reporte.remove(i);
                        System.out.println("Reporte eliminado exitosamente.");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Reporte no encontrado.");
                }

            } else if (opcion == 3) {
                // Consultar los reportes registrados
                System.out.println("Tus reportes son:");
                if (reporte.isEmpty()) {
                    System.out.println("No hay reportes registrados.");
                } else {
                    for (String finanza : reporte) {
                        System.out.println(finanza);
                    }
                }

            } else if (opcion == 4) {
                // Cerrar sesión
                System.out.println("Su sesión se ha cerrado correctamente.");
                break; // Salir del bucle

            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        }

        scanner.close();  // Cerrar el scanner
    }
}




