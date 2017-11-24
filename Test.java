public class Test
{
    /**
     * Metodo principal
     */
    public static void main(String[] args) 
    {
        System.out.println("Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
        System.out.println("\nMostramos el numero de tareas pendientes...");
        todoist.mostrarNumeroTareasPendientes();
        System.out.println("\nAñadimos una tarea...");
        todoist.addTarea("Limpiar la cocina");
        System.out.println("\nAñadimos otra tarea...");
        todoist.addTarea("Sacar la basura");
        System.out.println("\nAñadimos otra tarea...");
        todoist.addTarea("Dormir la siesta");
        System.out.println("\nMostramos todas las tareas...");
        todoist.mostrarTareas();
        System.out.println("\nEliminamos la segunda tarea...");
        boolean valorDevuelto;
        valorDevuelto = todoist.eliminarTarea(1);
        System.out.println("El metodo de eliminar anterior devolvio...");
        System.out.println(valorDevuelto);
        System.out.println("\nMostramos todas las tareas...");
        todoist.mostrarTareas();
        System.out.println("\nIntentamos borrar una tarea que no existe...");
        valorDevuelto = todoist.eliminarTarea(1000);
        System.out.println("El metodo de eliminar anterior devolvio...");
        System.out.println(valorDevuelto);        
        System.out.println("\nMostramos todas las tareas...");
        todoist.mostrarTareas();        
    }
}