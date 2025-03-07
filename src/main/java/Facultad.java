public class Facultad {
    double id;
    String nombre;
    Persona decano;

    public Facultad(double id, String nombre, Persona decano){
        this.id = id;
        this.nombre = nombre;
        this.decano = decano;
    }

    public String toString(){
        return "id: "+id+"\nNombre: "+nombre+"\nDecano: "+decano;
    }

    public String getFacultad(){
        return this.toString();
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDecano() {
        return decano;
    }

    public void setDecano(Persona decano) {
        this.decano = decano;
    }
    
}
