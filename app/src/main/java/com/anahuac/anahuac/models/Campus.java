package com.anahuac.anahuac.models;

public class Campus {
    private String name;
    private int drawable;

    public Campus(String name, int drawable){
        this.name = name;
        this.drawable = drawable;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
