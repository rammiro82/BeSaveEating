package io.keepcoding.rgs.besaveeating.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RamiroGarcia on 16/4/16.
 */
public class Dish {

    enum POSSIBLE_ALLERGENS {GLUTEN, EGG, FISH, PEANUTS, SOYBEANS, MILK};

    String name;
    String description;
    Float price;

    List<String> allergens = new ArrayList<String>();

    public Dish(String name, String description, Float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public List<String> getAllergens() {
        return allergens;
    }

    public void setAllergens(List<String> allergens) {
        this.allergens = allergens;
    }

    public void addAllergen(String _allergen){
        this.allergens.add(_allergen);
    }

    public boolean hasEllergens(){
        return (this.allergens == null
                || this.allergens.size()>0)?true:false;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", allergens=" + allergens +
                '}';
    }
}
