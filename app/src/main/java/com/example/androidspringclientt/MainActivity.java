package com.example.androidspringclientt;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        initializeComponents();
    }

    private void initializeComponents() {
        TextInputEditText inputEditName= findViewById(R.id.form_textFieldName);
        TextInputEditText inputEditBranch= findViewById(R.id.form_textFieldBranch);
        TextInputEditText inputEditLocation= findViewById(R.id.form_textFieldLocation);
        MaterialButton buttonSave= findViewById(R.id.form_buttonSave);

        buttonSave.setOnClickListener( view -> {
            String name = String.valueOf(inputEditName.getText());
            String branch = String.valueOf(inputEditBranch.getText());
            String location = String.valueOf(inputEditLocation.getText());
        });
    }
}