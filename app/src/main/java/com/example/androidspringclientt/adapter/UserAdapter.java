package com.example.androidspringclientt.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidspringclientt.R;
import com.example.androidspringclientt.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserHolder> {

    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_user_item, parent, false);
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        User user  = userList.get(position);
        holder.name.setText(user.getUserName());
        holder.location.setText(user.getLocation());
        holder.branch.setText(user.getBranch());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
