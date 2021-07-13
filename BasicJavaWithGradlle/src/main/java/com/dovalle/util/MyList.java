package com.dovalle.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyList {
    /*Lists are evolution from Arrays, because
            its possible order, add, remove elements.
        */
    List<String> lstNames = null;

    public MyList(){
        loadNames();
    }

    public List<String> getLstNames() {
        return lstNames;
    }

    public void setLstNames(List<String> lstNames) {
        this.lstNames = lstNames;
    }

    private void loadNames(){
        lstNames = new ArrayList<>();
        lstNames.add("John");
        lstNames.add("Mary");
        lstNames.add("Iza");
        lstNames.add("Lipe");
    }

    public String compareListOrder (){
        StringBuilder values = new StringBuilder();
        values.append(String.format("\nList order by defaul:\n %s", this.getLstNames()));
        Collections.sort(this.getLstNames());
        values.append(String.format("\nList order by name:\n %s", this.getLstNames()));
        return values.toString();
    }
}
