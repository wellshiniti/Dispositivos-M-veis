package br.usjt.deswebmob.filmeapp;

import java.util.ArrayList;

public class Genero {
    private int id;
    private String nome;
    private ArrayList<Genero> list;

    public Genero (int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public ArrayList<Genero> getList() {
        return list;
    }

    public void setList(ArrayList<Genero> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Genero> gerarLista(){

        Genero g = new Genero(1, "Aventura");
        this.list.add(g);
        Genero g1 = new Genero (2, "Ação");
        this.list.add(g1);
        Genero g2 = new Genero (3, "Terror");
        this.list.add(g2);


        return list;
    }
}
