
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CursosProfesores implements Servicios{
    private List<CursoProfesor> cursosProfesores;

    public CursosProfesores() {
        this.cursosProfesores = new ArrayList<>();
    }

    public void inscribir(CursoProfesor cursoProfesor) {
        if (!cursosProfesores.contains(cursoProfesor)) {
            cursosProfesores.add(cursoProfesor);
            System.out.println("CursoProfesor inscrito correctamente.");
        } else {
            System.out.println("El CursoProfesor ya está inscrito.");
        }
    }
    
    public void guardarInformacion(CursoProfesor cursoProfesor) {
        System.out.println("Guardando información del curso profesor: " + cursoProfesor);
    }

    public void cargarDatos() {
        System.out.println("Cargando datos de cursos profesores...");
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
