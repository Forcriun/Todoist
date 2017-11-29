import java.util.ArrayList;


/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer.
 */
class Todoist 
{
    
    // Almacena nuestras tareas
    private ArrayList<String> tareas; 

    /**
     * Constructor de la clase Todoist. Crea un gestor con las 3 tareas vacías.
     */
    public Todoist()
    {
        tareas = new ArrayList<String>();
    }
    
    
    /**
     * Inserta una nueva tarea
     */
    public void addTarea(String nombreTarea)
    {
        tareas.add(nombreTarea);
    }
    
    
    /**
     * Muestra por pantalla todas las tareas existentes
     */
    
    public void mostrarTareas()
    {
        System.out.println("Tareas existentes:");
        System.out.println(tareas);
    }
    
    
    /**
     * Devuelve el numero de tareas pendientes
     */     
    public int getNumeroDeTareasPendientes()
    {
      return tareas.size(); 
    }
    
    
    /**
     * Imprime por pantalla el numero de tareas pendientes
     */
    public void mostrarNumeroTareasPendientes()
    {
        System.out.println(tareas.size());
    }
    
    
    /** 
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0). Devuelve true si la tarea existe y se elimina,
     * false en caso contrario
     */
    public boolean eliminarTarea(int posicionTarea) 
    {
        boolean valorADevolver = false;
        if(esValidoElIndice(posicionTarea)){
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }
        return valorADevolver;
    }
    
    
    /**
     * Metodo que comprueba si una posicion es valida y devuelve true
     * en caso afirmativo o false en otro caso.
     */
    public boolean esValidoElIndice(int indice) 
    {
        return (indice >= 0 && indice < tareas.size());
    }
    
    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer, false
     * en otro caso
     */    
    public boolean hayTareasPendientes(){
        return (getNumeroDeTareasPendientes() > 0);
    }
    
    /** 
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea.
     */
    public void mostrarTareasNumeradas()
    {
        int numeroPosicion = 1;
        for (String tarea : tareas){
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion = numeroPosicion + 1;
        }
    }
    
    /**
     * Muestra solo las tareas en posiciones impares sin numero delante ni nada,
     * solo la tarea
     */
    public void mostrarTareasEnPosicionImpar() 
    {
        int numeroTarea = 1;
        for (String tarea : tareas) {
            if (numeroTarea % 2 != 0){
                System.out.println(tarea);
            }
            numeroTarea ++;    
        }
    }
    
    /**
     * Muestra por pantalla todas las tareas que contienen el texto indicado
     * como parámetro, una en cada linea. Si no hay ninguna que contenga el texto
     * buscado, no muestra nada
     */
    public void mostrarCoincidentes(String textoABuscar)
    {
        int hayCoincidencias = 0;
        for (String tarea : tareas){
            if(tarea.toLowerCase().contains(textoABuscar.toLowerCase())){
                System.out.println(tarea);
                hayCoincidencias++;
            }
        }
        if(hayCoincidencias == 0){
            System.out.println("No hay tareas que contengan el texto a buscar.");
        }        
        else{
            System.out.println("Hay" + hayCoincidencias + "tareas que contienen los términos de búsqeda");
        }
    }
    
     /**
     * Muestra por pantalla la primera tarea que contenga el texto indicado como 
     * parametro. En caso de que no haya ninguna coincidencia no muestra nada
     */
    public void mostrarPrimeraCoincidente(String textoIndicado){
        boolean hayCoincidencias = false;
        for (String tarea : tareas){            
            if(tarea.toLowerCase().contains(textoIndicado.toLowerCase())){
                if(!hayCoincidencias){
                    System.out.println(tarea);
                    hayCoincidencias = true;
                }
            }
        }
    }
    
    /**
     * Muestra por pantalla todas las tareas existentes, una por línea,
     * usando un bucle while
     */
    public void mostrarTareas2()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < tareas.size()){
            System.out.println(tareas.get(posicionTareaActual));
            posicionTareaActual++;
        }
    }
    
    /**
     * Muestra las tareas numeradas usando un bucle while emp
     */
    public void mostrarTareasNumeradas2(){
        int numeroPosicion = 1;
        int posicionActual = 0;
        while(numeroPosicion < tareas.size()){
            System.out.println(numeroPosicion + ". " + tareas.get(posicionActual));
            numeroPosicion++;
            posicionActual++;
        }
    }
    
     /**
     * Muestra por pantalla las primeras n tareas (siendo n un parametro). En
     * caso de que no haya suficientes tareas muestra solo las que haya.
     */
    public void mostrarNPrimeras(int nTareas){
        int numPosicion = 0;
        while(numPosicion < nTareas && numPosicion < tareas.size()){
            System.out.println(numPosicion + ". " + tareas.get(numPosicion));
            numPosicion++;
        }    
    }
        
}

 