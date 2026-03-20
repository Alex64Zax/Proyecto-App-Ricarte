package com.example.ink_well

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class InicioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        // Obtener referencia al botón
        val btnCrear = view.findViewById<Button>(R.id.bt_crear) // Asegúrate que el ID coincida con el XML

        // Configurar el click listener
        btnCrear.setOnClickListener {
            navegarAActivity()
        }

        return view
    }

    private fun navegarAActivity() {
        // Crear Intent para abrir el Activity destino
        // Reemplaza "DestinoActivity::class.java" con el nombre de tu Activity
        val intent = Intent(requireContext(), CreacionActivity::class.java)
        startActivity(intent)
    }
}