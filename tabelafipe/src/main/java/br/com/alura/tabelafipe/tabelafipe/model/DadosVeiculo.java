package br.com.alura.tabelafipe.tabelafipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosVeiculo {@JsonAlias("codigo") Integer codigo;
                           @JsonAlias("nome") String nome;

    @Override
    public String toString() {
        return "DadosVeiculo{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}

