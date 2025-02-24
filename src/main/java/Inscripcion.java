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

    @Override
    public String toString() {
        return "Curso: " + curso.getCurso() + 
               "\nAño: " + año + 
               "\nSemestre: " + semestre + 
               "\nEstudiante: " + estudiante.getNombres();
    }

    // Obtener toda la información de la inscripción
    public String getInscripciones() {
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Inscripcion that = (Inscripcion) obj;
        return año == that.año &&
               semestre == that.semestre &&
               curso.equals(that.curso) &&
               estudiante.equals(that.estudiante);
    }

    @Override
    public int hashCode() {
        return curso.hashCode() + Integer.hashCode(año) + Integer.hashCode(semestre) + estudiante.hashCode();
    }
}
