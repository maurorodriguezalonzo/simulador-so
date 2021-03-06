/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author agustin
 */
public class Ejecutando implements Estado {
    private ArrayList<Proceso> procesos;
    
    public Ejecutando() {
        procesos = new ArrayList();
    }
    
    @Override
    public void agregarProceso(Proceso proceso) {
        procesos.add(proceso);
    }
    
    @Override
    public void eliminarProceso(Proceso proceso) {
        procesos.remove(proceso);
    }
    
    @Override
    public Iterator<Proceso> obtenerProcesos() {
        return procesos.iterator();
    }
}
