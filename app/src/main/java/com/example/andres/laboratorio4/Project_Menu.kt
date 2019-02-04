package com.example.andres.laboratorio4

import android.content.Intent
import android.media.AudioManager
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.Button
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_project__menu.*
import java.lang.Exception

class Project_Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project__menu)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Email Not available", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val myButton2 = findViewById<Button>(R.id.lab2button) as Button
        myButton2.setOnClickListener(){Toast.makeText(this,"Ups",Toast.LENGTH_SHORT).show()}

            // dentro del metodo que se ejecuta al presionar lab 2
//            try{val intent = Intent(this, webViewer::class.java)
//            intent.putExtra("URL_ID", "2")
//            startActivity(intent)}
//        catch(e: Exception){
//            Toast.makeText(this,"Ups",Toast.LENGTH_SHORT).show()
//        }
//        }





        }}



