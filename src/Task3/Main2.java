/*
Create a User class with parameters:
+ Users () // Default constructor
+ Users (int id, String login, String password, String name, String surname)
- int id
- String login
- String password
-String name
-String surname
+ User ()
+ User (int id, login, password, name, surname) Getters and Setters
+ String getData () // This method returns all user data
Создать меню
1- создать User(Добавить в массив)
2- Посмотреть список всех
3- Удалить весь список
4- Выйти из программы
 */

package Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<User> users = new ArrayList<>();
    public static void createUser(){
        System.out.println("--------------");
        System.out.println("Меню создания User:");
        System.out.print("Введите id:");
        Integer id = scan.nextInt();
        System.out.print("Введите login:");
        String login = scan.next();
        System.out.print("Введите password:");
        String password = scan.next();
        System.out.print("Введите name:");
        String name = scan.next();
        System.out.print("Введите surname:");
        String surname = scan.next();

        if (id!=null && !login.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty()
                && !surname.trim().isEmpty()){
            User user1 = new User();
            user1.setId(id);
            user1.setLogin(login);
            user1.setPassword(password);
            user1.setName(name);
            user1.setSurname(surname);
            users.add(new User(id, login, password, name, surname));
            System.out.println("User создан успешно!");
        }
        else {
            System.out.println("Произошла ошибка, повторите!");
        }
    }

    public static void showUsers(){
        System.out.println("-------------------");
        for (int i=0; i< users.size(); i++){
            System.out.println(users.get(i).getData());
        }
    }

    public static void deleteList(){
        users.clear();
        System.out.println("Список User-ов очищен");
    }

    public static void deleteUserById(){
        System.out.print("Введите id User-а которого хотите удалить: ");
        int id = scan.nextInt();
        for (int i=0; i< users.size(); i++){
            if (users.get(i).getId()==id){
                users.remove(i);
                break;
            }
        }
        System.out.println("User успешно удален!");
    }

    public static User getUserById(Integer id){
        for (int i=0; i< users.size(); i++){
            if (users.get(i).getId()==id){
                return users.get(i);
            }
        }
        return null;
    }

    public static void editById(){
        showUsers();
        System.out.print("Введите id User-a которого хотитет изменить: ");
        int id = scan.nextInt();
        User user = getUserById(id);
        if (user!=null){
            System.out.print("Введите login: ");
            String login = scan.next();
            System.out.print("Введите password: ");
            String password = scan.next();
            System.out.print("Введите name: ");
            String name = scan.next();
            System.out.print("Введите surname: ");
            String surname = scan.next();
            if (!login.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty() && !surname.trim().isEmpty()){
                user.setLogin(login);
                user.setPassword(password);
                user.setName(name);
                user.setSurname(surname);
                System.out.println("User успешно изменен!");
            }
        }
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("--------------");
            System.out.println("Основное меню:");
            System.out.println("1 - Создать User");
            System.out.println("2 - Посмотреть список всех User");
            System.out.println("3 - Удалить весь список");
            System.out.println("4 - Удалить User-а по id");
            System.out.println("5 - Редактировать данные User-a по id");
            System.out.println("6 - Выйти из программы");
            System.out.print("Выберите меню: ");
            int k = scan.nextInt();
            if (k==1){
                createUser();
            }
            if (k==2){
                showUsers();
            }
            if (k==3){
                deleteList();
            }
            if (k==4){
                deleteUserById();
            }
            if (k==5){
                editById();
            }
            if (k==6){
                System.out.println("Процесс завершен, спасибо!");
                break;
            }
        }
    }
}
