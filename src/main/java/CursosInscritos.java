
import java.util.ArrayList;
import java.util.List;

public class CursosInscritos implements Servicios{
    private List<Inscripcion> listado;
    
    public CursosInscritos() {
        this.listado = new ArrayList<>();
    }

    public void inscribirCurso(Inscripcion inscripcion) {
        if (!listado.contains(inscripcion)) {
            listado.add(inscripcion);
            System.out.println("Inscripción realizada correctamente.");
        } else {
            System.out.println("La inscripción ya existe.");
        }
    }

    public void eliminar(Inscripcion inscripcion) {
        if (listado.remove(inscripcion)) {
            System.out.println("Inscripción eliminada correctamente.");
        } else {
            System.out.println("No se encontró la inscripción.");
        }
    }

    public void actualizar(Inscripcion inscripcion) {
        int index = listado.indexOf(inscripcion);
        if (index != -1) {
            listado.set(index, inscripcion);
            System.out.println("Inscripción actualizada correctamente.");
        } else {
            System.out.println("No se encontró la inscripción.");
        }
    }

    public void guardarInformacion(Inscripcion inscripcion) {
        System.out.println("Guardando información de la inscripción: " + inscripcion);
    }

    public List<Inscripcion> toStringList() {
        return new ArrayList<>(listado);
    }

    public void cargarDatos() {
        System.out.println("Cargando datos de inscripciones...");
    }

    @Override
    public String imprimirPosicion(String posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer cantidadActual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> imprimirListado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
