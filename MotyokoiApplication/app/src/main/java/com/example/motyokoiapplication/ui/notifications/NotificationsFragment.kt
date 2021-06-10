package com.example.motyokoiapplication.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
//import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.motyokoiapplication.R
//import kotlinx.android.synthetic.main..*

class NotificationsFragment : Fragment() {

    //    private lateinit var notificationViewModel: NotificationViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // super.onViewCreated(view, savedInstanceState)
        var MenuList = arrayListOf<Menu>(
            Menu("カレーライス","小231円 中264円 大352円",R.drawable.curry),
            Menu("チキンクリームシチュー","220円",R.drawable.creamstew),
            Menu("蒸し鶏とほうれん草の和え物","88円",R.drawable.hourenn),
            Menu("濃厚煮干しラーメン","中440円 大506円",R.drawable.ramen),
            Menu("鮭丼","473円",R.drawable.syake),
            Menu("辛旨汁なし担々麵","462円",R.drawable.tantan),
            Menu("天ぷら根菜うどん","中418円 大484円",R.drawable.udon),
            Menu("麻辣チキン","352円",R.drawable.ma_ra_ckn),
            Menu("味噌チゲ","308円",R.drawable.chige),
            Menu("冬の惣菜トリオ","110円",R.drawable.threebg),

        )   
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
        var list_view_menu: ListView = root.findViewById<ListView>(R.id.list_view_menu)

        //アダプターにユーザーリストを導入
        val Adapter = activity?.let { MenuAdapter(it, MenuList) }
//        val layoutManager = GridLayoutManager(this, 4, GridLayoutManager.VERTICAL, false)

        //リストビューにアダプターを設定
        list_view_menu.adapter = Adapter
//        list_view_menu.adapter = GridLayoutManager(this,2,RecyclerView.VERTICAL, false)
        //  dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)

       
        
        //val textView: TextView = root.findViewById(R.id.text_dashboard)
        // dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
        //textView.text = it
        //  })
        return root
    }


}