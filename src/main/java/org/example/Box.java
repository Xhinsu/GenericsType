package org.example;

public class Box<T> {
    private T storedValue;

    public T getStoredValue(T storedValue){
        return storedValue;
    }

    public void setStoredValue(T storedValue){
        this.storedValue = storedValue;
    }

    public T castValue(T Box){
        T temp = Box;
        return temp;

    }

}
