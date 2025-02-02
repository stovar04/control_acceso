package com.access.control.dto;

import com.access.control.model.PisoPermiso;
import com.access.control.model.PisoPermisoVisita;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitaDto implements Serializable {

    private static final long serialVersionUID =7L;
    private Long id;
    private Integer state;
    private Integer document;
    private String typeDocument;
    private Integer badgeAccess;

    private String name;

    private String lastName;

    private Boolean enabled;

    private String elements;

    private String picture;

    private String sex;

    @JsonProperty("visitDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Past
    @Column(name="visit_date")
    private Date visitDate;

    private String huella1;

    private String huella2;

    private List<PisoPermisoVisita> listPisos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }

    public Integer getBadgeAccess() {
        return badgeAccess;
    }

    public void setBadgeAccess(Integer badgeAccess) {
        this.badgeAccess = badgeAccess;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getElements() {
        return elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getHuella1() {
        return huella1;
    }

    public void setHuella1(String huella1) {
        this.huella1 = huella1;
    }

    public String getHuella2() {
        return huella2;
    }

    public void setHuella2(String huella2) {
        this.huella2 = huella2;
    }

    public List<PisoPermisoVisita> getListPisos() {
        return listPisos;
    }

    public void setListPisos(List<PisoPermisoVisita> listPisos) {
        this.listPisos = listPisos;
    }

}
