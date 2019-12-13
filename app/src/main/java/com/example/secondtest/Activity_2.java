package com.example.secondtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button second=findViewById(R.id.Second);
        final Intent intent=getIntent();
        final   String num=intent.getStringExtra("String");
        Toast.makeText(this,num,Toast.LENGTH_SHORT).show();
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent=getIntent();

                intent.putExtra("BackNum","The back String is "+num);
                setResult(0,intent);
                finish();
            }
        });
    }
}
