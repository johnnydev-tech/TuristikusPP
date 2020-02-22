package com.johnsjohnny.turistikus;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        getSupportActionBar().hide();//esconder barra
        // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//Tela inteira


        //Abrir depos de um tempo
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Main = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(Main);
                finish();//Destruir Activity


            }
        }, 3000); //3000 ms- 3 segundos
    }
    }

