package com.example.projetocep.data

import com.example.projetocep.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface Api {

    @GET("ws/{cep}/json")
    fun getCEP(@Path("cep") cep: String?): Call<Endereco?>?

}