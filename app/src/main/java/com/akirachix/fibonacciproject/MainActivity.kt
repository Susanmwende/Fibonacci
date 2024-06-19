package com.akirachix.fibonacciproject

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonacciproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var number = fibonacci(100)
        binding.rvNums.layoutManager = LinearLayoutManager(this)
        val fibonacciAdapter = NumbersRecyclerViewAdapter(number)
        binding.rvNums.adapter = fibonacciAdapter

    }
    fun fibonacci(num:Int):List<Int>{
        val number = mutableListOf(0,1)
        while (number.size<num){
            number.add(number[number.lastIndex]+number[number.lastIndex-1])
        }
        return number
    }
    }
