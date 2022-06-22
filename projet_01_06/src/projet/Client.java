/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.*;

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
    
    private Adresse adresse;
    public Adresse getAdresse() { return adresse;}
    public void setAdresse(Adresse adr) { adresse=adr;}
  
    private Set<Facture> factures = new HashSet<Facture>();
    public Set<Facture> getFactures() { return factures;}
    public void setFactures(Set<Facture> factures) { this.factures = factures;}
    public void addFacture(Facture facture) { factures.add(facture); facture.setClient(this);}
}
