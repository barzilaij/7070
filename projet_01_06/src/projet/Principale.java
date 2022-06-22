/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.List;
import org.hibernate.*;

/**
 *
 * @author trainer
 */
public class Principale {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
       
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
           
            Client unClient = new Client();
            unClient.setNom("rasori");
          
            Adresse adr1 = new Adresse();
            adr1.setVille("Saint-Georges-sur-Eure");
            adr1.setCodepostal("28190");
            adr1.setLigne1("38, rue général de Gaulle");
            unClient.setAdresse(adr1);
            
            Facture f1 = new Facture();
            f1.setTotalTTC(1234.5);
            unClient.addFacture(f1);
            
            
            session.save(adr1);
            session.save(unClient);
           session.save(f1);
            
            List lesClients = session.createQuery("from Client").list();
            for (Object  o :lesClients){
               Client c  =(Client)o;
               System.out.println("Client "+c);
               System.out.println("Adresse : "+c.getAdresse());
               for(Object f : c.getFactures()) {
                   System.out.println("Facture : "+f);
               }
            }
            
            tx.commit();
           
        }
        catch(Exception ex) {
            tx.rollback();
            throw ex;
        }
        finally {
            session.close();
        }
         
    }
}
