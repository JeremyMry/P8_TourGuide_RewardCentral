package com.tourguide.rewardCentral.controller;

import com.tourguide.rewardCentral.service.RewardCentralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RewardCentralController {

    @Autowired
    RewardCentralService rewardCentralService;

    @GetMapping("/getRewardsPoints")
    public int getRewardsPointsServer(@RequestParam String attractionId, String user) {
        return rewardCentralService.getAttractionRewardPoints(UUID.fromString(attractionId), UUID.fromString(user));
    }
}
