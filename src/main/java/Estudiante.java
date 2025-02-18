public class Estudiante extends Persona {
    double codigo, promedio;
    Programa programa;   
    Boolean activo;
    
    public Estudiante(double id, String nombres, String apellidos, String email,  double codigo, double promedio, Programa programa, Boolean activo) {
        super(id, nombres, apellidos, email); 
        this.codigo = codigo;
        this.promedio = promedio;
        this.programa = programa;
        this.activo = activo;
    }

    public String toString(){
        return super.toString()+ "\ncodigo: " + codigo + "\npromedio: " + promedio +
        "\nprograma: " + programa + "\nactivo: " + activo;
    }

    public String getEstudiante(){
        return this.toString();
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
}
