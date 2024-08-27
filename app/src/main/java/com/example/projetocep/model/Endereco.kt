package com.example.projetocep.model

import com.google.gson.annotations.SerializedName

data class Endereco (@SerializedName("cep") val cep:String,
                     @SerializedName("logradouro") val rua:String,
                     @SerializedName("bairro") val bairro:String,
                     @SerializedName("localidade") val cidade:String
)

 fun Endereco.formatString():String{
    return "Cep:$cep\nRua:$rua\nBairro:$bairro\nCidade:$cidade"
}
