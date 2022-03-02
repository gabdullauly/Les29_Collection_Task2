/*
Create Class Cat
-String name
-int age;
Constructors
Get/set
Implement Animal and its methods
 */

package Task2;

public class Cat implements Animal{
    private String name;
    private int age;

    public Cat(){}
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
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

    @Override
    public void speak(){
        System.out.println("Myauu myauuuuuuu");
    }

    public String getData(){
        return name+" "+age;
    }
}
