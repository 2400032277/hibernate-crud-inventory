package com.inventory.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.inventory.dao.HibernateUtil;
import com.inventory.entity.Product;

public class InsertProduct {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p1 = new Product("Laptop","Gaming Laptop",75000,10);
        Product p2 = new Product("Mouse","Wireless Mouse",800,50);

        session.save(p1);
        session.save(p2);

        tx.commit();
        session.close();

        System.out.println("Products inserted successfully");
    }
}
