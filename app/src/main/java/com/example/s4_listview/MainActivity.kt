package com.example.s4_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO =
        arrayOf("Android","iOS","WindowsPhone", "Blackberry OS", "Amazon World")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsvSystemOperation: ListView = findViewById((R.id.lsvSO))
        val adapter: Any? =
            ArrayAdapter<Any?>(this,android.R.layout.simple_list_item_1,arrSO)
        lsvSystemOperation.adapter = adapter as ListAdapter?

        lsvSystemOperation.setOnItemClickListener { parent, view, position, id ->
            Toast.
            makeText(applicationContext,
                "Estoy en la posición: $position",
                Toast.LENGTH_LONG).show()
        }
    }
}