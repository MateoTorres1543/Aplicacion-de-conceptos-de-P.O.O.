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

    // Método para eliminar una inscripción
    public void eliminar(Inscripcion inscripcion) {
        if (listado.remove(inscripcion)) {
            System.out.println("Inscripción eliminada correctamente.");
        } else {
            System.out.println("No se encontró la inscripción.");
        }
    }

    // Método para actualizar una inscripción
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
                bw.write(
                    inscripcion.getCurso().getId() + "," +
                    inscripcion.getCurso().getNombre() + "," +
                    inscripcion.getCurso().isActivo() + "," +
                    inscripcion.getCurso().getPrograma().getId() + "," +
                    inscripcion.getCurso().getPrograma().getNombre() + "," +
                    inscripcion.getCurso().getPrograma().getDuracion() + "," +
                    inscripcion.getAño() + "," +
                    inscripcion.getSemestre() + "," +
                    inscripcion.getEstudiante().getId() + "," +
                    inscripcion.getEstudiante().getNombres() + "," +
                    inscripcion.getEstudiante().getApellidos() + "," +
                    inscripcion.getEstudiante().getEmail() + "," +
                    inscripcion.getEstudiante().getCodigo() + "," +
                    inscripcion.getEstudiante().getPromedio() + "," +
                    inscripcion.getEstudiante().getPrograma().getId() + "," +
                    inscripcion.getEstudiante().getPrograma().getNombre() + "," +
                    inscripcion.getEstudiante().getPrograma().getDuracion() + "," +
                    inscripcion.getEstudiante().getActivo() + "\n"
                );
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

                if (datos.length == 17) {
                    try {
                        // Crear el programa del curso
                        double programaCursoId = Double.parseDouble(datos[3]);
                        String programaCursoNombre = datos[4];
                        double programaCursoDuracion = Double.parseDouble(datos[5]);
                        Programa programaCurso = new Programa(programaCursoId, programaCursoDuracion, programaCursoNombre, "", null);

                        // Crear el curso
                        int cursoId = Integer.parseInt(datos[0]);
                        String cursoNombre = datos[1];
                        boolean cursoActivo = Boolean.parseBoolean(datos[2]);
                        Curso curso = new Curso(cursoId, cursoNombre, cursoActivo, programaCurso);

                        // Obtener año y semestre
                        int año = Integer.parseInt(datos[6]);
                        int semestre = Integer.parseInt(datos[7]);

                        // Crear el programa del estudiante
                        double programaEstudianteId = Double.parseDouble(datos[14]);
                        String programaEstudianteNombre = datos[15];
                        double programaEstudianteDuracion = Double.parseDouble(datos[16]);
                        Programa programaEstudiante = new Programa(programaEstudianteId, programaEstudianteDuracion, programaEstudianteNombre, "", null);

                        // Crear estudiante
                        double estudianteId = Double.parseDouble(datos[8]);
                        String nombres = datos[9];
                        String apellidos = datos[10];
                        String email = datos[11];
                        double codigo = Double.parseDouble(datos[12]);
                        double promedio = Double.parseDouble(datos[13]);
                        boolean activo = Boolean.parseBoolean(datos[14]);

                        Estudiante estudiante = new Estudiante(estudianteId, nombres, apellidos, email, codigo, promedio, programaEstudiante, activo);

                        // Crear inscripción y agregarla
                        Inscripcion inscripcion = new Inscripcion(curso, año, semestre, estudiante);
                        listado.add(inscripcion);
                    } catch (NumberFormatException e) {
                        System.out.println("Error en el formato de los datos: " + e.getMessage());
                    }
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
    public String imprimirPosicion(int posicion) {
        if (posicion >= 0 && posicion < listado.size()) {
            return listado.get(posicion).toString();
        }
        return "Posición fuera de rango.";
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
