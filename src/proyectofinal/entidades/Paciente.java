/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.entidades;


public class Paciente {
    private int idPaciente;
    private String nombre;
    private int dni;
    private String domicilio;
    private String telefono;
    private boolean estado;
    
    public Paciente(int idPaciente, String nombre, int dni, String domicilio, String telefono,boolean estado){
        this.idPaciente=idPaciente;
        this.nombre=nombre;
        this.dni=dni;
        this.domicilio=domicilio;
        this.telefono=telefono;
        this.estado=estado;
    }

    public Paciente() {
    }

    /*public Paciente(Integer dni, String nombre, String domicilio, String telefono, Boolean estado, Integer idpaciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public Paciente(Integer dni, String nombre, String domicilio, String telefono, Boolean estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int getIdPaciente(){
        return idPaciente;
    }
    public void setIdPaciente(int idPaciente){
        this.idPaciente=idPaciente;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
}
