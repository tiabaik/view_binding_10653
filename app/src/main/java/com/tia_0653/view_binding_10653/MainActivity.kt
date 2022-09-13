package com.tia_0653.view_binding_10653

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tia_0653.view_binding_10653.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(TaskList.taskList)
        binding?.taskRv?.adapter = adapter
    }

    override fun onDestroy(){
        super.onDestroy()
        binding = null
    }
}