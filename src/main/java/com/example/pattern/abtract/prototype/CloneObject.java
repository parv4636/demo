package com.example.pattern.abtract.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CloneObject implements Cloneable {

    private List<String> memList;

    public CloneObject() {
        memList = new ArrayList<String>();
    }

    public CloneObject(List<String> list) {
        this.memList = list;
    }

    public void loadData() {
        //read all employees from database and put into the list
        memList.add("Pankaj");
        memList.add("Raj");
        memList.add("David");
        memList.add("Lisa");
    }

    public String getListAsString(){
        String listString = memList.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
        return listString;
    }
    
    public List<String> getMemList() {
        return memList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getMemList()) {
            temp.add(s);
        }
        return new CloneObject(temp);
    }

}

