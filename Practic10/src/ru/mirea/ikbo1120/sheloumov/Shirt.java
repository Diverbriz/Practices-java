package ru.mirea.ikbo1120.sheloumov;

public class Shirt {
    private String id, name, color, size;
    public Shirt(String id,String name,String color,String size){
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
