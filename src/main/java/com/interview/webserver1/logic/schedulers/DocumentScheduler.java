package com.interview.webserver1.logic.schedulers;

import org.springframework.scheduling.annotation.Scheduled;

public interface DocumentScheduler {

    @Scheduled(cron = "${create.send_to_second_server.cron_expression}")
    void runSendToSecondServer();
}
