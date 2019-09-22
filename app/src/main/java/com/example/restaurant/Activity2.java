package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button button = (Button) findViewById(R.id.food1);
        Button btn = (Button) findViewById(R.id.food2);
        Button tombol = (Button) findViewById(R.id.minum1);
        Button pencet = (Button) findViewById(R.id.minum2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNasigoreng();

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBurgerkeju();
            }
        });

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCincau();
            }
        });
        pencet.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEsteler();
            }
        }));


    }
    public void openNasigoreng() {
        Intent intent = new Intent(this, Nasigoreng.class);
        startActivity(intent);

    }
    public void openBurgerkeju() {
        Intent intent = new Intent(this, Burgerkeju.class);
        startActivity(intent);

    }
    public void openCincau(){
        Intent intent = new Intent(this, Cincau.class);
        startActivity(intent);
    }
    public void openEsteler(){
        Intent intent = new Intent (this, Esteler.class);
        startActivity(intent);
    }

}
