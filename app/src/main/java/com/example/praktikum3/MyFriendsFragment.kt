package com.example.praktikum3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriends>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriends(Nama = "Rahayu Fitria", Jkel = "Perempuan", Email = "rahayufitria1212@gmail.com",
        Tlp = "089653375xxx", Alamat = "Jl.J.A.Suprapto 2E")
        )
        listTeman.add(MyFriends(Nama = "Livia DIta", Jkel = "Perempuan", Email = "dita@gmail.com",
        Tlp = "088765378xxx", Alamat = "Jl.Sawojajar Gg 5")
        )
        listTeman.add(MyFriends(Nama = "Nimas Ayu", Jkel = "Perempuan", Email = "nimas@gmail.com",
            Tlp = "0887875378xxx", Alamat = "Jl.Mawar Gg 5")
        )
        listTeman.add(MyFriends(Nama = "Shafira", Jkel = "Perempuan", Email = "fira@gmail.com",
            Tlp = "08876598548xxx", Alamat = "Jl.Mergan Gg 5")
        )
        listTeman.add(MyFriends(Nama = "Emilia Kartika", Jkel = "Perempuan", Email = "ahjumma@gmail.com",
            Tlp = "0887653765xxx", Alamat = "Jl.Sanan Gg 7")
        )
        listTeman.add(MyFriends(Nama = "Khoiru Najib", Jkel = "Laki-Laki", Email = "najib@gmail.com",
            Tlp = "098765378xxx", Alamat = "Perum Citra Land")
        )
    }

    private fun tampilTeman() {
        rv_listmyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listmyfriends.adapter=MyFriendsAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}