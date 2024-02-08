package com.novomet.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.Toast

class MainActivity_ : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_)

        val image = findViewById<ImageView>(R.id.poster)

//        val imageClickListener: View.OnClickListener = object : View.OnClickListener {
//            override fun onClick(v: View?) {
//                Toast.makeText(this@MainActivity, "Здесь какой-то текст", Toast.LENGTH_SHORT).show();
//            }
//        }
//
//        image.setOnClickListener(imageClickListener);

//        image.setOnClickListener {
//            Toast.makeText(this@MainActivity, "Новый текст", Toast.LENGTH_SHORT).show();
//        };

        image.setOnClickListener(this);
        image.setBackgroundColor(getColor(R.color.white));
        image.scaleType = ImageView.ScaleType.CENTER_INSIDE

//        image.setBackgroundColor(getColor(R.color.white))
//        image.scaleType = ImageView.ScaleType.CENTER_INSIDE
//        image.setImageResource(R.drawable.barsik)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.poster -> {
                Toast.makeText(this, "Нажали на картинку!", Toast.LENGTH_SHORT).show();
                (v as ImageView).setImageResource(R.drawable.barsik);
            }
        }
    }
}