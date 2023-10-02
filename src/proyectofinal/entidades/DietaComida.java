/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.entidades;


public class DietaComida {
    private int id;
    private Comida comida;
    private Dieta dieta;

    public DietaComida(int id, Comida comida, Dieta dieta) {
        this.id = id;
        this.comida = comida;
        this.dieta = dieta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "DietaComida{" + "id=" + id + ", comida=" + comida + ", dieta=" + dieta + '}';
    }
    
    
}
