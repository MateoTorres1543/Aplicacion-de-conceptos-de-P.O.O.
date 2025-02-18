public class Inscripcion {
    Curso curso;
    int año, semestre;
    Estudiante estudiante;

    public Inscripcion(Curso curso, int año, int semestre, Estudiante estudiante){
        this.curso = curso;
        this.año = año;
        this.semestre = semestre;
        this.estudiante = estudiante;
    }

    public String toString(){
        return "Curso: "+curso+"\naño: "+año+"\nsemestre: "+semestre+"\nestudiante: "+estudiante;
    }

    public String getInscripciones(){
        return this.toString();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
}
