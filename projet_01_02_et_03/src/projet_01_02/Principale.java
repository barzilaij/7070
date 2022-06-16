/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_01_02;

import java.util.List;
import org.hibernate.*;

/**
 *
 * @author trainer
 */
public class Principale {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        System.out.println("Etat session "+session.isOpen());
        Transaction tx = null;
        try {
            //Client monClient = new Client();
            //monClient.setNom("morerasori");
            tx = session.beginTransaction();
            
            //List results = session.createQuery("from Client").list();
            //session.save(monClient);
            tx.commit();
            
            //for (Object o:results)System.out.println(o);
        }
        catch(Exception ex) {
            tx.rollback();
            throw ex;
        }
      /*  finally {
            session.close();
        }*/
         System.out.println("Etat session "+session.isOpen());
    }
}
