package com.example.motyokoiapplication.ui.notifications

import android.content.Context
import android.view.LayoutInflater
import android.widget.BaseAdapter
import android.view.View
import android.widget.ImageView
import android.view.ViewGroup
import android.widget.*
import com.example.motyokoiapplication.R
//import com.example.motyokoiapplication.ui.notifications.Menu

class MenuAdapter(val context: Context, val MenuList: ArrayList<com.example.motyokoiapplication.ui.notifications.Menu>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val menu = MenuList[position]
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_menu, null)
        val Name = view.findViewById<TextView>(R.id.name_tv)
        Name?.text = menu.name
        val Price =  view.findViewById<TextView>(R.id.price_tv)
        Price?.text = menu.price
        var imageView = view?.findViewById<ImageView>(R.id.imageIcon)
        imageView?.setImageResource(menu.imageId)



        return view
    }

    override fun getItem(position: Int): Any {
        return MenuList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return MenuList.size
    }
}