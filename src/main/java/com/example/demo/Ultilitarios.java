package com.example.demo;

import org.springframework.stereotype.Repository;

public class Ultilitarios {

    public void duplica(Repositorio a, Repositorio b){

        Pessoa pessoa = a.proximo();

        while (pessoa != null){
            b.guarda(pessoa);
            pessoa = a.proximo();
        }

    }

    public void diferenca(Repositorio a, Repositorio b, Repositorio c){

        Pessoa pessoa = a.proximo();

        while (pessoa != null){
            if (b.recupera(pessoa.getCpf()) == null){
                c.guarda(pessoa);
            }
            pessoa = a.proximo();
        }

    }


}
