package com.novomet.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSearch = findViewById<Button>(R.id.search);
        val imageMedia = findViewById<Button>(R.id.media);
        val imageSettings = findViewById<Button>(R.id.settings);

        // I способ, через анонимный класс
        val imageSearchListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                //Toast.makeText(this@MainActivity, "Текст: Search", Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_search);
                val intent = Intent(this@MainActivity, SearchActivity::class.java);
                startActivity(intent);
            }
        }
        imageSearch.setOnClickListener(imageSearchListener);

        // II способ, через лямбда функцию
        imageMedia.setOnClickListener {
            //Toast.makeText(this@MainActivity, "Текст: Media", Toast.LENGTH_SHORT).show();
            val intent = Intent(this, MediaActivity::class.java);
            startActivity(intent);
        };

        // III способ, через реалиазацию интерфейса самого класса
        imageSettings.setOnClickListener(this);
        //imageSettings.setBackgroundColor(getColor(R.color.white));
        //imageSettings.scaleType = ImageView.ScaleType.CENTER_INSIDE

//        image.setBackgroundColor(getColor(R.color.white))
//        image.scaleType = ImageView.ScaleType.CENTER_INSIDE
//        image.setImageResource(R.drawable.barsik)
    }

    override fun onClick(v: View?) {
        //Toast.makeText(this, "Текст: Settings", Toast.LENGTH_SHORT).show();
        when (v?.id) {
            R.id.settings -> {
                val intent = Intent(this, SettingsActivity::class.java);
                startActivity(intent);
            }
        }
    }
}