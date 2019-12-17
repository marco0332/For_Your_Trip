package com.forb.backend.model.dto;

import java.io.Serializable;

public class Curriculum implements Serializable {

    String currId;
    String currName;
    String currList;

    public Curriculum() {  }

    public Curriculum(String currId, String currName, String currList) {
        this.currId = currId;
        this.currName = currName;
        this.currList = currList;
    }

    public String getCurrId() {
        return currId;
    }

    public void setCurrId(String currId) {
        this.currId = currId;
    }

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName;
    }

    public String getCurrList() {
        return currList;
    }

    public void setCurrList(String currList) {
        this.currList = currList;
    }

    @Override
    public String toString() {
        return "Curriculum [currId=" + currId + ", currList=" + currList + ", currName=" + currName + "]";
    }

}
