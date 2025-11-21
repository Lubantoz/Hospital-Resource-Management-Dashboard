package com.hospital.models;

public class Bed {
    private int id;
    private String ward;
    private boolean occupied;

    public Bed() {
    }

    public Bed(int id, String ward, boolean occupied) {
        this.id = id;
        this.ward = ward;
        this.occupied = occupied;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
