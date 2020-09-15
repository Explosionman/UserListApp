package com.example.userlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //вызов метода родитея
        super.onCreate(savedInstanceState);
        //размещаем пользовательский интерфейс на активности
        setContentView(R.layout.activity_main);

        //Объявляем менеджера по фрагментам, далее после = инициализиреум его через метод,
        //который возвращает объект, управляющий фрагментами
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Объявляем фрагмент и инициализируем его нашим классом AddUserFragment, который наследуется
        //от Fragment
        Fragment fragment = new AddUserFragment();
        //В данной строке мы добавляем фрагмент в контейнер через транзакцию
        fragmentManager.beginTransaction().add(R.id.fragmentContainer,fragment).commit();


    }
}