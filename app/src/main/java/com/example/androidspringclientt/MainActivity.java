package com.example.androidspringclientt;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidspringclientt.model.User;
import com.example.androidspringclientt.retrofit.RetrofitService;
import com.example.androidspringclientt.retrofit.UserApi;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents();
    }

    private void initializeComponents() {
        TextInputEditText inputEditName= findViewById(R.id.form_textFieldName);
        TextInputEditText inputEditBranch= findViewById(R.id.form_textFieldBranch);
        TextInputEditText inputEditLocation= findViewById(R.id.form_textFieldLocation);
        MaterialButton buttonSave= findViewById(R.id.form_buttonSave);

        RetrofitService retrofitService = new RetrofitService();
        retrofitService.getRetrofit().create(UserApi.class);

        buttonSave.setOnClickListener( view -> {
            String name = String.valueOf(inputEditName.getText());
            String branch = String.valueOf(inputEditBranch.getText());
            String location = String.valueOf(inputEditLocation.getText());


        User user = new User(1, "test@gmail.com", "test1234", "testmmss");
        user.setUserName(name);
        user.setBranch(branch);
        user.setLocation(location);

        UserApi.save(user).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Toast.makeText(MainActivity.this, "Save successful!!!! : D ", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Save failed..! X ( ", Toast.LENGTH_SHORT).show();
                Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, "ERROR !!!! : 0 !!!!");
            }
        });

        });
    }
}