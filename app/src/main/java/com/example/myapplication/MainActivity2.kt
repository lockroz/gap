package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.fragment.app.commit
import com.example.myapplication.models.Category
import com.example.myapplication.models.SharedViewModel

class MainActivity2 : AppCompatActivity() {
    private val viewModel: SharedViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var selectedCategories = intent.getSerializableExtra("selectedCategories") as Array<Category>?
        Log.d("MainActivity", "Selected Categories: $selectedCategories")
        viewModel.setSelectedCategories(selectedCategories)



//        val fragment = BlankFragment3()
//        fragment.selectedCategories = selectedCategories
        supportFragmentManager.commit {
            add(R.id.mago, BlankFragment::class.java, null)
            setReorderingAllowed(true)
        }
    }
}