package com.example.projetocep

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projetocep.dao.CepDAOImpl
import com.example.projetocep.model.formatString

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textView=findViewById<TextView>(R.id.textview)

        val endereco=CepDAOImpl().getEndereco()

        if(endereco!=null){
            textView.text=endereco.formatString()
        }else {
            textView.text ="falha na requisição"
        }

    }
}