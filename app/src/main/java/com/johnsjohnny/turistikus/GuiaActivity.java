package com.johnsjohnny.turistikus;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.graphics.Matrix;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;



public class GuiaActivity extends AppCompatActivity {
        ImageView Mapa;
        ScaleGestureDetector SGD;
        Matrix matrix =new Matrix();
        Float scale =1f;


    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);

        Mapa = findViewById(R.id.mapa);
        SGD = new ScaleGestureDetector(this, new ScaleListener());


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        SGD.onTouchEvent(event);
        return true;
    }


    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
          scale = scale * detector.getScaleFactor();
          scale = Math.max(0.1f, Math.min(scale, 5f));
          matrix.setScale(scale, scale);
          Mapa.setImageMatrix(matrix);
          return true;
        }
    }
}
