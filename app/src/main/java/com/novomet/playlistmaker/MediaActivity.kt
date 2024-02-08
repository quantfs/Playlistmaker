package com.novomet.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MediaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media)

        val backButton = findViewById<ImageView>(R.id.back);

        backButton.setOnClickListener {
            //Toast.makeText(this@MediaActivity, "Текст: Media", Toast.LENGTH_SHORT).show();
            finish();
        };
    }

}