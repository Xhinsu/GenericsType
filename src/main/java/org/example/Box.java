package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T , V> {
    private T storedValue;
    private String name;
    private V largestValue;

    public T getStoredValue(T storedValue){
        return storedValue;
    }

    public void setStoredValue(T storedValue){
        this.storedValue = storedValue;
    }

    public V getLargestValue() {
        return largestValue;
    }

    public <U> T castValue(U Box){

        return (T) Box;
    }

    public boolean hasSameName (Box <?> box) {

        return box.name.equals(this.name);
    }

    public <V extends Number> void setLargestValue(V a, V b) {

        V largestValue =  (a.doubleValue() + b.doubleValue());

    }

    public Box(String name) {
        this.name = name;
    }

}
