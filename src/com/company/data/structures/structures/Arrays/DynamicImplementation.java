package com.company.data.structures.structures.Arrays;

import java.util.Arrays;

public class DynamicImplementation {

     int [] dynamic;
     int size=0;

     //initialize array using constructor
    public DynamicImplementation() {
        dynamic=new int[1];
    }

    //get an item from array
    public  int getItem(int index){
        return dynamic[index];
    }

    //get size of array
    public int getLength()
    {
        return dynamic.length;
    }

    //adding an element
    public  void addElement(int element){
        ensureSize(size+1);
        dynamic[size++]=element;
    }

    /*ensure that the array has a free index to add new element
    * if not
    * it will duplicate the size of array
    * */
    public  void ensureSize(int minSize){
        int oldSize=dynamic.length;
        if(minSize>oldSize) {
            int newSize=oldSize*2;
            dynamic= Arrays.copyOf(dynamic,newSize);
        }
    }
}
