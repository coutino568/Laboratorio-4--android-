package com.example.andres.laboratorio4

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView

import kotlinx.android.synthetic.main.activity_web_viewer.*

class webViewer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_viewer)
        setSupportActionBar(toolbar)
        // recibe el numero de proyecto que deberi mostrar y despliega el proyecyo que deberia
        val numeroDeProyecto =intent.getStringExtra("URL_ID")
        val webBrowser = findViewById<WebView>(R.id.myWebView)
        webBrowser.canGoBack()
        // para el laboratorio 2
        if (numeroDeProyecto=="2"){
            webBrowser.loadUrl("https://github.com/coutino568/laboratorio-2")}
        else {webBrowser.loadUrl("")}






        fab.setOnClickListener { view ->
            Snackbar.make(view, "Email not available", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
