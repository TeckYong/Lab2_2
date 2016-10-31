package com.example.user.lab2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editName;
    EditText editPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editName = (EditText) findViewById(R.id.editName);
        editPhone = (EditText) findViewById(R.id.editPhone);
    }

    public void submitMessage(View view){
        String name = editName.getText().toString();
        String phone = editPhone.getText().toString();

        Intent intentMsg = new Intent();

        intentMsg.putExtra("NAME", name);
        intentMsg.putExtra("PHONE", phone);

        setResult(2, intentMsg);
        finish();
    }
}
