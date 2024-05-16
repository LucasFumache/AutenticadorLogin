package com.example.loginsenai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class paginiainicial : AppCompatActivity() {
    private val autentication by lazy {
        FirebaseAuth.getInstance()
    }
val COD_TELA = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paginiainicial)
        /* codigo para zerar campos de texto no logout antigo antes do codigo
        tvUser.text = autentication.currentUser?.email
       // val senha = findViewById<TextView>(R.id.idsenha)
        val txtemail = intent.getStringExtra("email")
        email.setText(txtemail)
        val txtsenha = intent.getStringExtra("senha")
        //senha.setText(txtsenha)
         */
        val email = findViewById<TextView>(R.id.idmail)
        val btnsair = findViewById<Button>(R.id.btnInicio)
        email.text = autentication.currentUser?.email
        btnsair.setOnClickListener{
            logout()
        }
        }


   fun logout() {
       /* codigo antigo para zerar os campos
       val intent = Intent(this, MainActivity::class.java).apply {
           putExtra("senha","")
           putExtra("email", "")
       }

       startActivityForResult(intent,COD_TELA)

        */
       autentication.signOut()
       finish()

    }
}
