package com.example.game_animals;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class second extends AppCompatActivity {
    public int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        score=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnreturn=(Button)findViewById(R.id.btnreturn);
        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("selectbear get score:",String.valueOf(score));
                Intent intent=new Intent(second.this,third.class);
                intent.putExtra("selectBearScore",String.valueOf(score));
                startActivity(intent);
            }
        });
        TextView tv_bear=(TextView)this.findViewById(R.id.tv_bear);
        Typeface type=Typeface.createFromAsset(getAssets(),"04B_03.TTF");
        btnreturn.setTypeface(type);
        tv_bear.setTypeface(type);
        final ImageView selectbearimage1=(ImageView)this.findViewById(R.id.selectbearimage1);
        selectbearimage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectbearimage1.setBackgroundColor(Color.parseColor("#778899"));
                score=50;
            }

        });
        selectbearimage1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                selectbearimage1.setBackgroundColor(Color.parseColor("#00ff00ff"));
                score=0;
                return false;
            }
        });

        final ImageView selectbearimage2=(ImageView)this.findViewById(R.id.selectbearimage2);
        selectbearimage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectbearimage2.setBackgroundColor(Color.parseColor("#778899"));
                score=score+0;
            }
        });
        selectbearimage2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                selectbearimage2.setBackgroundColor(Color.parseColor("#00ff00ff"));
                score=0;
                return false;
            }
        });

        final ImageView selectbearimage3=(ImageView)this.findViewById(R.id.selectbearimage3);
        selectbearimage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectbearimage3.setBackgroundColor(Color.parseColor("#778899"));
                score=0;
            }
        });
        selectbearimage3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                selectbearimage3.setBackgroundColor(Color.parseColor("#00ff00ff"));
                score=0;
                return false;
            }
        });

        final ImageView selectbearimage4=(ImageView)this.findViewById(R.id.selectbearimage4);
        selectbearimage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectbearimage4.setBackgroundColor(Color.parseColor("#778899"));
                score=0;
            }
        });
        selectbearimage4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                selectbearimage4.setBackgroundColor(Color.parseColor("#00ff00ff"));
                score=0;
                return false;
            }
        });

    }
}
