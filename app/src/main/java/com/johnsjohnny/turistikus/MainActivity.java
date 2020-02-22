package com.johnsjohnny.turistikus;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageView;

import com.johnsjohnny.turistikus.Activity.Activity.ListaTelaActivity;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView Cidade;
    ImageView Hospedagem;
    ImageView Gastronomia;
    ImageView Educacao;
    ImageView Mercado;
    ImageView Presente;
    ImageView Tecnologia;
    ImageView Servicos;
    ImageView Veiculos;
    ImageView Saude;
    ImageView Posto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cidade = findViewById(R.id.IVCidade);
        Gastronomia = findViewById(R.id.IVGastronomia);
        Hospedagem = findViewById(R.id.IVhosp);
        Educacao = findViewById(R.id.IVEducacao);
        Mercado = findViewById(R.id.IVMercado);
        Presente = findViewById(R.id.IVPresente);
        Tecnologia =  findViewById(R.id.IVTecnologia);
        Servicos = findViewById(R.id.IVServico);
        Veiculos =  findViewById(R.id.IVVeiculo);
        Saude = findViewById(R.id.IVSaude);
        Posto = findViewById(R.id.IVPosto);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,

                        Uri.parse("http://api.whatsapp.com/send?1=pt_BR&phone=5518997910359"));

                startActivity(intent);
            }
        });



        Cidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.conhecacidade);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, b);
                byte[] f = b.toByteArray();

                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Cidade");

                startActivity(play);
            }
        });

        Gastronomia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.gastronomiaa);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);

                play.putExtra("Lista","Gastronomia");

                startActivity(play);

            }
        });

        Hospedagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.hospedagema);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Hospedagem");

                startActivity(play);
            }
        });


        Presente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.presentea);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Presente");

                startActivity(play);
            }
        });

        Educacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.educacaoa);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Educação");

                startActivity(play);


            }
        });

        Mercado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.mercadoa);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Mercado");

                startActivity(play);
            }
        });
        Tecnologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.tecnologiaa);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Tecnologia");

                startActivity(play);
            }
        });

        Servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.servicosa);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Serviço");

                startActivity(play);

            }
        });

        Veiculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.veiculosa);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Veiculo");

                startActivity(play);
            }
        });

        Saude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.saudea);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Saude");

                startActivity(play);
            }
        });

        Posto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), ListaTelaActivity.class);

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.postoa);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
                byte[] f = b.toByteArray();
                play.putExtra("setaimagem", f);
                play.putExtra("Lista","Posto");

                startActivity(play);
            }
        });







        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    public static  Intent SendText(String texto){

        Intent compartilhar = new Intent(Intent.ACTION_SEND);
        compartilhar.setType("text/plain");
        compartilhar.putExtra(Intent.EXTRA_TEXT,texto);
        return compartilhar;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://api.whatsapp.com/send?1=pt_BR&phone=5518996347535"));

            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent Main = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(Main);
            finish();

        } else if (id == R.id.nav_gallery) {

            Intent Main = new Intent(getApplicationContext(), GuiaActivity.class);
            startActivity(Main);



        } else if (id == R.id.nav_slideshow) {
            Intent Main = new Intent(getApplicationContext(), AnunciosActivity.class);
            startActivity(Main);

        } else if (id == R.id.nav_tools) {
            Intent Main = new Intent(getApplicationContext(), PerfilActivity.class);
            startActivity(Main);

        } else if (id == R.id.nav_share) {


            Intent compartilhar = SendText("https://www.facebook.com/turistikustenolgiaemhospitalidade");
            startActivity(compartilhar);


        } else if (id == R.id.nav_send) {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://api.whatsapp.com/send?1=pt_BR&phone=5518997910359"));


            startActivity(intent);


        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
