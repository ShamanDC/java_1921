package ru.itstep;

public class MyCollection {

    String [] arr = new String[3];
    int index = 0;
    int selector = 0;

    public boolean add(String element) {
        if(arr.length > index) {
            arr[index++] = element;
            return true;
        }
        return false;
    }

    public String next() {
        return arr[selector++];
    }

    public boolean hasNext() {
        if(selector < arr.length) {
            return true;
        }
        return false;
    }


}
