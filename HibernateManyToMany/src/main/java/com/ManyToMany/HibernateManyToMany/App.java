package com.ManyToMany.HibernateManyToMany;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {

        Role r1 = new Role();
        r1.setRoleName("ADMIN");

        Role r2 = new Role();
        r2.setRoleName("USER");

        User user = new User();
        user.setUsername("Mahesh");
        user.setRoles(Set.of(r1, r2));

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(user);

        tx.commit();
        session.close();

        System.out.println("Many-To-Many User–Role data inserted!");
    }
}

