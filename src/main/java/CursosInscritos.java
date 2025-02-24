import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CursosInscritos implements Servicios {
    private List<Inscripcion> listado;

    public CursosInscritos() {
        this.listado = new ArrayList<>();
    }

    // Método para inscribir un curso
    public void inscribir(Inscripcion inscripcion) {
        if (!listado.contains(inscripcion)) {
            listado.add(inscripcion);
            System.out.println("Inscripción realizada correctamente: " + inscripcion);
        } else {
            System.out.println("La inscripción ya existe.");
        }
    }

    // Método para eliminar una inscripción sin ID (usando equals)
    public void eliminar(Inscripcion inscripcion) {
        if (listado.remove(inscripcion)) {
            System.out.println("Inscripción eliminada correctamente.");
        } else {
            System.out.println("No se encontró la inscripción.");
        }
    }

    // Método para actualizar una inscripción (buscar y reemplazar)
    public void actualizar(Inscripcion inscripcionAntigua, Inscripcion nuevaInscripcion) {
        int index = listado.indexOf(inscripcionAntigua);
        if (index != -1) {
            listado.set(index, nuevaInscripcion);
            System.out.println("Inscripción actualizada correctamente: " + nuevaInscripcion);
        } else {
            System.out.println("No se encontró la inscripción a actualizar.");
        }
    }

    // Método para guardar información en un archivo
    public void guardarInformacion(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Inscripcion inscripcion : listado) {
                bw.write(inscripcion.getCurso().getCurso() + "," +
                         inscripcion.getAño() + "," +
                         inscripcion.getSemestre() + "," +
                         inscripcion.getEstudiante().getNombres() + "\n");
            }
            System.out.println("Información guardada en el archivo: " + archivo);
        } catch (IOException e) {
            System.out.println("Error al guardar la información: " + e.getMessage());
        }
    }

    // Método para cargar inscripciones desde un archivo
    public void cargarDatos(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    Curso curso = new Curso(datos[0]); 
                    int año = Integer.parseInt(datos[1]);
                    int semestre = Integer.parseInt(datos[2]);
                    Estudiante estudiante = new Estudiante(datos[3]); 
                    Inscripcion inscripcion = new Inscripcion(curso, año, semestre, estudiante);
                    listado.add(inscripcion);
                }
            }
            System.out.println("Datos cargados desde el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    // Método toString para imprimir la lista
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista de Inscripciones:\n");
        for (Inscripcion inscripcion : listado) {
            sb.append(inscripcion).append("\n");
        }
        return sb.toString();
    }

    // Métodos de la interfaz Servicios
    @Override
    public String imprimirPosicion(String posicion) {
        throw new UnsupportedOperationException("Método no implementado.");
    }

    @Override
    public Integer cantidadActual() {
        return listado.size();
    }

    @Override
    public List<String> imprimirListado() {
        List<String> listadoStr = new ArrayList<>();
        for (Inscripcion inscripcion : listado) {
            listadoStr.add(inscripcion.toString());
        }
        return listadoStr;
    }
}
