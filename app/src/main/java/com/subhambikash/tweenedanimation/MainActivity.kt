package com.subhambikash.tweenedanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var imageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.imageView)

        val animation=AnimationUtils.loadAnimation(this,R.anim.all_animation)
        imageView.animation=animation
        animation.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationStart(p0: Animation?) {

            }
            override fun onAnimationEnd(p0: Animation?) {
                startActivity(Intent(this@MainActivity
                ,MainActivity2::class.java))
                Toast.makeText(this@MainActivity,"rotate complete",Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationRepeat(p0: Animation?) {

            }

        })

        
    }




}