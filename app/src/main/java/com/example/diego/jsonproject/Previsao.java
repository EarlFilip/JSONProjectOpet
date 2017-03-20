package com.example.diego.jsonproject;



public class Previsao {
    private String cidade;
    private Double temperatura;

    public Previsao() {
    }

    public Previsao(String cidade, Double temperatura) {
        this.cidade = cidade;
        this.temperatura = temperatura;
    }

    //region Get & Set
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }
    //endregion
}
