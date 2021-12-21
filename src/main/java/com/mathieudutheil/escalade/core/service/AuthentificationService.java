package com.mathieudutheil.escalade.core.service;

import com.mathieudutheil.escalade.core.HibernateUtil;
import com.mathieudutheil.escalade.core.dto.AuthentificationDto;
import com.mathieudutheil.escalade.core.repository.GrimpeurRepositoryImpl;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AuthentificationService {

    private GrimpeurRepositoryImpl grimpeurRepository;

    public AuthentificationService() {
        this.grimpeurRepository = new GrimpeurRepositoryImpl();
    }


    public AuthentificationDto Authentification() {
        Session session = null;
        Transaction tx = null;
        AuthentificationDto authentificationDto = null;

        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();


            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return authentificationDto;
    }
}
