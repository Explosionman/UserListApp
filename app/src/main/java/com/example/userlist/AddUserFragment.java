package com.example.userlist;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

//Создаём собственный фрагмент
public class AddUserFragment extends Fragment {
    //Объявляем объект класса User
    private User user;
    //Объявление компонентов, текстовое поле, кнопка, текстовая вьюшка
    private EditText editUserName;
    private Button editUserDataBtn;
    private TextView changeUserData;


    //Вызывается для начальной инициализации
    @Override
    public void onCreate(Bundle savedInstanceState) {
        //вызываем метод родителя
        super.onCreate(savedInstanceState);
        //инициализируем объект класса User
        user = new User();
    }

    //Вызывается для создания компонентов внутри фрагмента
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //загружаем файл разметки (add_user.xml) в контейнер
        View v = inflater.inflate(R.layout.add_user, container,false);

        //инициализируем компоненты (текстовое поле, кнопка, текстовая вьюшка) через id
        //указанный в add_user.xml
        editUserName = v.findViewById(R.id.editUserName);
        editUserDataBtn=v.findViewById(R.id.editUserDataBtn);
        changeUserData = v.findViewById(R.id.changeUserData);

        //устанавливаем слушателя для слежки за изменениями в поле EditText (объект editUserName)
        editUserName.addTextChangedListener(new TextWatcher() {
            //т.к. TextWatcher - это интерфейс, реализуем его методы

            //действия перед изменением текста
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            //действия при изменении текста
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                changeUserData.setText("Имя пользователя: "+charSequence.toString());
            }
            //действия после изменения текста
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        //возвращаем созданный объект
        return v;
    }
}
