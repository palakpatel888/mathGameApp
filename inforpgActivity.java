package com.example.palak.mathgamesapp;
import android.content.Intent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import java.util.Random;

public class inforpgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inforpg);

        Button travelBtn = (Button) findViewById(R.id.back);
        travelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(inforpgActivity.this,MainActivity.class);
                startActivity(i);
            }
        });



    }
}
