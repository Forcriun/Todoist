public class Test
{
    public static void test3() 
    {
        System.out.println("### Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
                
        System.out.println("\n### Añadimos 4 tareas...");
        todoist.addTarea("Limpiar la cocina");
        todoist.addTarea("Sacar la basura");
        todoist.addTarea("Dormir la siesta");    
        todoist.addTarea("Ordenar la basura"); 
        
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareasNumeradas();     
        
        System.out.println("\n### Elimina la primera con 'basura'...");
        todoist.eliminaTodasTareasCoincidentes("basura");
        
        System.out.println("\n### Mostramos todas las tareas (deberian salir 2 tareas...");
        todoist.mostrarTareas();            
    }
        
    public static void test2() 
    {
        System.out.println("### Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
                
        System.out.println("\n### Añadimos 4 tareas...");
        todoist.addTarea("Limpiar la cocina");
        todoist.addTarea("Sacar la basura");
        todoist.addTarea("Dormir la siesta");    
        todoist.addTarea("Ordenar la basura"); 
        
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareas();     
        
        System.out.println("\n### Elimina la primera con 'basura'...");
        todoist.eliminaPrimeraTareaCoincidente("basura");
        
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareas();            
    }  
    
    public static void test1() 
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
        
        System.out.println("\n### Miramos si hay una tarea que contenga 'pan' (debería devolver true)...");  
        System.out.println(todoist.hayTareaCoincidente("pan"));
        
        System.out.println("\n### Miramos si hay una tarea que contenga 'siesta' (debería devolver false)...");  
        System.out.println(todoist.hayTareaCoincidente("siesta"));
        
        System.out.println("\n### Eliminamos la primera tarea que contenga 'pan'... (deberían quedar 4 tareas)");  
        todoist.eliminaPrimeraTareaCoincidente("pan");
        todoist.mostrarTareasNumeradas();        
    }
}
    
    
    
    