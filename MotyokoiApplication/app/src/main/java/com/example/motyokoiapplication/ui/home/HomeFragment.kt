package com.example.motyokoiapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.motyokoiapplication.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    val image1=R.drawable.fun_1f_u
    val image2=R.drawable.fun_2f_u
    val image3=R.drawable.fun_3f_u
    val image4=R.drawable.fun_4f_u
    val image5=R.drawable.fun_5f_u
    val image6=R.drawable.fun_room


    private val map:Map<String, Int> = mapOf("1階" to image1,"2階" to image2,"3階" to image3,"4階" to image4,"5階" to image5,"空き教室" to image6)

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
            val textView: TextView = root.findViewById(R.id.text_home)
            homeViewModel.text.observe(viewLifecycleOwner, Observer {
                textView.text = it
            })
        homeViewModel.textview.observe(viewLifecycleOwner, Observer {
            map[it]?.let { resource -> root.imageView.setImageResource(resource) }
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                   val spinner = parent as? Spinner
                   val item = spinner?.selectedItem as? String

                   item?.let {
                       homeViewModel.settextview(it)
                   }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }


}
