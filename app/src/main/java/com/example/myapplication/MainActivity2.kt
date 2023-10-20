package com.example.myapplication

import DataRepository
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.components.CategoryAdapter2
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity2 : AppCompatActivity() {
    private val viewModel: MainActivityViewModel by lazy {
        ViewModelProvider(this).get(MainActivityViewModel::class.java)
    }
    private val recyclerView: RecyclerView by lazy {
        findViewById(R.id.sam4)
    }
    private val searchView: androidx.appcompat.widget.SearchView by lazy {
        findViewById(R.id.categoryImageView1)
    }

    private val courses =
        DataRepository().initializeMathCourses() + DataRepository().initializeEconCourses()

    // Initialize your courses here
    private val adapter = CategoryAdapter2(this, courses)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val courses =
            DataRepository().initializeMathCourses() + DataRepository().initializeEconCourses()
        val adapter = CategoryAdapter2(this, courses)
        recyclerView.adapter = adapter


        viewModel.searchQuery.observe(this) { searchText ->
            CoroutineScope(Dispatchers.IO).launch {
                val filteredCourses = courses.filter { course ->
                    searchText?.let {
                        course.duration.contains(it, ignoreCase = true)
                    } ?: false
                }


                // Update the adapter on the main thread
                runOnUiThread {
                    adapter.filteredCourses = filteredCourses
                    adapter.notifyDataSetChanged()
                }
            }
        }

        searchView.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
//                searchQuery.value = query
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    adapter.filter(newText)
                }
//                searchQuery.value = newText
                return true

            }
        }

        )
        adapter.notifyDataSetChanged()

    }


}
