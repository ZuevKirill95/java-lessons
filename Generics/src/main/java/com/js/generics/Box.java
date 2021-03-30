package com.js.generics;

public class Box<T, V> {
    private T thing1;
    private V thing2;

    public V getThing2() {
        return thing2;
    }

    public void setThing2(V thing2) {
        this.thing2 = thing2;
    }

    public T getThing1() {
        return thing1;
    }

    public void setThing1(T thing1) {
        this.thing1 = thing1;
    }
}


