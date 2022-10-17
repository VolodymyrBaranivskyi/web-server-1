package com.interview.webserver1.logic.services;

import com.interview.webserver1.model.Create;
import com.interview.webserver1.model.CreateCallback;

public interface DocumentService {
    CreateCallback sendToSecondServer(Create create);
    void saveCallback(CreateCallback createCallback);
}
