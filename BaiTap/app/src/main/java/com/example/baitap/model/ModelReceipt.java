package com.example.baitap.model;


import java.util.ArrayList;

public class ModelReceipt {
    private Integer id;
    private String username;
    private String mail;
    private ArrayList<ModelReciptDetail> listProduct;

    public ModelReceipt( String customerUsername, String email, ArrayList<ModelReciptDetail> listProduct){
        this.username = customerUsername;
        this.mail = email;
        this.listProduct = listProduct;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public ArrayList<ModelReciptDetail> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<ModelReciptDetail> listProduct) {
        this.listProduct = listProduct;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
