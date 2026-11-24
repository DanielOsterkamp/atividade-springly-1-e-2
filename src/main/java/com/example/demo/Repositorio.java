package com.example.demo;

public interface Repositorio {

    void guarda(Pessoa nova);
    Pessoa recupera(String cpf);
    Pessoa primeiro();
    Pessoa proximo();
}
