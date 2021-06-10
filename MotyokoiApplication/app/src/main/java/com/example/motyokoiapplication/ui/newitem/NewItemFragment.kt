package com.example.motyokoiapplication.ui.newitem

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.motyokoiapplication.R
import com.example.motyokoiapplication.ui.home.HomeViewModel

class NewItemFragment : Fragment(R.layout.fragment_newitem) {

    private lateinit var viewModel: NewItemViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =
            ViewModelProvider(this).get(NewItemViewModel::class.java)
        val textView: TextView = view.findViewById(R.id.text_newitem)
        viewModel.text.observe(viewLifecycleOwner, Observer {
            // Update the UI
            textView.text = it
        })
    }
}