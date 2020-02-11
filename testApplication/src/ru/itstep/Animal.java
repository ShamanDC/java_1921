package ru.itstep;

import java.lang.Comparable;

public class Animal  {

    private String breed;

    private Integer price;

    public Animal(String breed, Integer price) {
        this.breed = breed;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
//
//    @Override
//    public int compareTo(Animal animal) {
//        return this.breed.compareTo(animal.breed);
//        if( this.price > ((Animal)o).price) {
//            return 1;
//        } else if (this.price < ((Animal)o).price) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}
