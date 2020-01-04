package com.example.spinnertospinner;

public class JenisHpPojo {
    private String id, idMerk, name;

    public JenisHpPojo(String id, String idMerk, String name) {
        this.id = id;
        this.idMerk = idMerk;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMerk() {
        return idMerk;
    }

    public void setIdMerk(String idMerk) {
        this.idMerk = idMerk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
