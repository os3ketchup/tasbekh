package com.eldorteshaboev.myapplication


import android.annotation.SuppressLint
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var countButton :Button
    lateinit var tvCounter :TextView
    lateinit var refreshButton:Button
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countButton = findViewById(R.id.countButton)
        refreshButton = findViewById(R.id.refreshButton)
        tvCounter = findViewById(R.id.tvCounter)

        var counter = 0


        countButton.setOnClickListener {
            counter++
            tvCounter.text = counter.toString()

        if (counter==11||counter==44||counter==77){

            tvCounter.setTextColor(Color.RED)
        }
        if (counter==22||counter==55||counter==88){
            tvCounter.setTextColor(Color.GREEN)
        }
        if (counter==33||counter==66||counter==99){
            tvCounter.setTextColor(Color.BLUE)
        }
        refreshButton.setOnClickListener {
            counter = 0
            tvCounter.setTextColor(Color.BLACK)
            tvCounter.setBackgroundColor(Color.WHITE)
            tvCounter.text = "0"
        }}

    }

}