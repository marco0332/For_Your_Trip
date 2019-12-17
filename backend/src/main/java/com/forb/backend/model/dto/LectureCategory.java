package com.forb.backend.model.dto;

import java.io.Serializable;

public class LectureCategory implements Serializable {

    String lcId;
    String lcName;
    String lcContent;
    String lcDate;
    String id; //ForeignKey(User);
    String lId; //ForeignKey(Lecture);

    public LectureCategory() {

    }

    public LectureCategory(String lcId, String lcName, String lcContent, String lcDate, String id, String lId) {
        this.lcId = lcId;
        this.lcName = lcName;
        this.lcContent = lcContent;
        this.lcDate = lcDate;
        this.id = id;
        this.lId = lId;
    }

    public String getLcId() {
        return lcId;
    }

    public void setLcId(String lcId) {
        this.lcId = lcId;
    }

    public String getLcName() {
        return lcName;
    }

    public void setLcName(String lcName) {
        this.lcName = lcName;
    }

    public String getLcContent() {
        return lcContent;
    }

    public void setLcContent(String lcContent) {
        this.lcContent = lcContent;
    }

    public String getLcDate() {
        return lcDate;
    }

    public void setLcDate(String lcDate) {
        this.lcDate = lcDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    @Override
    public String toString() {
        return "LectureCategory [id=" + id + ", lId=" + lId + ", lcContent=" + lcContent + ", lcDate=" + lcDate
                + ", lcId=" + lcId + ", lcName=" + lcName + "]";
    }

}
