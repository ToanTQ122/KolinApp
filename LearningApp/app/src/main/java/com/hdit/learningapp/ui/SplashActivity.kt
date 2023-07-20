package com.hdit.learningapp.ui

import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hdit.learningapp.databinding.ActivitySplashBinding
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val anim = ValueAnimator.ofFloat(1f, 1.3f)
        val imageView: View = binding.imageSplash
        anim.duration = 400
        anim.addUpdateListener { animation ->
            imageView.scaleX = animation.animatedValue as Float
            imageView.scaleY = animation.animatedValue as Float
        }
        anim.repeatCount = 1
        anim.repeatMode = ValueAnimator.REVERSE
        anim.start()

        GlobalScope.launch {
            delay(1000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }
    }
}