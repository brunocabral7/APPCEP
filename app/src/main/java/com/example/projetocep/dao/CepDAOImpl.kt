package com.example.projetocep.dao

import com.example.projetocep.data.RetrofitSetup.service
import com.example.projetocep.model.Endereco
import retrofit2.Call
import retrofit2.Response

class CepDAOImpl:CepDAO {
    companion object{
        private var endereco:Endereco?=null
    }

    override fun salvar(cep: String) {
        val call = service.getCEP(cep)


        call?.enqueue(object : retrofit2.Callback<Endereco?> {
            override fun onResponse(call: Call<Endereco?>, response: Response<Endereco?>) {
                val endereco = response.body()
                endereco?.let {
                    Companion.endereco=endereco
                }
            }

            override fun onFailure(call: Call<Endereco?>, throwable: Throwable) {

            }
        })
    }

    override fun getEndereco(): Endereco? {
       return Companion.endereco
    }
}