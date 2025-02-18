public class CursoProfesor {
    Profesor profesor;
    Curso curso;
    int año, semestre;

    public String toString(){
        return "Profesor: "+profesor+"\naño: "+año+"\nsemestre: "+semestre+"\ncurso: "+curso;
    }

    public String getCursoProfesor(){
        return this.toString();
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
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
    
}
