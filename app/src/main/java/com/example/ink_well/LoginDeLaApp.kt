package com.example.ink_well

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginDeLaApp : AppCompatActivity() {
    lateinit var usuarioInput : EditText
    lateinit var ContraseñaInput : EditText
    lateinit var Loginbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_de_la_app)
        usuarioInput = findViewById(R.id.usuario_input)
        ContraseñaInput = findViewById(R.id.contraseña_input)
        Loginbtn = findViewById(R.id.btnIniciarSesion)
        Loginbtn.setOnClickListener {
            val usuario = usuarioInput.text.toString()
            val contraseña = ContraseñaInput.text.toString()

            //pruebas
            Log.i("Test credentials", "Username : $usuario and Password : ${contraseña}" )

        }
    }
}