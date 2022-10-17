package com.interview.webserver1.daos.impl;

import com.interview.webserver1.daos.CreateCallbackDao;
import com.interview.webserver1.model.CreateCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CreateCallbackDaoImpl extends AbstractDaoImpl implements CreateCallbackDao {

    @Autowired
    protected CreateCallbackDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void saveCreateCallback(CreateCallback createCallback) {
        Session session = getCurrentSession();
        session.save(createCallback);
    }
}