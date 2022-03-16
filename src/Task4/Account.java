/*
Create an Account class with parameters:
- int id;
- String name;
- String surname;
- double balance;
Getters and Setters
+ String toString (); //// This method is all field values
 */

package Task4;

public class Account {
    private Integer id;
    private String name;
    private String surname;
    private Double balance;

    public Account(){}
    public Account(Integer id, String name, String surname, Double balance){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Double getBalance(){
        return  balance;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    @Override
    public String toString(){
        return id+" "+name+" "+surname+" "+balance;
    }
}
