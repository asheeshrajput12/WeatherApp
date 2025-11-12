package com.asheeshk.firstactivity

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelStore
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        try {
            viewModel=MainViewModel()
            viewModel.strUderDate.observe(this@MainActivity, Observer {
                strUserName->
                findViewById<TextView>(R.id.mainTextView).text=strUserName
            })


        }catch (e:Exception){
            e.printStackTrace()
        }

    }

    suspend fun getDataFromApi(){
        try {
            CoroutineScope(Dispatchers.IO).launch {
                // getting from db


                withContext(Dispatchers.Main){
                    // main thread
                }
            }

        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}