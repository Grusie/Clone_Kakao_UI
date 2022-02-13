package com.grusie.clone_kakao_ui

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.FragmentTransaction
import com.grusie.clone_kakao_ui.databinding.ActivityMainBinding
import com.grusie.clone_kakao_ui.databinding.FragmentChatBinding


class MainActivity : AppCompatActivity() {
    val binding by lazy{ ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configureBottomNavigation()
    }

    @SuppressLint("InflateParams")
    private fun configureBottomNavigation() {
        binding.fragmentList.adapter = MainFragmentStatePagerAdapter(supportFragmentManager, 5)
        binding.navigationBar.setupWithViewPager(binding.fragmentList)

        val navigationBottomList : View = this.layoutInflater.inflate(R.layout.navigation_bottom_list,null,false)

        binding.apply {
            navigationBar.getTabAt(USER_FRAG)!!.customView = navigationBottomList.findViewById(R.id.btn_userFragment)
            navigationBar.getTabAt(CHAT_FRAG)!!.customView = navigationBottomList.findViewById(R.id.btn_chatFragment)
            navigationBar.getTabAt(VIEW_FRAG)!!.customView = navigationBottomList.findViewById(R.id.btn_viewFragment)
            navigationBar.getTabAt(SHOPPING_FRAG)!!.customView = navigationBottomList.findViewById(R.id.btn_shoppingFragment)
            navigationBar.getTabAt(PLUS_FRAG)!!.customView = navigationBottomList.findViewById(R.id.btn_plusFragment)
        }
    }
}