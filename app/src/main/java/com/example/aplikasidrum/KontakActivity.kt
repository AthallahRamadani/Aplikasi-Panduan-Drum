package com.example.aplikasidrum

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_latihansatu.*

class KontakActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kontak)

        val noWa = findViewById<TextView>(R.id.whatsapp)
        val email = findViewById<TextView>(R.id.email)
        noWa.setOnClickListener {

            val url = "https://api.whatsapp.com/send?phone=+6281282232145"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)

        }

        email.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "athallahramadani21@gmail.com"))
            startActivity(intent)
        }

        btnKembali.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}