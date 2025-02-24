public class Curso {
    int id;
    String nombre;
    boolean activo;
    Programa programa;

    public Curso(int id, String nombre, boolean activo, Programa programa){
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
        this.programa = programa;
    }

    @Override
    public String toString(){
        return "id: "+ id +"\nNombre: "+nombre+"\nActivo: "+activo+"\nPrograma: "+programa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    
}
