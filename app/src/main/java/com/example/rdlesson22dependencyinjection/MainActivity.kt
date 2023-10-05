package com.example.rdlesson22dependencyinjection

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val resultText: TextView = findViewById(R.id.main_tv)
        val resultBtn: Button = findViewById(R.id.result_btn)

        val viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        resultBtn.setOnClickListener {
            viewModel.getData()
        }
        viewModel.uiState.observe(this){uiState->
            when(uiState) {
                is MyViewModel.UIState.Empty -> Unit
                is MyViewModel.UIState.Result -> {
                    resultText.text = uiState.title
                }
                is MyViewModel.UIState.Processing -> resultText.text = "Processing"
                is MyViewModel.UIState.Error ->{
                    resultText.text = ""
                    Toast.makeText(this,uiState.description, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}