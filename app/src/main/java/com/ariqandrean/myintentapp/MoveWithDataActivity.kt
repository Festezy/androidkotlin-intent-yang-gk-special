package com.ariqandrean.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {

    /**
     * variabel yang nilainya tetap, biasanya digunakan sebagai key(kunci)
     * yang dipakai untuk mengirim dan menerima data.
     */
    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataReceived = findViewById<TextView>(R.id.tv_data_received)

        /** mengambil data dari MainAcivity*/
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        val text = """
            Name   : $name
            YourAge: $age
        """.trimIndent()
        tvDataReceived.text = text
    }
}