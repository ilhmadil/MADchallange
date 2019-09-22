package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.tombolpesan);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "silahkan pesan makanan", Toast.LENGTH_SHORT)
                        .show();
                openActivity2();

            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);


    }

    @Override
    public void onBackPressed(){

        Toast.makeText(getApplicationContext(), "Anda sudah diawal halaman", Toast.LENGTH_SHORT)
                .show();
    }
}



