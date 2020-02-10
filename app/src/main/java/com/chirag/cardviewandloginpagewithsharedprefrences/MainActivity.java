package com.chirag.cardviewandloginpagewithsharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LinearLayout changecolor,colo2,color3,color4,color5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // finding id for the color layout objects.
        changecolor=findViewById(R.id.change);
        colo2=findViewById(R.id.color2);
        color3=findViewById(R.id.color3);
        color4=findViewById(R.id.color4);
        color5=findViewById(R.id.color5);
        color5=findViewById(R.id.color5);

changecolor.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

            Random random=new Random();
            int color = Color.argb(255, random.nextInt(255) + 1, random.nextInt(255) + 1, random.nextInt(255) + 1);
            changecolor.setBackgroundColor(color);


            colo2.setBackgroundColor(color);


            color3.setBackgroundColor(color);


            color4.setBackgroundColor(color);


            color5.setBackgroundColor(color);
        }

});
    }
}
