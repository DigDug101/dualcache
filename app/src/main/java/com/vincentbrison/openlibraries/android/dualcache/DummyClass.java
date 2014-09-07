package com.vincentbrison.openlibraries.android.dualcache;

import java.util.ArrayList;
import java.util.List;

public class DummyClass {
    protected String dummyString;
    protected Object dummyObject;
    protected int dummyInt;
    protected List<Object> dummyList;

    public DummyClass() {
        dummyString = "dummy string";
        dummyObject = new String("dummy object");
        dummyInt = 0;
        dummyList = new ArrayList<Object>();
        for (int i = 0; i < 100; i++) {
            dummyList.add("dummy object");
        }
    }
}
