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



class CategoryAdapter1(private val context: MainActivity, private val categories: List<Category>, ) :
    RecyclerView.Adapter<com.example.myapplication.components.ListItem>(), ListAdapter {
    private val selectedCategories = HashSet<Category>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.example.myapplication.components.ListItem {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item_layout, parent, false)
        return ListItem(itemView)
    }



    override fun getItemCount(): Int = categories.size

    override fun onBindViewHolder(ListItem : com.example.myapplication.components.ListItem, position: Int) {
        val category = categories[position]

        ListItem.categoryImageView.setImageResource(category.imageResourceId)
        ListItem.categoryTextView.text = category.name
        ListItem.coursesTextView.text = category.courses.joinToString(", ") { it.name }
        ListItem.categoryCheckBox.isChecked = category in selectedCategories

        ListItem.categoryCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                selectedCategories.add(category)
            } else {
                selectedCategories.remove(category)
            }
        }

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

    fun getSelectedCategories(): Set<Category> {
        return selectedCategories
    }
}