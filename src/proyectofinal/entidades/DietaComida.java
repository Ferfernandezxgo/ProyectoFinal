/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.entidades;


public class DietaComida {
    private int idDC;
    private Comida comida;
    private Dieta dieta;
    private boolean estado;

    public DietaComida(int id, Comida comida, Dieta dieta,boolean estado) {
        this.idDC = id;
        this.comida = comida;
        this.dieta = dieta;
        this.estado=estado;
    }

    public DietaComida() {
    }

    public int getIdDC() {
        return idDC;
    }

    public void setIdDC(int idDC) {
        this.idDC = idDC;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId() {
        return idDC;
    }

    public void setId(int id) {
        this.idDC = id;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return "DietaComida{" + "id=" + idDC + ", comida=" + comida + ", dieta=" + dieta + '}';
    }
    
    
}
