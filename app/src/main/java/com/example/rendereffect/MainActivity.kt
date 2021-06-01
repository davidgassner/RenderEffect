package com.example.rendereffect

import android.graphics.LightingColorFilter
import android.graphics.RenderEffect
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rendereffect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.imageView.setRenderEffect(
//            RenderEffect.createBlurEffect(
//                30f,
//                30f,
//                Shader.TileMode.REPEAT
//            )
//        )

//        binding.imageView.setRenderEffect(
//            RenderEffect.createColorFilterEffect(
//                LightingColorFilter(0xFF0000, 0x000000)
//            )
//        )
    }
}