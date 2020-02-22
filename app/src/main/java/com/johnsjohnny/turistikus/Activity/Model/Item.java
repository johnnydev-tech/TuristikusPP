package com.johnsjohnny.turistikus.Activity.Model;

public class Item {
    private  String Nome;
    private  int Imagem;
    private  String Descricao;

    public Item(String nome, int imagem , String descricao) {
        Nome = nome;
        Imagem = imagem;
        Descricao = descricao;
    }


    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }



    public int getImagem()
    {
        return Imagem;
    }

    public void setImagem(int imagem)
    {
        Imagem = imagem;
    }



    public String getDescricao()
    {
        return Descricao;
    }

    public void setDescricao(String descricao)
    {
        Descricao = descricao;
    }
}
