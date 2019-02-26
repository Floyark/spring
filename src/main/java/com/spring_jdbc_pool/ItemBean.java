package com.spring_jdbc_pool;

public class ItemBean {
    private int Id;
    private String Name;
    private String description;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ItemBean{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
