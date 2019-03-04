package com.example.game_animals;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class forth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
        Button btnreset=(Button)this.findViewById(R.id.btnreset);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(forth.this,Start.class);
                startActivity(intent);
            }
        });
        ImageView imageView=(ImageView)this.findViewById(R.id.imageView2);
        imageView.setBackgroundColor(Color.parseColor("#00ff00ff"));

    }
}
