

package simuladorso;
import java.util.ArrayList;
import java.util.Iterator;

public class Listo implements Estado {
    private ArrayList<Proceso> procesos;
    
    public Listo() {
        procesos = new ArrayList();
    }
    
    @Override
    public void agregarProceso(Proceso proceso) {
        procesos.add(proceso);
    }
    
    @Override
    public void quitarProceso(Proceso proceso) {
        procesos.remove(proceso);
    }

    @Override
    public void vaciar() {
        procesos.clear();
    }
    
    @Override
    public boolean estaVacio() {
        return procesos.isEmpty();
    }
    
    @Override
    public Iterator<Proceso> obtenerProcesos() {
        // clonar para evitar modificación concurrente del iterador
        return (new ArrayList(procesos)).iterator();
    }
}
