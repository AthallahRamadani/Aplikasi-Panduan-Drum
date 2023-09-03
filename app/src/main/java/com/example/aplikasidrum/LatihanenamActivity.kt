package com.example.aplikasidrum

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_latihansatu.*
class LatihanenamActivity : AppCompatActivity() {

    var videoView: VideoView? = null

    var mediaController: MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihanenam)

        videoView=findViewById<View>(R.id.videoView) as VideoView?

        if(mediaController == null){
            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }

        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.latihan1))
        videoView!!.requestFocus()

        videoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext, " Video End",Toast.LENGTH_LONG).show()
        }
        videoView!!.setOnErrorListener { mediaPlayer, i, i2 ->
            Toast.makeText(applicationContext, " Error Occured",Toast.LENGTH_LONG).show()
            false
        }

        videoView!!.setOnPreparedListener{mediaPlayer ->
            videoView!!.start()
            mediaPlayer.setOnVideoSizeChangedListener { mediaPlayer, width, height ->
                mediaController = MediaController( this@LatihanenamActivity)
                videoView!!.setMediaController(mediaController)
                mediaController!!.setAnchorView(videoView)
            }
        }

        btnKembali.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}