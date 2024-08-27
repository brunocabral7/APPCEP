package com.example.projetocep.dao

import com.example.projetocep.model.Endereco

interface CepDAO {
    fun salvar(cep: String)
    fun getEndereco():Endereco?
}