package com.example.androidspringclientt;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidspringclientt.adapter.UserAdapter;
import com.example.androidspringclientt.model.User;
import com.example.androidspringclientt.retrofit.RetrofitService;
import com.example.androidspringclientt.retrofit.UserApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_list);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;

        recyclerView = findViewById(R.id.userList_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadUsers();
        }
//        );

    private void loadUsers() {
        RetrofitService retrofitService = new RetrofitService();
        UserApi userApi = retrofitService.getRetrofit().create(UserApi.class); // This line creates an instance of UserApi
        userApi.getAllUsers().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                populateListView(response.body());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Toast.makeText(UserListActivity.this, "Fail to load Users",Toast.LENGTH_SHORT).show();

            }
        });
    }
        private void populateListView(List<User> userList) {
            UserAdapter userAdapter = new UserAdapter(userList);
            recyclerView.setAdapter(userAdapter);
            }
    }