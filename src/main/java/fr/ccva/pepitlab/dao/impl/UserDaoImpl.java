package fr.ccva.pepitlab.dao.impl;

import fr.ccva.pepitlab.dao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import fr.ccva.pepitlab.model.User;

import javax.persistence.TypedQuery;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getByEmail(String email) {
        TypedQuery<User> query = this.sessionFactory.getCurrentSession().createNamedQuery("user.getByEmail", User.class);

        query.setParameter("email", email);

        return query.getSingleResult();
    }
}
