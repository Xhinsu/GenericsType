package org.example;
//the method signature in interface has to match with box
public interface BoxOperations<V> {

    public abstract V getLargestValue();


    public abstract void setLargestValue(V a, V b);
}
