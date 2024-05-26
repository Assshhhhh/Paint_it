package com.example.paintit

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paintit.PaintView.Companion.colorList
import com.example.paintit.PaintView.Companion.currentBrush
import com.example.paintit.PaintView.Companion.pathList
import com.example.paintit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object{

        var path = Path()
        var paintBrush = Paint()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.black.setOnClickListener{
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        binding.red.setOnClickListener{
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        binding.green.setOnClickListener{
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }

        binding.blue.setOnClickListener{
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        binding.yellow.setOnClickListener{
            paintBrush.color = Color.YELLOW
            currentColor(paintBrush.color)
        }

        binding.white.setOnClickListener{
            pathList.clear()
            colorList.clear()
            path.reset()

           /* paintBrush.color = Color.WHITE
            currentColor(paintBrush.color)*/

        }

    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }

}