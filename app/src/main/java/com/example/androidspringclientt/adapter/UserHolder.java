package com.example.androidspringclientt.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidspringclientt.R;

import org.jetbrains.annotations.NotNull;

public class UserHolder extends RecyclerView.ViewHolder {

    TextView name, location, branch;

    public UserHolder(@NotNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.userListItem_name);
        location = itemView.findViewById(R.id.userListItem_location);
        branch = itemView.findViewById(R.id.userListItem_branch);
    }
}
