package com.example.pei.clickme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_click=(Button) findViewById(R.id.bt_click);
        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                System.out.println("hhh,I'm been clicked");
                Toast.makeText(MainActivity.this,"hhh,I'm been clicked",Toast.LENGTH_LONG).show();
            }
        }
        );
    }
}
