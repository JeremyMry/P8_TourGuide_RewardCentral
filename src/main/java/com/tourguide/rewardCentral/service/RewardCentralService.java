package com.tourguide.rewardCentral.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Service
public class RewardCentralService {


    private Logger logger = LoggerFactory.getLogger(RewardCentralService.class);

    public RewardCentralService() { }

    public int getAttractionRewardPoints(UUID attractionId, UUID userId) {
        try {
            TimeUnit.MILLISECONDS.sleep((long) ThreadLocalRandom.current().nextInt(1, 1000));
        } catch (InterruptedException var4) {
        }
        int randomInt = ThreadLocalRandom.current().nextInt(1, 1000);

        logger.debug("test");

        return randomInt;
    }
}
