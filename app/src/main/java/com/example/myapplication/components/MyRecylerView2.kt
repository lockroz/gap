package com.example.myapplication.components


import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.BlankFragment
import com.example.myapplication.R
import com.example.myapplication.models.Category


class CategoryAdapter2(private val context: BlankFragment, private var categories: Array<Category>?) :
    RecyclerView.Adapter<com.example.myapplication.components.ListItem1>(), ListAdapter {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.example.myapplication.components.ListItem1 {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category2, parent, false)
        return ListItem1(itemView)
    }



    override fun getItemCount(): Int = categories?.size ?: 0

    override fun onBindViewHolder(ListItem1 : com.example.myapplication.components.ListItem1, position: Int) {
        val category = categories?.get(position)

        category?.let { ListItem1.categoryImageView1.setImageResource(it.imageResourceId) }
        ListItem1.categoryTextView1.text = category?.name
        ListItem1.coursesTextView1.text = category?.courses?.joinToString(", ") { it.name }



    }
//    fun setCategories(newCategories: List<Category>) {
//        categories = newCategories
//        notifyDataSetChanged()
//    }
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
