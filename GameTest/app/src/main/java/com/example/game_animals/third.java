package com.example.game_animals;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class third extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent getintent=getIntent();
        String temp=null;
        temp=getintent.getStringExtra("selectBearScore");
        score=Integer.parseInt(temp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final ImageView selectflowerimage1=(ImageView)this.findViewById(R.id.selectflowerimage1);
        selectflowerimage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectflowerimage1.setBackgroundColor(Color.parseColor("#778899"));
                score=score;
            }

        });
        selectflowerimage1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                selectflowerimage1.setBackgroundColor(Color.parseColor("#00ff00ff"));
                score=score;
                return false;
            }
        });

        final ImageView selectflowerimage2=(ImageView)this.findViewById(R.id.selectflowerimage2);
        selectflowerimage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectflowerimage2.setBackgroundColor(Color.parseColor("#778899"));
                score=score;
            }
        });
        selectflowerimage2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                selectflowerimage2.setBackgroundColor(Color.parseColor("#00ff00ff"));
                score=score;
                return false;
            }
        });

        final ImageView selectflowerimage3=(ImageView)this.findViewById(R.id.selectflowerimage3);
        selectflowerimage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectflowerimage3.setBackgroundColor(Color.parseColor("#778899"));
                score+=50;
            }
        });
        selectflowerimage3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                selectflowerimage3.setBackgroundColor(Color.parseColor("#00ff00ff"));
                score=score-50;
                return false;
            }
        });

        final ImageView selectflowerimage4=(ImageView)this.findViewById(R.id.selectflowerimage4);
        selectflowerimage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectflowerimage4.setBackgroundColor(Color.parseColor("#778899"));
                score=score;
            }
        });
        selectflowerimage4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                selectflowerimage4.setBackgroundColor(Color.parseColor("#00ff00ff"));
                score=score;
                return false;
            }
        });

        Button btnreturn=(Button)this.findViewById(R.id.btnreturn1);
        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("selectflower get score",String.valueOf(score));
                if(score==100){
                    Intent intent=new Intent(third.this,forth.class);
                    startActivity(intent);
                }else {
                    Intent intent=new Intent(third.this,fifth.class);
                    intent.putExtra("selectTotalScore",String.valueOf(score));
                    startActivity(intent);
                }
            }
        });
    }
}
