package com.nicanadadores.main;

import com.nicanadadores.models.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Creacion de Nadadores
        Nadador nadador1 = new Nadador(15, "Jared Salguera", 15, "Pecho");
        Nadador nadador2 = new Nadador(17, "Andres Espinoza", 17, "Mariposa");

        //Creacion del Entrenador
        Entrenador entrenador1 = new Entrenador(21, 5, "Hamilton Treminio");

        //Creacion de Competencia
        Competencia competencia1 = new Competencia(
                LocalDate.of(2026, 4, 24),
                1,
                "Managua",
                "Competencia Abierta Nacional"
        );

        //Creacion de Resultados
        Resultado resultado1 = new Resultado(1, "Primer lugar", 73);//100 pecho en 73 segundos o 1:13 minutos
        Resultado resultado2 = new Resultado(2, "Primer lugar", 61);//100 mariposa en 61 segundo o 1:01 minutos

        //Mostrar información

        System.out.println("Nadadores");
        System.out.println(nadador1);
        System.out.println(nadador2);

        System.out.println("\nEntrenador");
        System.out.println(entrenador1);

        System.out.println("\nCompetencia");
        System.out.println(competencia1);

        System.out.println("\nResultados");
        System.out.println("Nadador: " + nadador1.getNombre() + " -> " + resultado1);
        System.out.println("Nadador: " + nadador2.getNombre() + " -> " + resultado2);

        //Simulación de relaciones

        System.out.println("\nRelacion");
        System.out.println(nadador1.getNombre() + " es entrenado por " + entrenador1.getNombre());
        System.out.println(nadador2.getNombre() + " es entrenado por " + entrenador1.getNombre());

        System.out.println(nadador1.getNombre() + " participó en " + competencia1.getNombre());
        System.out.println(nadador2.getNombre() + " participó en " + competencia1.getNombre());

        //Inicia la parte de edicion para poder agregar datos

        ArrayList<Nadador> nadadores = new ArrayList<>();
        ArrayList<Entrenador> entrenadores = new ArrayList<>();
        ArrayList<Competencia> competencias = new ArrayList<>();
        ArrayList<Resultado> resultados = new ArrayList<>();

        int opcion;
        //Creacion del menu interactivo
        do {
            System.out.println("\nMenu de NicaNadadores");
            System.out.println("1. Agregar Nadador");
            System.out.println("2. Agregar Entrenador");
            System.out.println("3. Agregar Competencia");
            System.out.println("4. Agregar Resultado");
            System.out.println("5. Mostrar Datos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.println("Nuevo Nadador");
                    System.out.print("ID: ");
                    int idN = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombreN = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Estilo: ");
                    String estilo = sc.nextLine();

                    nadadores.add(new Nadador(idN, nombreN, edad, estilo));
                    System.out.println("Nadador agregado");
                    break;

                case 2:
                    System.out.println("=== Nuevo Entrenador ===");
                    System.out.print("ID: ");
                    int idE = sc.nextInt();

                    System.out.print("Años de experiencia: ");
                    int exp = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombreE = sc.nextLine();

                    entrenadores.add(new Entrenador(idE, exp, nombreE));
                    System.out.println("Entrenador agregado ✅");
                    break;

                case 3:
                    System.out.println("=== Nueva Competencia ===");
                    System.out.print("ID: ");
                    int idC = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombreC = sc.nextLine();

                    System.out.print("Lugar: ");
                    String lugar = sc.nextLine();

                    System.out.print("Año: ");
                    int anio = sc.nextInt();

                    System.out.print("Mes: ");
                    int mes = sc.nextInt();

                    System.out.print("Día: ");
                    int dia = sc.nextInt();

                    competencias.add(new Competencia(
                            LocalDate.of(anio, mes, dia),
                            idC,
                            lugar,
                            nombreC
                    ));

                    System.out.println("Competencia agregada");
                    break;

                case 4:
                    System.out.println("Nuevo Resultado");
                    System.out.print("ID: ");
                    int idR = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Posición: ");
                    String posicion = sc.nextLine();

                    System.out.print("Tiempo: ");
                    int tiempo = sc.nextInt();

                    resultados.add(new Resultado(idR, posicion, tiempo));
                    System.out.println("Resultado agregado");
                    break;

                case 5:
                    System.out.println("\nNadador");
                    for (Nadador n : nadadores) {
                        System.out.println(n);
                    }

                    System.out.println("\nEntrenador");
                    for (Entrenador e : entrenadores) {
                        System.out.println(e);
                    }

                    System.out.println("\nCompetencia");
                    for (Competencia c : competencias) {
                        System.out.println(c);
                    }

                    System.out.println("\nResultado");
                    for (Resultado r : resultados) {
                        System.out.println(r);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del NicaNadadores sys");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 6);

        sc.close();
    }
}
