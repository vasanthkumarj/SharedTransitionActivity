package com.vasanthkumarj15.sharedtransitionactivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img1;
    private ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.star1);
        img2=findViewById(R.id.star2);
    }

    public void callSharedView(View view) {
        Pair[] pair=new Pair[2];
        pair[0]=new Pair<View,String>(img1,"shared1");
        pair[1]=new Pair<View,String>(img2,"shared2");
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pair);
            Intent i =new Intent(MainActivity.this,ExpandActivity.class);
            startActivity(i,options.toBundle());
        }
    }
}
