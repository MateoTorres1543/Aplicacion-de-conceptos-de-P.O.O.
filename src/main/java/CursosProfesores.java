import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CursosProfesores implements Servicios {
    private List<CursoProfesor> cursosProfesores;

    public CursosProfesores() {
        this.cursosProfesores = new ArrayList<>();
    }

    // Método para inscribir un CursoProfesor
    public void inscribir(CursoProfesor cursoProfesor) {
        if (!cursosProfesores.contains(cursoProfesor)) {
            cursosProfesores.add(cursoProfesor);
            System.out.println("CursoProfesor inscrito correctamente: " + cursoProfesor);
        } else {
            System.out.println("El CursoProfesor ya está inscrito.");
        }
    }

    // Método para guardar la información de todos los cursos y profesores en un archivo
    public void guardarInformacion(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (CursoProfesor cp : cursosProfesores) {
                bw.write(cp.getCurso() + "," + cp.getProfesor() + "\n");
            }
            System.out.println("Información guardada en el archivo: " + archivo);
        } catch (IOException e) {
            System.out.println("Error al guardar la información: " + e.getMessage());
        }
    }

    // Método para cargar datos desde un archivo
    public void cargarDatos(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 2) {
                    String curso = datos[0];
                    String profesor = datos[1];

                    CursoProfesor cursoProfesor = new CursoProfesor();
                    cursosProfesores.add(cursoProfesor);
                }
            }
            System.out.println("Datos cargados desde el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    // Método para representar la lista de cursos y profesores inscritos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista de Cursos y Profesores:\n");
        for (CursoProfesor cp : cursosProfesores) {
            sb.append(cp).append("\n");
        }
        return sb.toString();
    }

    // Métodos de la interfaz Servicios (si es necesario implementarlos)
    @Override
    public String imprimirPosicion(int posicion) {
        throw new UnsupportedOperationException("Método no implementado.");
    }

    @Override
    public Integer cantidadActual() {
        return cursosProfesores.size();
    }

    @Override
    public List<String> imprimirListado() {
        List<String> listado = new ArrayList<>();
        for (CursoProfesor cp : cursosProfesores) {
            listado.add(cp.toString());
        }
        return listado;
    }
}
