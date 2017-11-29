public class Test
{
    /**
     * Metodo principal
     */
    public static void main(String[] args) 
    {
        System.out.println("### Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
        
        System.out.println("\n### Mostramos el numero de tareas pendientes (debería ser 0)...");
        todoist.mostrarNumeroTareasPendientes();
        
        System.out.println("\n### Añadimos 3 tareas...");
        todoist.addTarea("Limpiar la cocina");
        todoist.addTarea("Sacar la basura");
        todoist.addTarea("Dormir la siesta");
        
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareas();
        
        System.out.println("\n### Eliminamos la segunda tarea...");
        boolean valorDevuelto;
        valorDevuelto = todoist.eliminarTarea(1);
        System.out.println("El metodo de eliminar anterior devolvio (deberia ser true):");
        System.out.println(valorDevuelto);
        
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareas();
        
        System.out.println("\n### Intentamos borrar una tarea que no existe...");
        valorDevuelto = todoist.eliminarTarea(1000);
        System.out.println("El metodo de eliminar anterior devolvio (deberia ser false):");
        System.out.println(valorDevuelto);   
        
        System.out.println("\n### Añadimos varias tareas...");
        todoist.addTarea("Estudiar 'Programacion'");
        todoist.addTarea("Comprar el pan");    
        todoist.addTarea("Estudiar 'Entornos'");
        
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareas();    
        
        System.out.println("\n### Mostramos las tareas numeradas...");
        todoist.mostrarTareasNumeradas();
        
        System.out.println("\n### Mostramos las tareas impares unicamente...");
        todoist.mostrarTareasEnPosicionImpar();
        
        System.out.println("\n### Mostramos las tareas que contienen el texto 'Estudiar'...");
        todoist.mostrarCoincidentes("estudiar");
        
        System.out.println("\n### Mostramos todas las tareas usando un while...");
        todoist.mostrarTareas2();    
        
        System.out.println("\n### Mostramos las tareas numeradas usando un while...");
        todoist.mostrarTareasNumeradas2(); 
        
        System.out.println("\n### Mostramos las primeras 3 tareas...");
        todoist.mostrarNPrimeras(3);
        
        System.out.println("\n### Mostramos las primeras 10 tareas...");
        todoist.mostrarNPrimeras(10);
        
    }
}