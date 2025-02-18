public class Curso {
    int id;
    boolean activo;
    Programa programa;

    public Curso(int id, boolean activo, Programa programa){
        this.id = id;
        this.activo = activo;
        this.programa = programa;
    }

    @Override
    public String toString(){
        return "id: "+id+"\nActivo: "+activo+"\nPrograma: "+programa;
    }

    public String getCurso(){
        return this.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
