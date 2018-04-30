package fr.ccva.pepitlab.dao.impl;

import fr.ccva.pepitlab.dao.NewDao;
import fr.ccva.pepitlab.model.New;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

@Repository
public class NewDaoImpl implements NewDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<New> getNews() {
        TypedQuery<New> query = sessionFactory.getCurrentSession().createNamedQuery("new.listToDisplay");
        query.setParameter("startDate", new Date());
        query.setParameter("endDate", new Date());

        return query.getResultList();
    }
}
