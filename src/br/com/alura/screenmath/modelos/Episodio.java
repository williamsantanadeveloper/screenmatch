package br.com.alura.screenmath.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVizualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public int getTotalDeVizualizacoes() {
        return totalDeVizualizacoes;
    }

    public void setTotalDeVizualizacoes(int totalDeVizualizacoes) {
        this.totalDeVizualizacoes = totalDeVizualizacoes;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalDeVizualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
