package com.example.userlist;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//синглтон, который гарантирует существование только одного объекта класса UserList
public class UserList {
    //Объявляем поля класса приватными (Объект самого себя и список для хранения пользователей
    private static UserList userList;
    private List<User> users;

    //геттер на список пользователей
    public List<User> getUsers() {
        return users;
    }

    //метод, для получения пользователя по id
    public User getUser(UUID id){
        //цикл for each, перебираем пользователей из списка
        for(User user : users)
            //если входящий id эквивалентен одному из id из списка пользователей
            if (user.getUserId().equals(id))
                //то возвращаем этого пользователя
                return user;
        //если пользователь не будет найден, вернется null
        return null;
    }

    //Получение объекта USerList
    public static UserList get(){
        //если объект ещё не создан
        if(userList == null)
            //то инициализируем его
            userList = new UserList();
        //возвращаем объект класса UserList
        return userList;
    }

    //приватный конструктор
    private UserList() {
        //инициализируем список
        users = new ArrayList<>();
        //ренерируем пользователей через цикл
        for (int i=0; i<100; i++){
            //на каждой итерации цикла создаём объект класса User
            User user = new User();
            //устанавливаем ему имя
            user.setUserName("Пользователь №"+i);
            //добавляем его в список
            users.add(user);
        }
    }
}
