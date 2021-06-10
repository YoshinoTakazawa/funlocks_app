package com.example.motyokoiapplication.ui.dashboard

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.example.motyokoiapplication.R
//import com.example.motyokoiapplication.ui.notifications.User

class ListAdapter(val context: Context, val UserList: ArrayList<User>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val user = UserList[position]
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_user, null)
        val Name = view.findViewById<TextView>(R.id.name_tv)
        Name?.text = user.name
        val Email = view.findViewById<TextView>(R.id.email_tv)
            Email?.text = user.email
        val Place =  view.findViewById<TextView>(R.id.place_tv)
            Place?.text = user.place
        var imageView = view?.findViewById<ImageView>(R.id.imageIcon)
        imageView?.setImageResource(user.imageId)
        
        
        
        return view
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return UserList.size
    }
}