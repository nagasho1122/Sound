package com.nagase.nagasho.sound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drumSound = MediaPlayer.create(this, R.raw.drum_sound)
        val guitarSound = MediaPlayer.create(this, R.raw.guitar_sound)
        val pianoSound = MediaPlayer.create(this, R.raw.piano_sound)

        drumImage.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN){
                drumImage.setImageResource(R.drawable.drum_playing_image)
                //再生音を初めに戻す
                drumSound.seekTo(0)

                drumSound.start()
            }
            else if (event.action == MotionEvent.ACTION_UP){
                drumImage.setImageResource(R.drawable.drum_image)
            }
            true
        }
        guitarImage.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN){
                guitarImage.setImageResource(R.drawable.guitar_playing_image)
                //再生音を初めに戻す
                guitarSound.seekTo(0)

                guitarSound.start()
            }
            else if (event.action == MotionEvent.ACTION_UP){
                guitarImage.setImageResource(R.drawable.guitar_image)
            }
            true
        }
        pianoImage.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN){
                pianoImage.setImageResource(R.drawable.piano_playing_image)
                //再生音を初めに戻す
                pianoSound.seekTo(0)

                pianoSound.start()
            }
            else if (event.action == MotionEvent.ACTION_UP){
                pianoImage.setImageResource(R.drawable.piano_image)
            }
            true
        }


    }
}