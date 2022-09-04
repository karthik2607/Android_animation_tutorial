package com.example.fadeanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //public void fade(View view){

    public void fade(View view) {

        Log.i("Info","Imagetapped");
        ImageView bartimageView=(ImageView) findViewById(R.id.bartImageview);
        ImageView homerimageView=(ImageView) findViewById(R.id.homerImageview);
        bartimageView.animate().alpha(0).rotationXBy(1800).setDuration(1000);
        bartimageView.animate().alpha(1);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}