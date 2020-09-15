package com.example.userlist;

import java.util.Date;
import java.util.UUID;

public class User {
    //объявление полей класса
    //UUID представляет универсальный уникальный идентификатор
    private UUID userId;
    //имя пользователя
    private String userName;
    //дата рождения пользователя
    private Date userBirthday;

    //конструктор
    public User(){
        //инициализация объекта userId
        userId = UUID.randomUUID();
    }

    //ниже геттеры и сеттеры на поля класса
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }
}