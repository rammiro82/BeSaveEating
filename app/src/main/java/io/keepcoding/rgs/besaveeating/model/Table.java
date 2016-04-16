package io.keepcoding.rgs.besaveeating.model;

import java.util.LinkedList;

/**
 * Created by RamiroGarcia on 16/4/16.
 */
public class Table {

    int id;

    // number of people
    int size;

    LinkedList<Dish> dishes = new LinkedList<Dish>();

    boolean isAvailable = false;


    public Table(int id, int size) {
        this.id = id;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void addDish(Dish _dish){
        this.dishes.add(_dish);
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", size=" + size +
                ", dishes=" + dishes +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
