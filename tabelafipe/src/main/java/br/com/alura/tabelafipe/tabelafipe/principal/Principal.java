package br.com.alura.tabelafipe.tabelafipe.principal;

import br.com.alura.tabelafipe.tabelafipe.model.DadosVeiculo;
import br.com.alura.tabelafipe.tabelafipe.service.ConsumoApi;
import br.com.alura.tabelafipe.tabelafipe.service.ConverterDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";
    private final String API_KEY = "/marcas";

    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverterDados conversor = new ConverterDados();

    public void exibeMenu(){
        System.out.println("===========OPÇÕES==========");
        System.out.println("Carro");
        System.out.println("Moto");
        System.out.println("Caminhão");
        System.out.println("Digite uma das opções para consultar valores: ");
        var tipoVeiculo = leitura.nextLine();
        var json = consumoApi.obterDados(ENDERECO + tipoVeiculo + API_KEY);
        List<DadosVeiculo> dados = Arrays.asList(conversor.obterDados(json,DadosVeiculo[].class));
        System.out.println(dados);

    }
}
