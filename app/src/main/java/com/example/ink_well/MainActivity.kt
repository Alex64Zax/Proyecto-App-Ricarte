package com.example.ink_well

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.button_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.botton_Inicio -> {
                    replaseFrament(InicioFragment())
                    true
                }
                R.id.botton_estadisticas -> {
                    replaseFrament(EstadisticasFragment())
                    true
                }

                R.id.botton_cuenta -> {
                    replaseFrament(CuentaFragment())
                    true
                }
                else -> false
            }
        }
        replaseFrament(InicioFragment())
    }
    private fun replaseFrament(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.freme_container, fragment).commit()
    }
}