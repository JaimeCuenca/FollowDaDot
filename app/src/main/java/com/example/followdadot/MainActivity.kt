package com.example.followdadot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TableLayout
import androidx.core.view.isVisible
import com.example.followdadot.actividadessecundarias.GameOverActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var clicks = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i00 = findViewById<ImageView>(R.id.imageView00)
        var i01 = findViewById<ImageView>(R.id.imageView01)
        var i02 = findViewById<ImageView>(R.id.imageView02)
        var i10 = findViewById<ImageView>(R.id.imageView10)
        var i11 = findViewById<ImageView>(R.id.imageView11)
        var i12 = findViewById<ImageView>(R.id.imageView12)
        var i20 = findViewById<ImageView>(R.id.imageView20)
        var i21 = findViewById<ImageView>(R.id.imageView21)
        var i22 = findViewById<ImageView>(R.id.imageView22)
        var tabla = findViewById<TableLayout>(R.id.tabla)
        var listaBotones  : List<ImageView> = listOf(i00, i01, i02, i10, i11,i12, i20, i21, i22)

        tabla.setOnClickListener(){
            val intent = Intent(this, GameOverActivity::class.java)
            intent.putExtra(GameOverActivity.POINTS, clicks.toString())
            startActivity(intent)
        }

        listaBotones[0].setOnClickListener(){
            click(listaBotones[0], listaBotones)
        }
        listaBotones[1].setOnClickListener(){
            click(listaBotones[1], listaBotones)
        }
        listaBotones[2].setOnClickListener(){
            click(listaBotones[2], listaBotones)
        }
        listaBotones[3].setOnClickListener(){
            click(listaBotones[3], listaBotones)
        }
        listaBotones[4].setOnClickListener(){
            click(listaBotones[4], listaBotones)
        }
        listaBotones[5].setOnClickListener(){
            click(listaBotones[5], listaBotones)
        }
        listaBotones[6].setOnClickListener(){
            click(listaBotones[6], listaBotones)
        }
        listaBotones[7].setOnClickListener(){
            click(listaBotones[7], listaBotones)
        }
        listaBotones[8].setOnClickListener(){
            click(listaBotones[8], listaBotones)
        }
    }
    fun click(boton : ImageView, lista : List<ImageView>){
        clicks++
        boton.isVisible=false
        var error=true
        while(error) {
            var num = Random.nextInt(0, 9)
            when (num) {
                (0) -> {
                    if (boton==lista[0]) error=true
                    else {
                        lista[0].isVisible=true
                        error=false
                    }
                }
                (1) -> {
                    if (boton==lista[1]) error=true
                    else {
                        lista[1].isVisible=true
                        error=false
                    }
                }
                (2) -> {
                    if (boton==lista[2]) error=true
                    else {
                        lista[2].isVisible=true
                        error=false
                    }
                }
                (3) -> {
                    if (boton==lista[3]) error=true
                    else {
                        lista[3].isVisible=true
                        error=false
                    }
                }
                (4) -> {
                    if (boton==lista[4]) error=true
                    else {
                        lista[0].isVisible=true
                        error=false
                    }
                }
                (5) -> {
                    if (boton==lista[5]) error=true
                    else {
                        lista[5].isVisible=true
                        error=false
                    }
                }
                (6) -> {
                    if (boton==lista[6]) error=true
                    else {
                        lista[6].isVisible=true
                        error=false
                    }
                }
                (7) -> {
                    if (boton==lista[7]) error=true
                    else {
                        lista[7].isVisible=true
                        error=false
                    }
                }
                (8) -> {
                    if (boton==lista[8]) error=true
                    else {
                        lista[8].isVisible=true
                        error=false
                    }
                }
                else -> error=true
            }
        }
    }
}