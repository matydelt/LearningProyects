package com.marketplace.models;

import java.util.List;

public class Category {
    private String id;
    private int visits;
    private List<History> history;


    public int getVisits() {
        return visits;
    }

    public void setVisits() {
        this.visits++;
    }

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }
}
