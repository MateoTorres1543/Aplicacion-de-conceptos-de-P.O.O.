public class Profesor extends Persona {
    String tipoContrato;

    public Profesor(double id, String nombres, String apellidos, String email, String tipoContrato){
        super(id, nombres, apellidos, email);
        this.tipoContrato = tipoContrato;
    }

    public String toString(){
        return super.toString() + "Tipo de Contrato: " + tipoContrato;
    }
    
    public String getProfesor(){
        return this.toString();
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
}
