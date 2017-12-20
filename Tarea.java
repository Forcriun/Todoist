/**
 * Write a description of class Tarea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tarea
{
    // Estado de la tarea
    private boolean completada;
    // La cadena que describe la tarea
    private String cadena;

    /**
     * Constructor con parámetros de la clase
     */
    public Tarea(String cadena)
    {
        completada = false;
        this.cadena = cadena;
    }
    
    public String getCadena(){
        return cadena;
    }
    
    public boolean getCompletada(){
        return completada;
    }
    
    public void setCompletada(){
        completada = true;
    }
}
