package com.dovalle.classes;

import com.dovalle.interfaces.DomainValue;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StateProvince implements DomainValue {
    @Id
    public Integer code;
    @Column
    public String name;
    @Column
    public String initials;
    /*
    //sample how to do a bidirectional mapping between Person and State
    @OneToMany(mappedBy="code", cascade = CascadeType.ALL, orphanRemoval = true)
     */
    @Transient
    private List<Person> personsBirthInto;

    public StateProvince(){
        this.code = 0;
        this.name = "";
        this.initials = "";
        this.personsBirthInto = new ArrayList<>();
    }

    public StateProvince(Integer codeState, String nameState, String initiialsState){
        this.code = codeState;
        this.name = nameState;
        this.initials = initiialsState;
        this.personsBirthInto = new ArrayList<>();
    }

    @Override
    public String toString() {
        return showDetails(this.code, this.name, this.initials);
    }
}
