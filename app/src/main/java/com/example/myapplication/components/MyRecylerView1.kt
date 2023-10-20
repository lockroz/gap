package com.example.myapplication.components


import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.models.Category
import com.example.myapplication.models.Course


class CategoryAdapter1(private val context: MainActivity, private val courses: List<Course>) :
    RecyclerView.Adapter<ListItem2>(), ListAdapter {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListItem2{
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item_layout, parent, false)
        return ListItem2(itemView)
    }


    override fun getItemCount(): Int = courses.size

    override fun onBindViewHolder(ListItem2:ListItem2, position: Int) {
        val course = courses[position]

        ListItem2.nameTextView.text = course.name
        ListItem2.durationTextView.text = course.duration
        ListItem2.instructorTextView.text = course.instructor
        ListItem2.descriptionTextView.text = course.description
        ListItem2.locationTextView.text = course.location


    }

    override fun registerDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun unregisterDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getViewTypeCount(): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun areAllItemsEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEnabled(p0: Int): Boolean {
        TODO("Not yet implemented")
    }

}
