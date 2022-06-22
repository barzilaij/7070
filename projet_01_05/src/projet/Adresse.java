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
public class Adresse {
    private int id;
    
    private String ville;
    private String codepostal;
    private String ligne1;
    private String ligne2;
    private String ligne3;
    private String complementcedex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getLigne1() {
        return ligne1;
    }

    public void setLigne1(String ligne1) {
        this.ligne1 = ligne1;
    }

    public String getLigne2() {
        return ligne2;
    }

    public void setLigne2(String ligne2) {
        this.ligne2 = ligne2;
    }

    public String getLigne3() {
        return ligne3;
    }

    public void setLigne3(String ligne3) {
        this.ligne3 = ligne3;
    }

    public String getComplementcedex() {
        return complementcedex;
    }

    public void setComplementcedex(String complementcedex) {
        this.complementcedex = complementcedex;
    }
    @Override
    public String toString() {
        return ligne1+"\n"+(ligne2!=null ? ligne2+"\n" : "")+(ligne3!=null ? ligne3+"\n" : "")+codepostal+" "+ville+" "+complementcedex;
    }
}
