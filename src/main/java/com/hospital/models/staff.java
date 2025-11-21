package com.hospital.models;

public class Staff {
    private int id;
    private String name;
    private String role;
    private String shift;

    public Staff() {
    }

    public Staff(int id, String name, String role, String shift) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.shift = shift;
    }

}
