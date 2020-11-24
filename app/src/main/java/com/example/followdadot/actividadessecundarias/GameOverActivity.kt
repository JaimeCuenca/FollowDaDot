package com.example.followdadot.actividadessecundarias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.followdadot.MainActivity
import com.example.followdadot.R
import kotlin.random.Random

class GameOverActivity : AppCompatActivity() {
    companion object {
        const val POINTS = "0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gameover)
        var retry = findViewById<Button>(R.id.retry)
        var points = findViewById<TextView>(R.id.points)
        points.text="Points: "+intent.getStringExtra(POINTS)

        retry.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}