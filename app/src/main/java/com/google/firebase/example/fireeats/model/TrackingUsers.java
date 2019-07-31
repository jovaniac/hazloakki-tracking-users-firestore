package com.google.firebase.example.fireeats.model;


import com.google.firebase.firestore.GeoPoint;

public class TrackingUsers {

    private String usuario;
    private GeoPoint point;


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public GeoPoint getPoint() {
        return point;
    }

    public void setPoint(GeoPoint point) {
        this.point = point;
    }
}
