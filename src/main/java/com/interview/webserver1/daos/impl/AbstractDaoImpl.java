package com.interview.webserver1.daos.impl;

import com.interview.webserver1.daos.AbstractDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AbstractDaoImpl implements AbstractDao {
    private final SessionFactory sessionFactory;

    protected AbstractDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    Session getCurrentSession() {
        sessionFactory.openStatelessSession();
        return sessionFactory.getCurrentSession();
    }

    Session openSession() {
        return sessionFactory.openSession();
    }
}