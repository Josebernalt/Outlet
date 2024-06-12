/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose Eliud Bernal
 */
public class Prenda{
    private int id;
    private String nom_pre;

    public Prenda() {
    }

    public Prenda(int id, String nom_pre) {
        this.id = id;
        this.nom_pre = nom_pre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_pre() {
        return nom_pre;
    }

    public void setNom_pre(String nom_pre) {
        this.nom_pre = nom_pre;
    }
    
}
