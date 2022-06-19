/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

/**
 *
 * @author trainer
 */
public class Client {
    
    private int id;
    private String nom;
    
    public String getNom() { return nom;}
    public void setNom(String nom) { this.nom=nom;}
    public int getId() { return id;}
    public void setId(int id) { this.id=id;}
    
    public String toString() {
        return id+" : "+nom;
    }
    
    //association avec une adresse
    private Adresse adresse;
    public void setAdresse(Adresse adr) { this.adresse=adr;}
    public Adresse getAdresse() { return adresse;}
}
