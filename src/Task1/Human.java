package Task1;/*
Abstract Class Task1.Human
-int name
-int age
Getter/setter
Constructor default+param
Abstract void printData()
 */

import java.util.ArrayList;

public abstract class Human {
    private String name;
    private int age;

    public Human (){};
    public Human (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName (){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public abstract void printData();



}
