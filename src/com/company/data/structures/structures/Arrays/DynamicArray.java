package com.company.data.structures.structures.Arrays;

import java.util.Arrays;

public class DynamicArray {

    /*Dynamic array:
    * Array with flexible size
    * */

    public static void main(String[] args) {

        DynamicImplementation dynamic=new DynamicImplementation();
        dynamic.addElement(12);
        System.out.println(dynamic.getLength());
        //duplicate size
        dynamic.addElement(18);
        System.out.println(dynamic.getLength());
        //here it will duplicate size
        dynamic.addElement(40);
        System.out.println(dynamic.getLength());
        //no duplication
        dynamic.addElement(55);
        System.out.println(dynamic.getLength());

    }




}
