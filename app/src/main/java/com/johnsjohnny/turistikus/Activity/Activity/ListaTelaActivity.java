package com.johnsjohnny.turistikus.Activity.Activity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.johnsjohnny.turistikus.Activity.Adapter.Adapter;
import com.johnsjohnny.turistikus.Activity.Model.Item;
import com.johnsjohnny.turistikus.R;

import java.util.ArrayList;
import java.util.List;

public class ListaTelaActivity extends AppCompatActivity {
    ImageView IV;

    private RecyclerView recycler;
    private List<Item> lista = new ArrayList<>();


    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tela);

        recycler = findViewById(R.id.Recycler);
        IV = findViewById(R.id.setaimg);


        Bundle extras = getIntent().getExtras();
        byte[] f = extras.getByteArray("setaimagem");
        Bitmap bmp = BitmapFactory.decodeByteArray(f,0,f.length);
        IV.setImageBitmap(bmp);

        String TipoLista = extras.getString("Lista");


        //lista

        if (TipoLista.equalsIgnoreCase("Cidade")){
            this.listacidade();
        }

        else if(TipoLista.equalsIgnoreCase("Gastronomia")){
            this.listagastronomia();

        }
        else if(TipoLista.equalsIgnoreCase("Hospedagem")){
            this.listahospedagem();

        }
        else if(TipoLista.equalsIgnoreCase("Educação")){
            this.listaeducacao();

        }
        else if(TipoLista.equalsIgnoreCase("Mercado")){
            this.listamercado();

        } else if(TipoLista.equalsIgnoreCase("Presente")){
            this.listapresente();

        } else if(TipoLista.equalsIgnoreCase("Tecnologia")){
            this.listatecnologia();

        }
        else if(TipoLista.equalsIgnoreCase("Serviço")){
             this.listaservico();
        }
        else if(TipoLista.equalsIgnoreCase("Veiculo")){
            this.listaveiculo();
        }
        else if(TipoLista.equalsIgnoreCase("Posto")){
            this.listaposto();
        }
        else if(TipoLista.equalsIgnoreCase("Saude")){
            this.listasaude();
        }





        //Configura adpter
        Adapter adapter = new Adapter(lista);





        //configurara Recycler
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(layoutManager);
        recycler.setHasFixedSize(true);
        recycler.setAdapter(adapter);
        recycler.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

    }



    public void listaeducacao()
    {
        Item educa = new Item  ("Fatec", R.drawable.fatec, "Rua Teresina, 75 - Vila Paulo Roberto, Pres. Prudente - SP, 19046-230");
        this.lista.add(educa);

        educa = new Item  ("KNN", R.drawable.knn, "Av. Washington Luiz, 525 - Centro, Pres. Prudente - SP, 19010-090");
        this.lista.add(educa);
        educa = new Item  ("Unoeste - Campus I", R.drawable.campus1, "Rua José Bongiovani, 700 - Cidade Universitária, Pres. Prudente - SP, 19050-920");
        this.lista.add(educa);
        educa = new Item  ("Unoeste - Campus II", R.drawable.campus2, "Rodovia SP-270, km 572 - Pres. Prudente, SP, 19067-175");
        this.lista.add(educa);
        educa = new Item  ("AGC", R.drawable.agc, "Rua Rui Barbosa, 573 - Centro, Pres. Prudente - SP, 19015-000");
        this.lista.add(educa);



    }

    public void listagastronomia()
    {
        Item educa = new Item  ("Bett's", R.drawable.betts, "Rua José Feliciano de Campos, 176 - Cidade Universitária, Pres. Prudente - SP, 19050-540");
        this.lista.add(educa);




    }

    public void listacidade()
    {
       Item  educa = new Item  ("Parque do Povo", R.drawable.pdp, "Av. Onze de Maio X, Av. Quatorze de Setembro - Vila Formosa, Pres. Prudente - SP, 19050-050");
        this.lista.add(educa);
        educa = new Item  ("IBC", R.drawable.ibc, "Rua Dr. Hugo Lacorte Vitale, 46 - Vila Furquim, Pres. Prudente - SP");
        this.lista.add(educa);
        educa = new Item  ("Matarazzo", R.drawable.matarazzo, "Rua Quintino Bocaiúva, 749 - Vila Marcondes, Pres. Prudente - SP, 19030-190");
        this.lista.add(educa);
        educa = new Item  ("Praça 9 de Julho", R.drawable.praca9,  "Praça Nove de Julho - Presidente Prudente - SP CEP: 19010-240");
        this.lista.add(educa);

    }


    public void listapresente()
    {
        Item educa = new Item  ("Neko Origamis", R.drawable.neko, "Rua José Bonifácio, 169 - Vila Santa Izabel, Pres. Prudente - SP, 19020-720");
        this.lista.add(educa);




    }


    public void listahospedagem()
    {
        Item educa = new Item  (" Hotel Portal D'Oeste", R.drawable.portaldoestelogo, "Av. Brasil, 1501 - Vila Sao Jorge, Pres. Prudente - SP, 19013-000");
        this.lista.add(educa);

        educa = new Item  ("Hotel Ibis", R.drawable.ibis, "Av. Manoel Goulart, 2070 - Vila Santa Helena, Pres. Prudente - SP, 19015-241");
        this.lista.add(educa);

        educa = new Item  ("Cliv Sol Hotel Fazenda", R.drawable.cliv,"Rodovia SP-457, Km 23, s/n - Roçinha, Iepê - SP, 19640-000");
        this.lista.add(educa);



    }

    public void listamercado()
    {
        Item educa = new Item  ("Casa de Carnes Aviação", R.drawable.aviacao, "Rua Coronel Albino, 185 - Jardim aviação");
        this.lista.add(educa);




    }
    public void listaveiculo()
    {
        Item educa = new Item  ("Velocar", R.drawable.velocar, "Rua Antônio Rodrigues, 431 - Vila Mirian, Pres. Prudente - SP, 19013-220");
        this.lista.add(educa);

        educa = new Item  ("Velocar Truck", R.drawable.velocartruck, "Av. Joaquim Constantino, 4430 - Jardim São Luiz, Pres. Prudente - SP, 19061-000");
        this.lista.add(educa);



    }

    public void listatecnologia()
    {
        Item educa = new Item  ("Cabonnet", R.drawable.cabonnet, "Rua Ten. Nicolau Maffei, 1164 - Centro, Pres. Prudente - SP, 19015-020");
        this.lista.add(educa);

        educa = new Item  ("Viva Celulares", R.drawable.viva, "Rua Siqueira Campos, 531 - Centro, Pres. Prudente - SP, 19010-061");
        this.lista.add(educa);

       ;


    }

    public void listaservico()
    {
        Item educa = new Item  ("RJ Marcenaria", R.drawable.rjmarcenaria, "Rua José Medina Rodrigues");
        this.lista.add(educa);

        educa = new Item  ("Vip Makeup", R.drawable.vipmakeup, "Av. Washington Luiz, 19060-010 Presidente Prudente");
        this.lista.add(educa);
        educa = new Item  ("Fire Danger Engenharia", R.drawable.firedanger, "Av. Manoel Romeu Caires, 633 - Jardim Humberto Salvador, Pres. Prudente - SP, 19100-100");
        this.lista.add(educa);

        educa = new Item  ("Qualicasa Construtora", R.drawable.qualicasa, "Rua Joaquim Nabuco, N° 818 - Centro, CEP 19010-071, Presidente Prudente - SP.");
        this.lista.add(educa);


    }

    public void listasaude()
    {
        Item educa = new Item  ("Saúde", R.drawable.ic_launcher_background, "");
        this.lista.add(educa);




    }


    public void listaposto()
    {
        Item educa = new Item  ("Rede Prudentão", R.drawable.ic_launcher_background, "");
        this.lista.add(educa);

        educa = new Item  ("Posto", R.drawable.ic_launcher_background, "");
        this.lista.add(educa);


    }








}

