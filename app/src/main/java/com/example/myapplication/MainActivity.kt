package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
import com.example.myapplication.models.DataRepository

class MainActivity : ComponentActivity() {
    lateinit private var navigateButton: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            val categories = DataRepository().initializeCategories()


            val recyclerView = findViewById<RecyclerView>(R.id.gridView1)

            val adapter = CategoryAdapter1(this,categories)


            recyclerView?.adapter = adapter
            val intentToNavigateTothirds = Intent(this, MainActivity2::class.java)

            navigateButton = findViewById(R.id.mad)

            navigateButton.setOnClickListener {
                intentToNavigateTothirds.putExtra("selectedCategories", adapter.getSelectedCategories().toTypedArray())

                startActivity(intentToNavigateTothirds)
            }







        }
    }
