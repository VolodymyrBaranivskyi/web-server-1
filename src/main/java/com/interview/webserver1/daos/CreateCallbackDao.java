package com.interview.webserver1.daos;

import com.interview.webserver1.model.CreateCallback;

public interface CreateCallbackDao extends AbstractDao{
    void saveCreateCallback(CreateCallback createCallback);
}