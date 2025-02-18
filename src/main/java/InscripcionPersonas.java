import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InscripcionPersonas {
    List<Persona> listaInscripcion = new ArrayList<>();

    public InscripcionPersonas(List<Persona> listaInscripcion){
        this.listaInscripcion = listaInscripcion;
    }

        
    public void leerDesdeArchivo(String datos) {
        try (BufferedReader br = new BufferedReader(new FileReader(datos))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] dat = linea.split(",");
                if (dat.length == 4) {
                    int id = Integer.parseInt(dat[0]);
                    String nombre = dat[1];
                    String ciudad = dat[2];
                    String email = dat[3];

                    Persona persona = new Persona(id, nombre, ciudad, email);
                    listaInscripcion.add(persona);
                }
            }
            System.out.println("Datos cargados desde el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato del ID: " + e.getMessage());
        }
    }

    public void inscribir(int id, String nombre, String Apellido, String email){
        Persona nuevaPersona = new Persona(id, nombre, Apellido, email);
        listaInscripcion.add(nuevaPersona);
        System.out.println("Persona inscrita: " + nuevaPersona);
    }

    public void actualizar(int id, String nuevoNombre, String nuevoApellido, String nuevoEmail){
        for (Persona p1 : listaInscripcion) {
            if (p1.getId() == id) {
                p1.setNombres(nuevoNombre);
                p1.setApellidos(nuevoApellido);
                p1.setEmail(nuevoEmail);
                System.out.println("Persona actualizada: " + p1);
                return;
            }
        }
        System.out.println("Persona con ID " + id + " no encontrada.");
    }

    public void eliminar(int id) {
        listaInscripcion.removeIf(p -> p.getId() == id);
        System.out.println("Persona con ID " + id + " eliminada (si existía).");
    }

    public void mostrarInscripciones() {
        if (listaInscripcion.isEmpty()) {
            System.out.println("No hay personas inscritas.");
        } else {
            System.out.println("Lista de personas inscritas:");
            for (Persona p : listaInscripcion) {
                System.out.println(p);
            }
        }
    }

}
