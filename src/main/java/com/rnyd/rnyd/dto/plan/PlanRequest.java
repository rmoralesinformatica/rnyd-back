package com.rnyd.rnyd.dto.plan;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanRequest {
    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @JsonProperty("plan")
    private String plan;

    public PlanRequest(String plan) {
        this.plan = plan;
    }
}

