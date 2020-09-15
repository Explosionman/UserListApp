package com.example.userlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<User> users;
    private LayoutInflater inflater;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.ItemView);
        }
    }

    public MyAdapter(Context context, List<User> users) {
        this.inflater = LayoutInflater.from(context);
        this.users = users;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fragment_user_list, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        User user = users.get(position);
        holder.textView.setText(user.getUserName());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
