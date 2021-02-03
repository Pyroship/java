package com.MyStudies;

import java.io.Serializable;

public class Course implements Serializable {
    private int id;
    private String title;


    public Course (int id, String title){
        this.title = title;
        this.id = id;
    }

    public String toString(){
    // return String.valueOf(id);  // Привести тип данных к строке
      return id + " - " + title;
        }
    public boolean equals(Course obj){
        return  id == obj.id;
    }
}

