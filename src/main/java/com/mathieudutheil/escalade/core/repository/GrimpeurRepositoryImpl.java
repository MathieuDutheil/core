package com.mathieudutheil.escalade.core.repository;

import com.mathieudutheil.escalade.core.HibernateUtil;
import com.mathieudutheil.escalade.core.entity.Grimpeur;
import org.hibernate.Session;

public class GrimpeurRepositoryImpl {

    public Grimpeur getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Grimpeur grimpeur= session.get(Grimpeur.class, id);
        System.out.println("Grimpeur lue");
        return grimpeur;
    }


}
