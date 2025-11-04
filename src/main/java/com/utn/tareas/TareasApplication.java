package com.utn.tareas;

import com.utn.tareas.model.Prioridad;
import com.utn.tareas.service.MensajeService;
import com.utn.tareas.service.TareaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareasApplication implements CommandLineRunner {

    private final TareaService tareaService;
    private final MensajeService mensajeService;

    public TareasApplication(TareaService tareaService, MensajeService mensajeService) {
        this.tareaService = tareaService;
        this.mensajeService = mensajeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(TareasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 1. Mostrar mensaje de bienvenida
        mensajeService.mostrarBienvenida();

        // 2. Mostrar la configuración actual
        tareaService.imprimirConfiguracion();

        // 3. Listar todas las tareas iniciales
        System.out.println("\n--- Tareas Iniciales ---");
        tareaService.findAll().forEach(System.out::println);

        // 4. Agregar una nueva tarea
        System.out.println("\n--- Agregando nueva tarea ---");
        try {
            tareaService.addTarea("Revisar TP de DDS", Prioridad.MEDIA);
            System.out.println("Nueva tarea agregada.");
        } catch (IllegalStateException e) {
            System.out.println("Error al agregar tarea: " + e.getMessage());
        }


        // 5. Listar tareas pendientes
        System.out.println("\n--- Tareas Pendientes ---");
        tareaService.findPendientes().forEach(System.out::println);

        // 6. Marcar una tarea como completada (ID 1)
        System.out.println("\n--- Marcando tarea 1 como completada ---");
        tareaService.marcarCompletada(1L);

        // 7. Mostrar estadísticas
        System.out.println("\n--- Estadísticas ---");
        System.out.println(tareaService.getEstadisticas());

        // 8. Listar tareas completadas
        System.out.println("\n--- Tareas Completadas ---");
        tareaService.findCompletadas().forEach(System.out::println);

        // 9. Mostrar mensaje de despedida
        mensajeService.mostrarDespedida();
    }
}
