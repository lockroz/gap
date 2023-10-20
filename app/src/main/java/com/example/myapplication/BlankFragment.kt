//package com.example.myapplication
//
//import android.os.Bundle
//import android.util.Log
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.myapplication.components.CategoryAdapter2
//
//class BlankFragment : Fragment() {
//
//
//    companion object {
//        fun newInstance() = BlankFragment()
//    }
//// private val viewModel: BlankViewModel by viewModels()
//    private val viewModel = (activity as? MainActivity2)?.viewModel
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // TODO: Use the ViewModel
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val view = inflater.inflate(R.layout.fragment_blank, container, false)
//        val selectedCategories = viewModel?.getSelectedCategories()?.value
//
//
//
//                // Render the selected categories in the RecyclerView
//                Log.d("eee", "onCreateView: ${selectedCategories}")
//                val recyclerView = view.findViewById<RecyclerView>(R.id.gridView2)
//                val adapter = CategoryAdapter2(this, selectedCategories)
//                recyclerView.adapter = adapter
//
//
//        return view
//    }
//}