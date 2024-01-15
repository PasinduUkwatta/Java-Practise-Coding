package org.example;

import java.util.ArrayList;

public class MyCustomList <T>{
    ArrayList<T> list =new ArrayList<T>();

    void addElement(T elemnt){
        list.add(elemnt);
    }

    void removeElement(T elemnt){
        list.remove(elemnt);
    }

    int getElement(T elemnt){
       return (int) list.get((Integer) elemnt);
    }

    @Override
    public String toString() {
        return "MyCustomList{" +
                "list=" + list +
                '}';
    }
}
