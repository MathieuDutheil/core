package com.mathieudutheil.escalade.core.service;

import com.mathieudutheil.escalade.core.HibernateUtil;
import com.mathieudutheil.escalade.core.dto.CiviliteDto;
import com.mathieudutheil.escalade.core.entity.Civilite;
import com.mathieudutheil.escalade.core.repository.CiviliteRepositoryImpl;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CiviliteService {

    private CiviliteRepositoryImpl civiliteRepository;

    public CiviliteService() {
        this.civiliteRepository = new CiviliteRepositoryImpl();
    }

    public CiviliteDto getCivilite(Byte id) {
        Session session = null;
        Transaction tx = null;
        Civilite civilite = null;
        CiviliteDto civiliteDto = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            civilite = civiliteRepository.getCiviliteById(id);
            civiliteDto = new CiviliteDto();
            civiliteDto.setId(civilite.getId());
            civiliteDto.setCivilite(civilite.getCivilite());
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
        return civiliteDto;
    }


}
