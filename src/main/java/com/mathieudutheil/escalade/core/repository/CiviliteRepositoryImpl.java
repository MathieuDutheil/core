package com.mathieudutheil.escalade.core.repository;

import com.mathieudutheil.escalade.core.HibernateUtil;
import com.mathieudutheil.escalade.core.entity.Civilite;
import org.hibernate.Session;

public class CiviliteRepositoryImpl {

    public Civilite getCiviliteById(Byte id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Civilite civilite= session.get(Civilite.class, id);
        System.out.println("Civilité lue");
        return civilite;
    }

}
