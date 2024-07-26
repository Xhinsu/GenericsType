package org.example;
//box V and BoxOperations V not same, so we pass <V> to interface
public class Box<T,V extends Number> implements BoxOperations<V> {
    private T storedValue;
    private String name;
    private V largestValue;

    public T getStoredValue(T storedValue){
        return storedValue;
    }

    public void setStoredValue(T storedValue){
        this.storedValue = storedValue;
    }

    public <U> T castValue(U Box){

        return (T) Box;
    }

    public boolean hasSameName (Box <?,?> box) {

        return box.name.equals(this.name);
    }

    public V getLargestValue() {
        return largestValue;
    }


    public void setLargestValue(V a, V b) {
    V result;

        if(a.doubleValue() > b.doubleValue()){
            result = a;
        }
        result=b;
        System.out.println(result);

    }

    public Box(String name) {
        this.name = name;
    }

    }

