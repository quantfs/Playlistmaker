package com.novomet.playlistmaker

import android.R.attr.button
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val supportButton = findViewById<ImageView>(R.id.support);
        supportButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO);
            intent.data =  Uri.parse("mailto:");
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("zolotarev.iv@novomet.ru"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Android application");
            intent.putExtra(Intent.EXTRA_TEXT, "Помогите написать код");
            startActivity(intent);
        };

        val shareButton = findViewById<ImageView>(R.id.share);
        shareButton.setOnClickListener {
            val intent = Intent("org.telegram.messenger");
            intent.action = Intent.ACTION_SEND;
            intent.putExtra(Intent.EXTRA_TEXT,"Делимся приложением");
            intent.type = "text/plain";
            startActivity(intent);
        };

        val agreementButton = findViewById<ImageView>(R.id.agreement);
        agreementButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW);
            intent.data =  Uri.parse("http://yandex.ru/legal/practicum_offer/");
            startActivity(intent);
        };

        val backButton = findViewById<ImageView>(R.id.back_settings);
        backButton.setOnClickListener {
            //Toast.makeText(this@SettingsActivity, "Текст: Media", Toast.LENGTH_SHORT).show();
            finish();
        };
    }
}