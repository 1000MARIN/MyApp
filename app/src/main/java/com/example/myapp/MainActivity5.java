package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //다음 버튼 클릭시 액티비티 전환
        Button yes_btn_1 = (Button) findViewById(R.id.yes_btn_1);
        yes_btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(intent);

            }
        });

        //다음 버튼 클릭시 액티비티 전환
        Button no_btn_1 = (Button) findViewById(R.id.no_btn_1);
        no_btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(intent);

            }
        });
    }
}