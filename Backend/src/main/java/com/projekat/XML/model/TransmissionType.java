package com.projekat.XML.model;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class TransmissionType {
    

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String code;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getID(){
        return this.id;
    }

    public void setID(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public TransmissionType (){

    }

    public TransmissionType (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "TransType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}