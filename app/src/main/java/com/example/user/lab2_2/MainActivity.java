package com.example.user.lab2_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String phone = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getMessage(View view){
        //Intent intentGetMessage = new Intent(this,SecondActivity.class);
        //startActivityForResult(intentGetMessage,2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==2){
            if(null!=data){
                String name = data.getStringExtra("NAME");
                TextView nameMessage = (TextView) findViewById(R.id.Name);
                nameMessage.setText("Name: " + name);

                phone = data.getStringExtra("PHONE");
                TextView phoneMessage = (TextView) findViewById(R.id.Phone);
                nameMessage.setText("Phone: " + phone);
            }
        }
    }

    public void dial(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
        startActivity(intent);
    }
}
