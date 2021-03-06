package com.an7one.example.effectivejava.ch05generics.item28.counterexample;

import com.an7one.example.effectivejava.util.Constant;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class Demo {
        public void demo() {
                Object[] objectArray = new Long[1];
                // expected exception: ArrayStoreException
                // objectArray[0] = "I do not fit in";

                // Will not compile
                // List<Object> list = new ArrayList<Long>();
                // list.add("I do not fit it");

                // Counter example: why is generic array creation illegal?
                // List<String>[] stringLists = new List<String>[1];
                // List<Integer> intList = List.of(42);
                // Object[] objects = stringLists;
                // objects[0] = intList;
                // String str = stringLists[0].get(0);
        }
}
