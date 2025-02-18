public class Programa {
    double id, duracion;
    String nombre, registro;
    Facultad facultad;

    public Programa(double id, double duracion, String nombre, String registro, Facultad facultad){
        this.id = id;
        this.duracion = duracion;
        this.nombre = nombre;
        this.registro = registro;
        this.facultad = facultad;
    }

    @Override
    public String toString(){
        return "id: "+id+"\nduracion: "+duracion+"\nnombre: "+nombre+"\nregistro: "+registro+ "\nFacultad: "+facultad;
    }

    public String getPrograma(){
        return this.toString();
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
}
