package com.example.motyokoiapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.motyokoiapplication.R
import com.example.motyokoiapplication.ui.dashboard.User

class DashboardFragment : Fragment() {

//    private lateinit var dashboardViewModel: DashboardViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
       // super.onViewCreated(view, savedInstanceState)
        var UserList = arrayListOf<User>(
                User("伊藤　精英","itokiyo@fun.ac.jp","3階 325室",R.drawable.yes_room),
                User("伊藤　恵","kei@fun.ac.jp","3階 332室",R.drawable.no_room),
                User("稲村　浩","inamura@fun.ac.jp","2階 225室",R.drawable.yes_room),
                User("ヴァランス・マイケル","michael@fun.ac.jp","5階 526室",R.drawable.yes_room),
                User("大澤　英一","osawa@fun.ac.jp","研究棟1階 605室",R.drawable.no_room),
                User("大場　みち子","michiko@fun.ac.jp","2階 223室",R.drawable.no_room),
                User("岡本　誠","maq@fun.ac.jp","2階 233室",R.drawable.yes_room),
                User("奥野　拓","okuno@fun.ac.jp","1階 124室",R.drawable.no_room),
                User("片桐　恭弘","president@fun.ac.jp","---",R.drawable.yes_room),
                User("加藤　浩仁","kkato@fun.ac.jp","研究棟1階 604室",R.drawable.no_room),
                User("香取　勇一","katori@fun.ac.jp","1階 128室",R.drawable.no_room),
                User("川口　聡","satoshi@fun.ac.jp","2階 234室",R.drawable.yes_room),
                User("川越　敏司","kawagoe@fun.ac.jp","4階 424室",R.drawable.no_room),
                User("川嶋　稔夫","kawasima@fun.ac.jp","研究棟1階 603室",R.drawable.no_room),
                User("姜　南圭","kang@fun.ac.jp","2階 231室",R.drawable.yes_room),
                User("木村　健一","kimura@fun.ac.jp","1階 131室",R.drawable.no_room),
                User("齊藤　朝輝","saito@fun.ac.jp","研究棟1階 654室",R.drawable.no_room),
                User("櫻沢　繁","sakura@fun.ac.jp","3階 334室",R.drawable.yes_room),
                User("佐々木　博昭","hsasaki@fun.ac.jp","4階 431室",R.drawable.yes_room),
                User("佐藤　生馬","ikuma-is@fun.ac.jp","2階 230室",R.drawable.yes_room),
                User("佐藤　直行","satonao@fun.ac.jp","2階 235室",R.drawable.no_room),
                User("佐藤　仁樹","jamisato@fun.ac.jp","3階 323室",R.drawable.yes_room),
                User("姜　暁鴻","jiang@fun.ac.jp","2階 226室",R.drawable.yes_room),
                User("ジョンソン・アンドリュー","andy@fun.ac.jp","5階 529室",R.drawable.no_room),
                User("白石　陽","siraisi@fun.ac.jp","3階 328室",R.drawable.no_room),
                User("白勢　政明","shirase@fun.ac.jp","2階 229室",R.drawable.no_room),
                User("鈴木　恵二","kjsuzuki@fun.ac.jp","3階 330室",R.drawable.no_room),
                User("鈴木　昭二","ssuzuki@fun.ac.jp","研究棟1階 610室",R.drawable.no_room),
                User("角　薫","kaorus@fun.ac.jp","2階 227室",R.drawable.no_room),
                User("角　康之","sumi@fun.ac.jp","1階 126室",R.drawable.yes_room),
                User("スミス・アダム","adam@fun.ac.jp","5階 527室",R.drawable.no_room),
                User("高木　清二","s-takagi@fun.ac.jp","3階 329室",R.drawable.no_room),
                User("高橋　信行","ntakahas@fun.ac.jp","研究棟1階 655室",R.drawable.no_room),
                User("竹川　佳成","yoshi@fun.ac.jp","1階 125室",R.drawable.yes_room),
                User("竹之内　高志","ttakashi@fun.ac.jp","4階 435室",R.drawable.no_room),
                User("田中　吉太郎","y-tanaka@fun.ac.jp","4階 434室",R.drawable.yes_room),
                User("田柳　恵美子","tayanagi@fun.ac.jp","4階 425室",R.drawable.no_room),
                User("塚田　浩二","tsuka@fun.ac.jp","1階 134室",R.drawable.no_room),
                User("辻　義人","y-tsuji@fun.ac.jp","4階 428室",R.drawable.no_room),
                User("寺井　あすか","aterai@fun.ac.jp","1階 130室",R.drawable.yes_room),
                User("寺沢　憲吾","kterasaw@fun.ac.jp","4階 423室",R.drawable.yes_room),
                User("富永　敦子","tominaga@fun.ac.jp","5階 525室",R.drawable.no_room),
                User("中小路　久美代","kumiyo@fun.ac.jp","4階 429室",R.drawable.no_room),
                User("長崎　健","nagasaki@fun.ac.jp","研究棟1階 601室",R.drawable.yes_room),
                User("中田　隆行","nakata@fun.ac.jp","3階 327室",R.drawable.no_room),
                User("中村　美智子","m-naka@fun.ac.jp","5階 524室",R.drawable.no_room),
                User("中村　嘉隆","y-nakamr@fun.ac.jp","2階 228室",R.drawable.yes_room),
                User("南部　美砂子","m-nambu@fun.ac.jp","3階 324室",R.drawable.no_room),
                User("新美　礼彦","niimi@fun.ac.jp","研究棟2階 756室",R.drawable.no_room),
                User("バゲンダ・ドミニク","bagenda@fun.ac.jp","5階 523室",R.drawable.no_room),
                User("花田　光彦","hanada@fun.ac.jp","3階 333室",R.drawable.no_room),
                User("原田　泰","haraday@fun.ac.jp","3階 331室",R.drawable.yes_room),
                User("平田　圭二","hirata@fun.ac.jp","1階 123室",R.drawable.no_room),
                User("藤野　雄一","fujino@fun.ac.jp","2階 224室",R.drawable.no_room),
                User("フランク・イアン","ianf@fun.ac.jp","研究棟1階 611室",R.drawable.yes_room),
                User("松原　克弥","matsu@fun.ac.jp","1階 127室",R.drawable.no_room),
                User("松原　仁","matsubar@fun.ac.jp","研究棟1階 609室",R.drawable.no_room),
                User("三上　貞芳","s_mikami@fun.ac.jp","研究棟1階 607室",R.drawable.no_room),
                User("美馬　のゆり","noyuri@fun.ac.jp","3階 326室",R.drawable.yes_room),
                User("美馬　義亮","mima@fun.ac.jp","1階 132室",R.drawable.no_room),
                User("宮本　エジソン　正","etm@fun.ac.jp","4階 426室",R.drawable.no_room),
                User("迎山　和司","kazushi@fun.ac.jp","1階 133室",R.drawable.yes_room),
                User("村井　源","h_murai@fun.ac.jp","4階 433室",R.drawable.no_room),
                User("安井　重哉","yasui@fun.ac.jp","1階 135室",R.drawable.yes_room),
                User("柳　英克","yanagi@fun.ac.jp","2階 232室",R.drawable.no_room),
                User("由良　文孝","yura@fun.ac.jp","研究棟1階 656室",R.drawable.no_room),
                User("リヴァーズ・ダミアン","rivers@fun.ac.jp","5階 522室",R.drawable.yes_room),
                User("リヤボフ・ウラジミール","riabov@fun.ac.jp","1階 129室",R.drawable.yes_room),
                User("ルースベン＝スチュアート・ピーター","stuart@fun.ac.jp","4階 427室",R.drawable.no_room),
                User("和田　雅昭","wada@fun.ac.jp","4階 432室",R.drawable.yes_room)
        )
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        var list_view: ListView = root.findViewById<ListView>(R.id.list_view)
       
        //アダプターにユーザーリストを導入
        val Adapter = activity?.let { ListAdapter(it, UserList) }
        
        //リストビューにアダプターを設定
       list_view.adapter = Adapter

      //  dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)

        //val textView: TextView = root.findViewById(R.id.text_dashboard)
       // dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            //textView.text = it
      //  })
        return root
    }
}