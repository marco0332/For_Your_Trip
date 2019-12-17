package com.forb.backend.model.dto;

import java.io.Serializable;

public class ClassCategory implements Serializable {

    String cateId;
    String cateName;
    String cateConten;
    String cateDate;
    String id; //ForeignKey(User);
    String cId; //ForeignKey(Class);

    public ClassCategory() { }

    public ClassCategory(String cateId, String cateName, String cateConten, String cateDate, String id,
            String cId) {
        this.cateId = cateId;
        this.cateName = cateName;
        this.cateConten = cateConten;
        this.cateDate = cateDate;
        this.id = id;
        this.cId = cId;
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getCateConten() {
        return cateConten;
    }

    public void setCateConten(String cateConten) {
        this.cateConten = cateConten;
    }

    public String getCateDate() {
        return cateDate;
    }

    public void setCateDate(String cateDate) {
        this.cateDate = cateDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "ClassCategory [cId=" + cId + ", cateConten=" + cateConten + ", cateDate=" + cateDate + ", cateId="
                + cateId + ", cateName=" + cateName + ", id=" + id + "]";
    }

}
