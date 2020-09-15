package com.example.userlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class UserListActivity extends AppCompatActivity {

    private RecyclerView userListRecyclerView;
    private MyAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        userListRecyclerView = findViewById(R.id.userListRecyclerView);
        layoutManager = new LinearLayoutManager(this);
        userListRecyclerView.setLayoutManager(layoutManager);

        adapter = new MyAdapter(this, UserList.get().getUsers());
        userListRecyclerView.setAdapter(adapter);
    }
}