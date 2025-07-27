package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    public void displayInfo(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class cwh_40_ch9_setter_getter {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        //System.out.println(harry.getName());
        harry.setId(234);
        //System.out.println(harry.getId());

        harry.displayInfo();
    }
}
