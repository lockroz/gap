package com.example.myapplication

import DataRepository
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.SearchView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.components.CategoryAdapter1



class MainActivity : ComponentActivity() {
    private lateinit var navigateButton: SearchView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            val courses = DataRepository().initializeMathCourses() + DataRepository().initializeEconCourses()


            val recyclerView = findViewById<RecyclerView>(R.id.sam2)

            val adapter = CategoryAdapter1(this,courses)


            recyclerView?.adapter = adapter
            val intentToNavigateTothirds = Intent(this, MainActivity2::class.java)

            navigateButton = findViewById(R.id.mad)

            navigateButton.setOnClickListener {

                startActivity(intentToNavigateTothirds)
            }







        }
    }
