package com.oulim.app.volunteer.dto;

import java.sql.Date;

public class VolunteerActivityDTO {

    private int volunActNo;
    private String volunActTitle;
    private String volunActAddress;
    private Date volunActProcBegin;
    private Date volunActProcEnd;
    private int volunActPoint;
    private int volunActType;

    public int getVolunActNo() {
        return volunActNo;
    }

    public void setVolunActNo(int volunActNo) {
        this.volunActNo = volunActNo;
    }

    public String getVolunActTitle() {
        return volunActTitle;
    }

    public void setVolunActTitle(String volunActTitle) {
        this.volunActTitle = volunActTitle;
    }

    public String getVolunActAddress() {
        return volunActAddress;
    }

    public void setVolunActAddress(String volunActAddress) {
        this.volunActAddress = volunActAddress;
    }

    public Date getVolunActProcBegin() {
        return volunActProcBegin;
    }

    public void setVolunActProcBegin(Date volunActProcBegin) {
        this.volunActProcBegin = volunActProcBegin;
    }

    public Date getVolunActProcEnd() {
        return volunActProcEnd;
    }

    public void setVolunActProcEnd(Date volunActProcEnd) {
        this.volunActProcEnd = volunActProcEnd;
    }

    public int getVolunActPoint() {
        return volunActPoint;
    }

    public void setVolunActPoint(int volunActPoint) {
        this.volunActPoint = volunActPoint;
    }

    public int getVolunActType() {
        return volunActType;
    }

    public void setVolunActType(int volunActType) {
        this.volunActType = volunActType;
    }
}