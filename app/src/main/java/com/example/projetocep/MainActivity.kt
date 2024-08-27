package com.example.projetocep

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projetocep.dao.CepDAO
import com.example.projetocep.dao.CepDAOImpl
import com.example.projetocep.data.RetrofitSetup.service
import com.example.projetocep.model.Endereco
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cep = findViewById<EditText>(R.id.cep)
        val button= findViewById<Button>(R.id.button)
        val cepDAO= CepDAOImpl()

        button.setOnClickListener{
            cepDAO.salvar(cep.text.toString())
            Handler(Looper.getMainLooper()).postDelayed({
                val intent= Intent(this@MainActivity,ResultadoActivity::class.java)
                startActivity(intent)
            },700)

        }



    }


}
