package com.arun.HibernateFourth;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sf=new Configuration().configure().addAnnotatedClass(Springers.class).buildSessionFactory();
       
       Session session=sf.openSession();
       
       Transaction tx=session.beginTransaction();
       
       Springers sp=new Springers();
       
       sp.setId(504);
       
       sp.setName("arun");
       
       sp.setDt1(new Date());
       
       sp.setDt2(new Date());
       
       sp.setDt3(new Date());
       
       
       session.save(sp);
       
       tx.commit();
       
       session.close();
       
       
    }
}
