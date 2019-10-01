package com.zensar.hibernate;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/*
 * @author: Chaithrodaya B S
 * @creation date : 1-10-2019 10.05 AM
 * @modification date : 1-10-2019 10.05 AM
 * @description : Hibernate Product Class
*/

public class HibernateMain 
{
    public static void main( String[] args )
    {
        Configuration conf = new Configuration().configure();
        SessionFactory fact = conf.buildSessionFactory();
        Session s = fact.openSession();
        Transaction t = s.beginTransaction();
        Product p = new Product();
        p.setProductId(111);
        p.setName("PlayStation");
        p.setBrand("SONY");
        p.setPrice(6000);
        s.save(p);
        System.out.println("Product is Saved");
        t.commit();
        s.close();
        System.exit(0);
    }
}
