package br.usjt.deswebmob.filmeapp;

import java.util.ArrayList;


/*
    @Author Wellington Shiniti Kawashima
            RA: 81622278

 */

public class Filme {

    private String titulo;
    private String descricao;
    private int id;
    private String data;
    private int popularidade;
    private String direcao;
    private Genero genero;
    private ArrayList<Filme> list = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Filme> getList() {
        return list;
    }

    public void setList(ArrayList<Filme> list) {
        this.list = list;
    }

    public Filme(){
        setList(gerarLista());
    }

    public Filme(String titulo, String descricao, int id, String data, int popularidade, String direcao, Genero genero) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.id = id;
        this.data = data;
        this.popularidade = popularidade;
        this.direcao = direcao;
        this.genero = genero;
    }

    public ArrayList<Filme> gerarLista(){
        Filme f1 = new Filme("Halloween","Filme de terror de um assassino", 1, "20/11/1993", 842, "Fulano", new Genero(3, "Terror"));
        getList().add(f1);
        Filme f2 = new Filme("Wonder Woman", "Simplesmente Mulher Maravilha", 2, "15/04/2018", 999, "Fulaninho", new Genero(2,"Ação"));
        getList().add(f2);
        return list;
    }

    public ArrayList<String> getListaNomes(String genero){
        ArrayList<String> lista = new ArrayList<String>();

        for (Filme filme:list) {
            if(genero.equals("Todos")){
                lista.add(filme.getTitulo());
            }

            if(filme.genero.getNome().equals(genero)){
                lista.add(filme.getTitulo());
            }
        }

        return lista;
    }

    public Filme buscaFilme(String nomeFilme){

        for (Filme filme:list) {
            if (filme.getTitulo().equals(nomeFilme))
                return filme;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", id=" + id +
                ", data='" + data + '\'' +
                ", popularidade=" + popularidade +
                ", direcao='" + direcao + '\'' +
                ", genero=" + genero +
                ", list=" + list +
                '}';
    }
}
