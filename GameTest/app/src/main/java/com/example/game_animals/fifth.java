package com.example.game_animals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fifth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        Intent getintent=getIntent();
        String temp=null;
        temp=getintent.getStringExtra("selectTotalScore");

        TextView showscore=(TextView)this.findViewById(R.id.showscore);
        temp="your score is:"+temp;
        showscore.setText(temp);

        Button btnreset=(Button)this.findViewById(R.id.btnfifthreset);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fifth.this,Start.class);
                startActivity(intent);
            }
        });
    }
}
